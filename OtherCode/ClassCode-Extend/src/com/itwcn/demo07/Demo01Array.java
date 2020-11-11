package com.itwcn.demo07;

/**
 * @program: Demo01Array
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/28 23:21
 **/

/**
 * 题目
 * 定义一个数组，用来存储3个Person对象
 *
 * 数组有一个缺点，一旦创建，程序运行期间长度不可以发生改变
 * 那么可以使用ArrayList来改变数组的长度
 */
public class Demo01Array {
    public static void main(String[] args) {
        //首先创建一个长度为3的数组，里面用来存放Person 类型的对象
        Person[] array = new Person[3];
        Person one = new Person("菜鸟",18);
        Person two = new Person("大佬",20);
        Person three = new Person("大牛",25);

        //将one的地址赋值到0号元素位置
        array[0] = one;
        array[1] = two;
        array[2] = three;
        for (int i = 0; i < 3; i++) {
            System.out.println(array[i]);
            System.out.println(array[i].getName() + array[i].getAge());
        }

    }
}
