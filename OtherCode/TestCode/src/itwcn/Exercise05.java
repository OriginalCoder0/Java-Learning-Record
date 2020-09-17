package itwcn;

import java.util.Scanner;

/**
 * @program: TestCode
 * @description: ：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 * @author: OriginalCoder
 * @create: 2020-09-17 10:28
 **/
public class Exercise05 {
    public static void main(String[] args) {
        System.out.println("请输入学生成绩：");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String result = a>=90?"A":(60<=a&& a<90?"B":"C");
        System.out.println("该学生的最终评级为："+result);
    }

}
