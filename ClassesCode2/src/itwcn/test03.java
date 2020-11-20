package itwcn;

/**
 * @program: test03
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/20 11:02
 **/

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class test03 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner =  new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String strName = scanner.next();			//从键盘返回一个字符串
        System.out.println("请输入学生成绩: ");
        float fScore = scanner.nextFloat();			//从键盘获取一个浮点数据：成绩
        String strScore = "不及格";

        if(fScore>=90) {
            strScore = "优秀";
        } else if(fScore>=80) {
            strScore = "良好";
        } else if(fScore>=60) {
            strScore = "及格";
        }
        System.out.println(strName + "同学考了" + fScore + ',' + strScore);
        scanner.close();
    }
}
