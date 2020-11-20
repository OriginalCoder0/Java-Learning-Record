package Extends.demo01;



/**
 * @program: demo
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/27 19:33
 **/

/**
 * 面向对象的三大特征：封装、继承、多态
 * 封装性在Java中的体现：
 * 1.方法就是一种封装
 * 2.关键字private也是一种封装
 * 封装：就是将一些细节信息隐藏起来，对外界不可见
 */
public class Demo01Person {
    public static void main(String[] args) {
        int[] array = {5,15,20,25,30};
        int max = getMax(array);
        System.out.println(max);
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}