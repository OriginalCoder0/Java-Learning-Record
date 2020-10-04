package itwcn;
import java.util.Scanner;
/**
 * @program: TestCode
 * @description: switch结构，根据用户从键盘输入的月份数字，输出当月的天数到控制台
 * @author: OriginalCoder
 * @create: 2020-09-24 16:16
 **/

/*
 * 输入年份和月份，输出该月的天数（使用switch-case）
 * 一年有 12 个月，而每个月的天数是不一样的。其中，有7个月为 31 天，称为大月，分别为1、3、5、7、8、10、12月；
 * 有 4个月为 30 天，称为小月，分别为4、6、9、11月；还有二月比较特殊，平年的二月只有28天，而闰年的二月有 29 天。
 * 需要使用交互的方式计算某年某月的天数：由用户在控制台输入年份和月份值，程序计算该年该月的天数，并将结果输出在控制台。
 */
/*
 * 输入年号和月号，计算这个月的天数
 * switch判断月份
 * 1月 3月 5月 7月 8月 10月 12月   都有31天
 * 4月 6月 9月 11月 都有30天
 * 2月  判断平年闰年
 * 平28天  闰29天
 */

//判断平闰年
/*
 * switch表达式只能是int char byte short类型
 * */
public class Exercise07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = input.nextInt();
        System.out.println("请输入月份：");
        int month = input.nextInt();//输入年份和月份
        int a =29;
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("本月有31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("本月有30天");break;
            case 2:
                if(year%4==0&&year%100!=0||year%400==0) {
                    a = 28;
                }System.out.println("本月有"+a+"天");break;
        }
    }
}




