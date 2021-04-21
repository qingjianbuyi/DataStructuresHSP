package com.atguigu.linkedlist;

public class TestDoubleLinkedList {
    public static void main(String[] args) {
        testDelete();
    }

    private static void testDelete() {
        GeneralNode bei = new GeneralNode(1, "刘备", "刘玄德");
        GeneralNode yu = new GeneralNode(2, "关羽", "关云长");
        GeneralNode fei = new GeneralNode(3, "张飞", "张翼德");
        GeneralNode chao = new GeneralNode(4, "马超", "马孟起");

        DoubleLinkedList dll = new DoubleLinkedList();
        dll.append(bei);
        dll.append(yu);
        dll.append(fei);
        System.out.println("删除前: ");
        dll.show();
        System.out.println("删除后: ");
        dll.delete(fei);
        dll.show();
        System.out.println("删除不存在的节点: ");
        dll.delete(chao);

    }

    private static void testFind() {
        GeneralNode bei = new GeneralNode(1, "刘备", "刘玄德");
        GeneralNode yu = new GeneralNode(2, "关羽", "关云长");
        GeneralNode fei = new GeneralNode(3, "张飞", "张翼德");
        GeneralNode chao = new GeneralNode(4, "马超", "马孟起");

        DoubleLinkedList dll = new DoubleLinkedList();
        dll.append(bei);
        dll.append(yu);
        dll.append(fei);
        dll.show();
        System.out.println("==========");
        System.out.println(dll.find(fei));
        System.out.println(dll.find(yu));
        System.out.println(dll.find(bei));
        System.out.println(dll.find(chao));

    }

    public static void testUpdate(){
        GeneralNode bei = new GeneralNode(1, "刘备", "刘玄德");
        GeneralNode xiaoBei = new GeneralNode(1, "刘皇叔", "汉中王");
        GeneralNode yu = new GeneralNode(2, "关羽", "关云长");
        GeneralNode fei = new GeneralNode(3, "张飞", "张翼德");
        GeneralNode chao = new GeneralNode(4, "马超", "马孟起");

        DoubleLinkedList dll = new DoubleLinkedList();
//        dll.update(xiaoBei);
        dll.append(bei);
        dll.update(xiaoBei);
        dll.append(yu);
        dll.append(fei);
        dll.update(chao);
        dll.show();
    }

    public static void testIsEmpty(){
        GeneralNode bei = new GeneralNode(1, "刘备", "刘玄德");

        DoubleLinkedList dll = new DoubleLinkedList();
        System.out.println(dll.isEmpty());
        dll.append(bei);
        System.out.println(dll.isEmpty());
    }

    public static void testSize(){
        GeneralNode bei = new GeneralNode(1, "刘备", "刘玄德");
        GeneralNode yu = new GeneralNode(2, "关羽", "关云长");
        GeneralNode fei = new GeneralNode(3, "张飞", "张翼德");

        DoubleLinkedList dll = new DoubleLinkedList();
        System.out.println(dll.size());
        dll.append(bei);
        System.out.println(dll.size());
        dll.append(yu);
        System.out.println(dll.size());
        dll.append(fei);
        System.out.println(dll.size());
    }

    public static void testAppendAndShow(){
        GeneralNode bei = new GeneralNode(1, "刘备", "刘玄德");
        GeneralNode yu = new GeneralNode(2, "关羽", "关云长");
        GeneralNode fei = new GeneralNode(3, "张飞", "张翼德");

        DoubleLinkedList dll = new DoubleLinkedList();
        dll.show();

        dll.append(bei);
        dll.append(yu);
        dll.append(fei);
        dll.show();
    }
}
