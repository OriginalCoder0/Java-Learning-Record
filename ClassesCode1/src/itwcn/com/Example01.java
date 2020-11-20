package itwcn.com;

/**
 * @program: Example01
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/20 10:59
 **/
public class Example01 {
    private static int age = 20;

    public Example01() {
    }

    public static void main(String[] args) {
        int age = 12;
        System.out.println("age=" + age);
        printAge();
    }

    private static void printAge() {
        System.out.println("age=" + age);
    }
}