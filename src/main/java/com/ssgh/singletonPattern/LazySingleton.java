package com.ssgh.singletonPattern;

//懒汉单例模式+ synchronized
//懒汉式单例在第一次调用getInstance()方法时实例化，在类加载时并不自行实例化，这种技术又称为延迟加载(Lazy Load)技术，
// 即需要的时候再加载实例，为了避免多个线程同时调用getInstance()方法，我们可以使用关键字synchronized，

/**
 * 饿汉式单例类在类被加载时就将自己实例化，它的优点在于无须考虑多线程访问问题，可以确保实例的唯一性；
 * 从调用速度和反应时间角度来讲，由于单例对象一开始就得以创建，因此要优于懒汉式单例。但是无论系统在运行时是否需要使用该单例对象，
 * 由于在类加载时该对象就需要创建，因此从资源利用效率角度来讲，饿汉式单例不及懒汉式单例，而且在系统加载时由于需要创建饿汉式单例对象，加载时间可能会比较长。
 */
public class LazySingleton {
    private volatile static LazySingleton instance = null;

    private LazySingleton() {
    }

    synchronized public static LazySingleton getInstance() {
/*        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
*/
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null)
                    instance = new LazySingleton();
            }
        }
        return instance;
    }
    /**
     * 使用以上代码来实现单例，还是会存在单例对象不唯一。原因如下：
     *       假如在某一瞬间线程A和线程B都在调用getInstance()方法，此时instance对象为null值，均能通过instance == null的判断。
     *       由于实现了synchronized加锁机制，线程A进入synchronized锁定的代码中执行实例创建代码，线程B处于排队等待状态，必须等待线程A执行完毕后才可以进入synchronized锁定代码。
     *       但当A执行完毕时，线程B并不知道实例已经创建，将继续创建新的实例，导致产生多个单例对象，违背单例模式的设计思想，
     *       因此需要进行进一步改进，在synchronized中再进行一次(instance == null)判断，这种方式称为双重检查锁定(Double-Check Locking)。
     *       使用双重检查锁定实现的懒汉式单例类
     *
     */
}
