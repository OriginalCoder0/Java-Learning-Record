package itwcn;

/**
 * @program: Day01
 * @description: 学习变量的作用域
 * @author: OriginalCoder
 * @create: 2020-09-10 16:02
 **/
public class Exercise07 {
    public static void main(String[] args) {
        int x = 12;
        {
            int y = 96;
            System.out.println("x="+x);
            System.out.println("y="+y);
        }
//        y = x;
        System.out.println("x="+x);
    }
}
