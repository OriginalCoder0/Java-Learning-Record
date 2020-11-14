package com.itwcn.demo07;

/**
 * @program: DemoArrayListPrint
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/14 15:27
 **/

import java.util.ArrayList;

/**
 * 题目：
 * 定义以指定格式打印集合的方法（ArrayList作为参数，使用{}扩起集合，使用@分隔每个元素
 * 格式参照{元素@元素@元素}。
 *
 *
 * system.out.println(list);            [10,20,30]
 * printArrayList(list)                 {10@20@30}
 */
public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张翠山");
        list.add("张三丰");
        list.add("宋远桥");
        System.out.println(list);

        printArrayList(list);
    }


    /**
     *     定义方法的三要素：
     *     返回值类型：只是进行运算，所以运用void
     *     方法名称：printArrayList
     *     参数列表：ArrayList
     */

    public static void printArrayList(ArrayList<String> list) {
        //{10@20@30}
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i == list.size() - 1) {
                System.out.println(name + "}");
            } else {
                System.out.print(name + "@");
            }
        }
    }

}
