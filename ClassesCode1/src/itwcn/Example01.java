/**
 * 存放代码的包
 */
package itwcn;

/**
 * @program: ClassesCode
 * @description: 这是上课的例子和练习代码
 * @author: OriginalCoder
 * @create: 2020-09-15 14:22
 * @
 **/
public class Example01 {
    private static int age = 20;            //声明一个静态全局变量，初始值为20
    /**
     * 文档注释：说明main方法的功能和参数信息
    * @param args:运行环境参数
    * */
    public static void main(String[] args) {
        int age = 12;                   //声明一个整形变量，存取年龄数据
        System.out.println("age="+age);
        printAge();
    }
    private static void printAge() {
        System.out.println("age="+age);
    }
}
