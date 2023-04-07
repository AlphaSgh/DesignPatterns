package com.ssgh.prototypePattern;

public class Attachment {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void downLoad() {
        System.out.println("down attachment name: " + name);
    }

}
