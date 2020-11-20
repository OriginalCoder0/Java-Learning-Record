package Extends.demo06;

/**
 * @program: Demo01Random
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/28 18:03
 **/

import java.util.Random;

/**
 * Random类用来生成随机数字，使用起来依然是三个步骤
 * 1.导包
 *      import java.util.Random
 * 2.创建
 *      Random r = new Random();
 * 3.使用
 *      获取一个随机的int数字(范围是int所有范围，有正负两种)，r.nextInt()
 *      获取一个随机的int数字(参数代表了范围，左闭右开区间)，int num = r.nextInt(3)
 *      实际代表的含义：[0,3)
 */
public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt();
        System.out.println("随机数是：" + num);
    }
}
