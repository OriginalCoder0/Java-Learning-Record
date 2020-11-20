package Extends.demo07;


/**
 * @program: Demo03ArrayListMethod
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/11 9:53
 **/

import java.util.ArrayList;

/**
 * ArrayList当中常用的方法有：
 * public boolean add(E e):向集合中添加元素，参数的类型和泛型一致。
 * 备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可以用可以不用
 * public E get(int index)：从集合中获取元素，参数是索引编号，返回值就是对应位置的元素。
 * public E remove(int index):从集合中删除元素，参数是索引编号，返回值就是被删除掉的元素
 * public int size:获取集合的尺寸长度，返回值是集合中包含的元素个数
 * @author 王佳涵
 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        //向集合中添加元素
        boolean success = list.add("大佬");
        System.out.println(list);
        System.out.println("添加的动作是否成功：" + success);
        //true

        list.add("菜鸟");
        list.add("大牛");
        System.out.println(list);
        //[大佬, 菜鸟, 大牛]

        //从集合中获取元素:get。索引值从0开始
        String name = list.get(1);
        System.out.println("第一号索引值是：" + name);

        // 从集合中删除元素：remove。索引值从0开始
        String whoRemoved = list.remove(1);
        System.out.println("被删除的人是：" + whoRemoved);
        System.out.println(list);

        //获取集合的长度，也就是元素的个数
        int size = list.size();
        System.out.println("集合的长度是：" + size);
    }
}
