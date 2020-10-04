package itwcn;

/**
 * @program: Runoob
 * @description: 构造方法并创建对象
 * @author: OriginalCoder
 * @create: 2020-10-02 00:01
 **/
/*
对象是根据类创建的。在Java中，使用关键字 new 来创建一个新的对象。创建对象需要以下三步：
1.声明：声明一个对象，包括对象名称和对象类型。
2.实例化：使用关键字 new 来创建一个对象。
3.初始化：使用 new 创建对象时，会调用构造方法初始化对象。
 */
class Phone {
    String brand;       //品牌
    double price;       //价格
    String color;       //颜色
    //定义成员方法
    public void call(String who) {
        System.out.println("给" + who + "打电话");
    }
    public void sendMessage() {
        System.out.println("群发短信");
    }
}
public class Example01 {

    public static void main(String[] args) {
        Phone one = new Phone();
        System.out.println(one.brand);      //null
        System.out.println(one.price);      //0.0
        System.out.println(one.color);      //null
        one.brand = "苹果";
        one.price = 8388;
        one.color = "墨绿色";
        System.out.println(one.brand);      //苹果
        System.out.println(one.price);      //8388
        System.out.println(one.color);      //墨绿色
        one.call("乔布斯");             //给乔布斯打电话
        one.sendMessage();                  //群发短信
    }
}


