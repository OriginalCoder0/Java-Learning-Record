package itwcn;

/**
 * @program: Day01
 * @description: 学习while循环语句和do...while循环语句
 * @author: OriginalCoder
 * @create: 2020-09-10 10:38
 **/
//public class day03 {
//    public static void main(String [] args) {
//        int x=1;                            //定义变量x，初始值为1
//        while (x <= 4) {                    //判断循环条件是否成立
//            System.out.println("x="+x);     //条件成立，打印x的值
//            x++;                            //控制变量x,进行自增
//        }
//    }
//}

public class Exercise03 {
    public static void main(String [] args) {
        int x=1;                            //定义变量x，初始值为1
        do {
            System.out.println("x="+x);
            x++;
        } while (x <= 4);
    }
}
