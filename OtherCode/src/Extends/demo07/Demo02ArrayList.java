package Extends.demo07;


/**
 * @program: Demo02ArrayList
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/28 23:37
 **/

import java.util.ArrayList;

/**
 * 区别：
 * 数组的长度是无法改变的
 * 但是ArrayList集合的长度是可以随意改变的
 *
 * 对于ArrayList来说，有一个尖括号<E>代表泛型
 * 泛型：也就是装在集合当中的所有元素，全都是统一的类型，String都是String，int都是int
 * 注意：泛型只能是引用类型，不能是基本类型
 *
 * 注意事项：
 * 对于ArrayList集合来说，直接打印得到的不是地址值，而是内容
 * 如果内容为空，得到的是空的中括号，[]
 */
public class Demo02ArrayList {
    public static void main(String[] args) {
        //创建了一个ArrayList集合，集合的名称是list，里面全都是String字符串类型的数据
        //备注：从JDK1.7开始，右侧的尖括号内部可以不写内容，但是<>本身需要写
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        //向集合当中添加一些数据，需要用到add方法
        list.add("菜鸟");
        System.out.println(list);

        //当add了多个数据的时候，会将数据追加在数组的末尾
        list.add("大佬");
        list.add("大牛");
        list.add("神");
        System.out.println(list);   //[菜鸟, 大佬, 大牛, 神]
    }
}
