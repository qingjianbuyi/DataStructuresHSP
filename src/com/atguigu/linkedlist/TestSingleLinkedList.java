package com.atguigu.linkedlist;

public class TestSingleLinkedList {
    public static void main(String[] args) {
        testSortInsert();
    }

    private static void testReverseShow() {
        HeroNode wuYong = new HeroNode(3, "吴用", "智多星");
        HeroNode huYanZhuo = new HeroNode(7, "呼延灼", "双鞭");
        HeroNode xiaoLin = new HeroNode(6, "小林", "豹子头~~");
        HeroNode luJunYi = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode[] heroNodes = {wuYong, huYanZhuo, xiaoLin, luJunYi};

        SingleLinkedList sll = new SingleLinkedList();
        for (HeroNode heroNode : heroNodes) {
            sll.sortInsert(heroNode);
        }
        System.out.println("正常输出: ");
        sll.show();
        System.out.println("倒叙输出: ");
        sll.reverseShow();
    }

    private static void testReverse() {
        HeroNode huYanZhuo = new HeroNode(7, "呼延灼", "双鞭");
        HeroNode xiaoLin = new HeroNode(6, "小林", "豹子头~~");
        HeroNode luJunYi = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode wuYong = new HeroNode(3, "吴用", "智多星");

        SingleLinkedList sll = new SingleLinkedList();
        sll.append(huYanZhuo);
        sll.reverse();
        sll.show();
        System.out.println("=======");
        sll.append(xiaoLin);
        sll.append(luJunYi);
        sll.append(wuYong);
        System.out.println("翻转前:");
        sll.show();
        sll.reverse();
        System.out.println("翻转后:");
        sll.show();
    }

    private static void testUpdate() {
        HeroNode linChong = new HeroNode(6, "林冲", "豹子头");
        HeroNode xiaoLin = new HeroNode(6, "小林", "豹子头~~");
        HeroNode luJunYi = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode wuYong = new HeroNode(3, "吴用", "智多星");

        SingleLinkedList singleLinkedList1 = new SingleLinkedList();
        singleLinkedList1.append(linChong);
        singleLinkedList1.append(luJunYi);
        singleLinkedList1.append(wuYong);
        singleLinkedList1.update(xiaoLin);
        singleLinkedList1.show();
    }

    private static void testDelete() {
        HeroNode linChong = new HeroNode(6, "林冲", "豹子头");
        HeroNode luJunYi = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode wuYong = new HeroNode(3, "吴用", "智多星");

        SingleLinkedList singleLinkedList1 = new SingleLinkedList();
        singleLinkedList1.delete(linChong);

        System.out.println("删除前: ");
        singleLinkedList1.append(wuYong);
        singleLinkedList1.append(linChong);
        singleLinkedList1.append(luJunYi);
        singleLinkedList1.show();
        System.out.println("删除后: ");
        singleLinkedList1.delete(wuYong);
        singleLinkedList1.show();
        System.out.println("按索引删除后: ");
        singleLinkedList1.delete(3);
        singleLinkedList1.show();

    }

    private static void testLastIndex() {
        HeroNode wuYong = new HeroNode(3, "吴用", "智多星");
        HeroNode songJiang = new HeroNode(1, "宋江", "及时雨");
        HeroNode luJunYi = new HeroNode(2, "卢俊义", "玉麒麟");

        SingleLinkedList singleLinkedList1 = new SingleLinkedList();
        System.out.println(singleLinkedList1.lastIndex(-1));
        singleLinkedList1.append(luJunYi);
        singleLinkedList1.append(songJiang);
        singleLinkedList1.append(wuYong);
        System.out.println(singleLinkedList1.lastIndex(-1));
        System.out.println(singleLinkedList1.lastIndex(-3));
        System.out.println(singleLinkedList1.lastIndex(-4));
    }

    public static void testIndex(){
        HeroNode gongSun = new HeroNode(4, "公孙胜", "入云龙");
        HeroNode songJiang = new HeroNode(1, "宋江", "及时雨");
        HeroNode luJunYi = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode wuYong = new HeroNode(3, "吴用", "智多星");

        SingleLinkedList singleLinkedList1 = new SingleLinkedList();
        System.out.println(singleLinkedList1.index(1));
        singleLinkedList1.append(luJunYi);
        System.out.println(singleLinkedList1.index(1));
        System.out.println(singleLinkedList1.index(2));
    }

    private static void testSize() {
        HeroNode songJiang = new HeroNode(1, "宋江", "及时雨");
        HeroNode luJunYi = new HeroNode(2, "卢俊义", "玉麒麟");

        SingleLinkedList sll = new SingleLinkedList();
        System.out.println(sll.size());
        sll.append(songJiang);
        System.out.println(sll.size());
        sll.append(luJunYi);
        System.out.println(sll.size());
    }

    public static void testFindPre(){
        HeroNode gongSun = new HeroNode(4, "公孙胜", "入云龙");
        HeroNode guanSheng = new HeroNode(5, "关胜", "大刀");

        SingleLinkedList emptyLL = new SingleLinkedList();
        System.out.println(emptyLL.findPre(gongSun));
        System.out.println("===============");

        SingleLinkedList sll1 = new SingleLinkedList();
        sll1.append(gongSun);
        System.out.println(sll1.findPre(gongSun));
        System.out.println("===============");

        SingleLinkedList sll2 = new SingleLinkedList();
        sll2.append(gongSun);
        sll2.append(guanSheng);
        System.out.println(sll2.findPre(guanSheng));
        System.out.println(sll2.findPre(new HeroNode(6)));
        System.out.println("===============");

    }

    public static void testFind(){
        HeroNode songJiang = new HeroNode(1, "宋江", "及时雨");
        HeroNode luJunYi = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode wuYong = new HeroNode(3, "吴用", "智多星");
        HeroNode gongSun = new HeroNode(4, "公孙胜", "入云龙");

        SingleLinkedList singleLinkedList1 = new SingleLinkedList();
        System.out.println(singleLinkedList1.find(gongSun));

        SingleLinkedList singleLinkedList2 = new SingleLinkedList();
        singleLinkedList2.append(luJunYi);
        singleLinkedList2.append(songJiang);
        singleLinkedList2.append(wuYong);
        System.out.println(singleLinkedList2.find(wuYong));
    }

    public static void testSortInsert(){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        HeroNode songJiang = new HeroNode(1, "宋江", "及时雨");
        HeroNode luJunYi = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode xiaoLu = new HeroNode(2, "小卢", "玉麒麟~~");
        HeroNode wuYong = new HeroNode(3, "吴用", "智多星");
        HeroNode gongSun = new HeroNode(4, "公孙胜", "入云龙");
        singleLinkedList.sortInsert(luJunYi);
        singleLinkedList.sortInsert(xiaoLu);
        singleLinkedList.sortInsert(songJiang);
        singleLinkedList.sortInsert(wuYong);
        singleLinkedList.sortInsert(gongSun);
        singleLinkedList.show();
    }

    public static void testShow(){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        HeroNode songJiang = new HeroNode(1, "宋江", "及时雨");
        HeroNode luJunYi = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode wuYong = new HeroNode(3, "吴用", "智多星");
        singleLinkedList.show();
        singleLinkedList.append(wuYong);
        singleLinkedList.append(luJunYi);
        singleLinkedList.append(songJiang);
        singleLinkedList.show();
    }

    public static void testIsEmpty(){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        HeroNode songJiang = new HeroNode(1, "宋江", "及时雨");
        System.out.println(singleLinkedList.isEmpty());
        singleLinkedList.append(songJiang);
        System.out.println(singleLinkedList.isEmpty());
    }

    public static void testHeadInsert() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        HeroNode songJiang = new HeroNode(1, "宋江", "及时雨");
        HeroNode luJunYi = new HeroNode(2, "小卢", "玉麒麟");
        singleLinkedList.headInsert(luJunYi);
        singleLinkedList.headInsert(songJiang);
        System.out.println(singleLinkedList.tail());
    }

    public static void testIsTail() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        HeroNode songJiang = new HeroNode(1, "宋江", "及时雨");
        HeroNode luJunYi = new HeroNode(2, "卢俊义", "玉麒麟");
        singleLinkedList.append(luJunYi);
        singleLinkedList.append(songJiang);
        System.out.println(singleLinkedList.isTail(songJiang));
        System.out.println(singleLinkedList.isTail(luJunYi));
    }

    public static void testAppend() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        HeroNode songJiang = new HeroNode(1, "宋江", "及时雨");
        HeroNode luJunYi = new HeroNode(2, "卢俊义", "玉麒麟");
        singleLinkedList.append(luJunYi);
        singleLinkedList.append(songJiang);
        System.out.println(singleLinkedList.tail());
    }

    public static void testTail() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        System.out.println(singleLinkedList.tail());
    }
}
