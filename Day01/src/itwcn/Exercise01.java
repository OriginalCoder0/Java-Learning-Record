package itwcn;


/**
 * @program: Day01
 * @description: 这是第一天学习java,使用if...else if...else语句来实现对考试成绩的划分
 * @author: OriginalCoder
 * @create: 2020-09-10 10:12
 **/
public class Exercise01 {
    public static void main(String [] args){
        int grade = 75;
        if(grade > 80) {
            System.out.println("成绩为优");
        } else if (grade > 70) {
            System.out.println("成绩良好");
        } else if (grade > 60) {
            System.out.println("成绩中等");
        } else {
            System.out.println("成绩差！");
        }
    }
}
