package com.ssgh.prototypePattern;

public class ClientMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        WeeklyLog log_previous  = new WeeklyLog();
        Attachment attachment = new Attachment();
        attachment.setName("ssgh attachment");
        String str = new String("ssgh");
        log_previous.setName(str);
        log_previous.setDate("12");
        log_previous.setContent("work");
        log_previous.setAttachment(attachment);
        System.out.println("周报：");
        System.out.println("name: " + log_previous.getName());
        System.out.println("date: " + log_previous.getDate());
        System.out.println("content: " + log_previous.getContent());
        System.out.println("attachment: " + log_previous.getAttachment().getName());

        WeeklyLog log_new;
        log_new = log_previous.clone();
        System.out.println("周报：");
        System.out.println("name: " + log_new.getName());
        System.out.println("date: " + log_new.getDate());
        System.out.println("content: " + log_new.getContent());
        System.out.println("attachment: " + log_new.getAttachment().getName());
        //比较周报
        System.out.println("周报是否相同？ " + (log_previous ==  log_new));//false
        //比较附件
        System.out.println("附件是否相同？ " +  (log_previous.getAttachment() == log_new.getAttachment()));//true

        System.out.println(log_previous.getDate() == log_new.getDate());

        System.out.println(log_previous.getName() == log_new.getName());

        System.out.println(log_previous.getContent() == log_new.getContent());



    }
}
