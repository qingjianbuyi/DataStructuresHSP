package com.atguigu.linkedlist;


public class DoubleLinkedList {
    private final GeneralNode head = new GeneralNode(-1);

    // 删除
    public void delete(GeneralNode node) {
        GeneralNode target = find(node);
        if (target.getNumber() == -1) {
            return;
        }

        GeneralNode pre = target.getPre();
        GeneralNode next = target.getNext();
        if (next == null) { // 说明target是最后一个节点
            pre.setNext(null);
        } else {
            pre.setNext(next);
            next.setPre(pre);
        }
    }

    // 查询
    public GeneralNode find(GeneralNode target) {
        if (isEmpty()) {
            System.out.println("find(): 链表为空");
            return head;
        }

        GeneralNode mem = head.getNext();
        while (mem != null) {
            if (mem.getNumber() == target.getNumber()) {
                return mem;
            }
            mem = mem.getNext();
        }
        System.out.println("没找到节点");
        return head;
    }

    // 修改
    public void update(GeneralNode newNode) {
        if (isEmpty()) {
            System.out.println("update(): 链表空");
            return;
        }

        GeneralNode tmp = head.getNext();
        boolean exit = false;
        while (tmp != null) {
            if (tmp.getNumber() == newNode.getNumber()) {
                exit = true;
                break;
            }
            tmp = tmp.getNext();
        }
        if (exit) {
            tmp.setName(newNode.getName());
            tmp.setNickName(newNode.getNickName());
        } else {
            System.out.println("不存在该节点");
        }
    }

    // 插入
    public void append(GeneralNode node) {
        GeneralNode tmp = head;
        // 找到节点的尾部
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
        }
        tmp.setNext(node);
        node.setPre(tmp);
    }


    // 工具类
    public void show() {
        if (isEmpty()) {
            System.out.println("show(): 链表为空");
            return;
        }

        GeneralNode tmp = head.getNext();
        while (tmp != null) {
            System.out.println(tmp);
            tmp = tmp.getNext();
        }
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }

        int count = 0;
        GeneralNode tmp = head.getNext();
        while (tmp != null) {
            count++;
            tmp = tmp.getNext();
        }
        return count;
    }

    public boolean isEmpty() {
        return head.getNext() == null;
    }

    /**
     * 返回头节点
     *
     * @return head
     */
    public GeneralNode getHead() {
        return head;
    }
}
