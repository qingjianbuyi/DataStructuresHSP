package com.atguigu.linkedlist;

public class GeneralNode {
    private int number;
    private String name;
    private String nickName;
    private GeneralNode next;
    private GeneralNode pre;

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

    public GeneralNode getNext() {
        return next;
    }

    public void setNext(GeneralNode next) {
        this.next = next;
    }

    public GeneralNode getPre() {
        return pre;
    }

    public void setPre(GeneralNode pre) {
        this.pre = pre;
    }

    public int getNumber() {
        return number;
    }

    public GeneralNode(int number) {
        this.number = number;
    }

    public GeneralNode(int number, String name, String nickName) {
        this.number = number;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "GeneralNode{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
