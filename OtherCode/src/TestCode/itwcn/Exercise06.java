package itwcn;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @program: TestCode
 * @description: 输入学生的姓名和成绩，输出评级
 * @author: OriginalCoder
 * @create: 2020-09-24 15:28
 **/
public class Exercise06 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in );
        System.out.println("请输入你的姓名:");
        String name = scanner.next();
        System.out.println("请输入成绩：");
        double score = scanner.nextDouble();
        String  grade = null ;
        if(score>=0&&score<60) {
            grade = "不及格";
        } else if(score>=60&&score<80) {
            grade = "及格";
        } else if(score>=80&&score<=89) {
            grade="良好";
        } else if(score>=90&&score<=100) {
            grade="优秀";
        } else{
                grade="Error";
                System.out.println("数据输入错误！");
        }
            System.out.println("你的姓名:" + name +',' + "你的成绩是：" + score + ',' + "成绩等级为:"+grade);
    }
}