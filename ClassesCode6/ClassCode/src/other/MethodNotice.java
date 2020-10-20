package other;

/**
 * @program: ClassCode
 * @description: 方法使用的注意事项
 * @author: OriginalCoder
 * @create: 2020-10-20 18:47
 **/

/**
 * 使用方法的注意事项：
 * 1.方法的定义应该在类中，但是不能在方法当中再定义方法，不能写方法的嵌套
 * 2.方法的定义前后顺序无所谓
 * 3.方法定义之后不会执行，如果希望执行，一定要调用，单独调用，打印调用，赋值调用
 * 4.如果有返回值，那么必须写上return 返回值 ，不能没有；
 * 5.return后面的返回值数据，必须和方法的返回值类型，对应起来
 * 6.对于一个void没有返回值的方法，不能写return后面的返回值，只能写return自己
 * 7.对于方法中最后一列的return可以省略不写
 * 8.一个方法中可以有多个return语句，但是必须保证同时只有一个会被执行，不能两个return连写
 */
public class MethodNotice {
    public static void main(String[] args) {

    }
    public static int method1() {
        return 10;
    }
    public static void method2() {
        return;     //没有返回值，只是结束方法的执行而已
    }

    public static int getMax(int a,int b) {
        //方法一：
//        int max;
//        if(a>b) {
//            max = a;
//        } else {
//            max = b;
//        }
//        return max;

        //方法二：
//        if(a>b) {
//            return a;
//        } else {
//            return b;
//        }

        //方法三：
        return a > b ? a : b;

    }
}
