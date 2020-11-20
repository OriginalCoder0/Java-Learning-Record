package itwcn;

/**
 * @program: Runoob
 * @description: 使用对象类型作为方法的返回值
 * @author: OriginalCoder
 * @create: 2020-10-02 11:49
 **/
public class Example05 {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }
    //当使用一个对象类型作为方法的返回值时，返回值其实就是对象的地址值
    public static Phone getPhone () {
        Phone one = new Phone();
        one.brand = "IQ00";
        one.price = 4988;
        one.color = "游戏版";
        return one;
    }
}
