package com.atguigu.linkedlist;

import java.util.Stack;

/*
成员变量:
    head, 头结点,不存放数据

成员方法:
    插入:
        尾部插入
        头部插入
        有序插入
    删除:

    修改:


    查询:
        根据节点编号查询
            当前节点
            当前节点的前一个节点
        根据index,链表位置查询
            正向计数第index个
            反向计数第index个

    翻转:

关键操作:
    判断当前节点是否是尾节点: cur.getNext() == null; 空链表的头结点即尾节点
    判断当前节点是否为空: cur == null; 表示进入链表的无效数据区域
 */
public class SingleLinkedList {
    private final HeroNode head = new HeroNode(-1);

    public SingleLinkedList() {

    }
    // 倒叙打印
    public  void reverseShow(){
        if (size() < 1){
            show();
            return;
        }

        Stack<HeroNode> stack = new Stack<>();
        HeroNode tmp = head.getNext();
        while (tmp != null){
            stack.push(tmp);
            tmp = tmp.getNext();
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }


    // 翻转
    public void reverse(){
        if (size() <= 1){
            return;
        }

        HeroNode curr = head.getNext();
        HeroNode next = null;
        HeroNode reverseHead = new HeroNode(-1);
        while (curr != null){
            next = curr.getNext();
            curr.setNext(reverseHead.getNext());
            reverseHead.setNext(curr);
            curr = next;
        }
        head.setNext(reverseHead.getNext());
    }

    // 修改
    public void update(HeroNode node){
        HeroNode target = find(node);
        if (target.getNumber() == -1){
            System.out.println("未找到要修改的节点");
            return;
        }
        target.setName(node.getName());
        target.setNickName(node.getNickName());
    }


    // 删除
    public void delete(int k){
        if (k < 1 || k > size()){
            System.out.println("invalid index");
            return;
        }
        HeroNode pre = index(k-1);
        if (pre == null){
            System.out.println("未找到要删除的节点");
            return;
        }
        pre.setNext(pre.getNext().getNext());
    }

    public void delete(HeroNode node){
        HeroNode pre = findPre(node);
        if (pre == null){
            System.out.println("未找到要删除的节点");
            return;
        }
        pre.setNext(pre.getNext().getNext());
    }

    // 查询
    public HeroNode lastIndex(int k) {
        if (k >= 0) {
            System.out.println("k must be negative");
            return null;
        }

        k = size() + 1 + k;
        return index(k);
    }

    public HeroNode index(int k) {
        if (k < 0 || k > size()) {
            System.out.println("invalid index");
            return null;
        }

        if (isEmpty() || k == 0) {
            return head;
        }

        HeroNode tmp = head;
        for (int i = 1; i <= k; i++) {
            tmp = tmp.getNext();
        }
        return tmp;
    }

    public HeroNode findPre(HeroNode target) {
        if (isEmpty()) {
            return null;
        }

        HeroNode tmp = head;
        HeroNode curr = head.getNext();
        while (curr != null) {
            if (curr.getNumber() == target.getNumber()) {
                return tmp;
            }
            tmp = curr;
            curr = curr.getNext();
        }
        return null;
    }

    public HeroNode find(HeroNode target) {
        HeroNode member = head; // 默认为头节点表示没找到
        if (isEmpty()) {
            return member;
        }
        HeroNode tmp = head.getNext();
        while (tmp != null) {
            if (tmp.getNumber() == target.getNumber()) {
                member = tmp;
                break;
            }
            tmp = tmp.getNext();
        }
        return member;
    }

    // 添加
    public void append(HeroNode node) {
        tail().setNext(node);
    }

    public void headInsert(HeroNode node) {
        HeroNode next = head.getNext();
        head.setNext(node);
        node.setNext(next);
    }

    public void sortInsert(HeroNode node) {
        if (isEmpty()) {
            append(node);
            return;
        }

        boolean exit = false; // 假设要插入的node在链表中不存在
        HeroNode tmp = head;
        while (true) {
            if (isTail(tmp)) {
                break;
            }
            if (tmp.getNext().getNumber() == node.getNumber()) {
                exit = true;
                break;
            }
            if (tmp.getNext().getNumber() > node.getNumber()) {
                break;
            }
            tmp = tmp.getNext();
        }
        if (exit) {
            System.out.println("sortInsert(): 节点已经存在");
            return;
        }
        node.setNext(tmp.getNext());
        tmp.setNext(node);
    }


    // 工具方法
    public boolean isTail(HeroNode node) {
        return node.getNext() == null;
    }

    public HeroNode tail() {
        HeroNode tmp = head;
        while (!isTail(tmp)) {
            tmp = tmp.getNext();
        }
        return tmp;
    }

    public boolean isEmpty() {
        return tail().getNumber() == -1;
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("show(): 空链表");
            return;
        }
        HeroNode curr = head.getNext();
        while (true) {
            System.out.println(curr);
            if (isTail(curr)) {
                break;
            }
            curr = curr.getNext();
        }
    }

    /**
     * 有效节点个数
     *
     * @return
     */
    public int size() {
        if (isEmpty()) {
            return 0;
        }

        HeroNode curr = head.getNext();
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.getNext();
        }
        return count;
    }

}
