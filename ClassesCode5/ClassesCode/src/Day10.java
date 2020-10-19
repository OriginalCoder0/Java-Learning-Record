/**
 * @program: ClassesCode
 * @description: 学习接口的使用
 * @author: OriginalCoder
 * @create: 2020-10-19 22:21
 **/

interface Animal {
    int ID = 1;                         //定义全局变量
    void breathe();                     //定义抽象方法breathe()
    //定义一个默认方法
    default void getType(String type) {
        System.out.println("该动物属于："+ type);
    }
    //定义一个静态方法
    static int  getID() {
        return Animal.ID;
    }
}
public class Day10 {
}
