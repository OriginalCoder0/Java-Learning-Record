package day02;

/**
 * @program: Day02
 * @description: 学习跳转语句
 * @author: OriginalCoder
 * @create: 2020-09-12 11:36
 **/
public class Exercise01 {
    public static void main(String[] args) {
        int x=1;
        while (x <= 4) {                    //判断循环条件是否成立
            System.out.println("x="+x);     //条件成立，打印x的值
            if (x == 3) {
                break;                      //使用break语句，当x==3时跳出while循环
            }
            x++;                            //控制变量x的值，进行自增
        }
    }
}
