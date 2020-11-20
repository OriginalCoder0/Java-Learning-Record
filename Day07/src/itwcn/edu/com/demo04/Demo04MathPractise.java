package itwcn.edu.com.demo04;

/**
 * @program: Demo04MathPractise
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/19 17:39
 **/

/**
 * 计算-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？
 *
 * 分析：
 * 1.范围确定，for循环
 * 2.起点位置-10.8应该转换成为-10，两种办法：
 *      2.1可以使用Math.ceil()方法，向上（向正方向）取整
 *      2.2强制类型转换为int，自动舍弃所有小数位
 * 3.每一个数字都是整数，所以步进表达式是num++,每次都是+1
 * 4.拿到绝对值，Math.abs()方法
 * 5.一旦发现一个数字，就让计数器++进行统计
 */
public class Demo04MathPractise {
    public static void main(String[] args) {
        int count = 0;      //统计符合要求的数量
        double min = -10.8;
        double max = 5.9;
        //变量i就是区间之内的所有整数
        for (int i = (int)min; i < max; i++) {
            int abs = Math.abs(i);      //绝对值
            if (abs > 6 || abs <2.1) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("总共有：" + count);
    }
}
