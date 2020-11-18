package itwcn.edu.com.demo03;

/**
 * @program: Demo02StaticMethod
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/18 22:08
 **/

/**
 * 一旦使用了static修饰成员方法，那么这就成为了静态方法
 * 静态方法不属于对象，而是属于类
 *
 * 如果没有static，那么必须先创建对象，才能使用它
 *
 *
 * 无论是成员变量，还是成员方法，如果有了static，都推荐使用类名称进行调用。
 * 静态变量：类名称.静态变量
 * 静态方法：类名称.静态方法()
 *
 *
 * 注意事项：
 * 1.静态不能直接访问非静态。
 * 2.静态方法中不能用this关键字。this代表当前对象，通过谁调用的方法，谁就是当前对象
 */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();    //首先创建对象
        obj.method();

        //对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名称来调用。
        MyClass.methodStatic();

        //对于本类当中的静态方法，可以省略类名称
        myMethod();
    }

    public static void myMethod() {
        System.out.println("自己的方法");
    }

}
