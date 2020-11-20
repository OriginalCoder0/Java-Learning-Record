package itwcn;

/**
 * @program: Runoob
 * @description: 使用对象类型作为方法的参数
 * @author: OriginalCoder
 * @create: 2020-10-02 11:43
 **/
public class Example04 {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "OPPO Reno3";
        one.price = 5498;
        one.color = "旗舰版";
        method(one);
    }
    //当一个对象作为参数，传递到方法中时，实际上传递进去的是对象的地址值
    public static void method(Phone param) {
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}
