package com.ssgh.adapterPattern;

import org.w3c.dom.ls.LSOutput;

public class ClientMain {
    public static void main(String[] args) {
        OperationAdapter adapter = new OperationAdapter();
        int[] scores = {84,76,50,69,90,91,88,96}; //定义成绩数组
        int[] result;
        int score;

        System.out.println("成绩排序结果");
        result = adapter.sort(scores);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        System.out.println("查找成绩90");
        score = adapter.search(result, 90);
        if (score != -1) {
            System.out.println("find");
        } else {
            System.out.println("not find");
        }
        System.out.println("查找成绩92");
        score = adapter.search(result, 92);
        if (score != -1) {
            System.out.println("find");
        } else {
            System.out.println("not find");
        }
    }
}
