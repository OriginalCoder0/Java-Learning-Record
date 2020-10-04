package itwcn;

/**
 * @program: Runoob
 * @description: 两个引用指向同一块内存
 * @author: OriginalCoder
 * @create: 2020-10-02 11:36
 **/
//class Phone {
//    String brand;       //品牌
//    double price;       //价格
//    String color;       //颜色
//    //定义成员方法
//    public void call(String who) {
//        System.out.println("给" + who + "打电话");
//    }
//    public void sendMessage() {
//        System.out.println("群发短信");
//    }
//}
public class Example03 {
    public static void main(String[] args) {
        Phone one = new Phone();
        System.out.println(one.brand);  //null
        System.out.println(one.price);  //0.0
        System.out.println(one.color);  //null
        one.brand ="苹果";
        one.price = 8388;
        one.color = "墨绿色";
        System.out.println(one.brand);  //苹果
        System.out.println(one.price);  //8388
        System.out.println(one.color);  //墨绿色
        one.call("乔帮主");         //给乔帮主打电话
        one.sendMessage();              //群发短信

        Phone two = one;
        System.out.println(two.brand);  //苹果
        System.out.println(two.price);  //8388
        System.out.println(two.color);  //墨绿
        two.brand ="华为";
        two.price = 6388;
        two.color = "赤茶橘";
        System.out.println(two.brand);  //华为
        System.out.println(two.price);  //6388
        System.out.println(two.color);  //赤茶橘
        one.call("任总");         //给任总打电话
        one.sendMessage();              //群发短信
    }
}
