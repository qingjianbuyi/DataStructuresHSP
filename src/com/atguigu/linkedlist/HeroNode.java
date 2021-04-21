package com.atguigu.linkedlist;

public class HeroNode {
    private final int number;
    private String name;
    private String nickName;
    private HeroNode next;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getNumber() {
        return number;
    }

    public HeroNode getNext() {
        return next;
    }

    public void setNext(HeroNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    public HeroNode(int number) {
        this.number = number;
    }

    public HeroNode(int number, String name, String nickName) {
        this.number = number;
        this.name = name;
        this.nickName = nickName;
    }
}
