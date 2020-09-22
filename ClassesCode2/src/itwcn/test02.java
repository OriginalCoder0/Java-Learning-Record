/**
 * 
 */
package itwcn;
import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class test02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入分数：");

			int score = scanner.nextInt();
			System.out.println(Test(score));
			scanner.close();
	}
	
	public static int Test(int n) {
		if(n>=90) {
			System.out.println("你的评级为：" + "优秀");
		} else if (n>=70&&n<90) {
			System.out.println("你的评级为：" + "良好");
		} else if (n>=60&&n<70) {
			System.out.println("你的评级为：" + "及格");
		} else if (n>=0&&n<60) {
			System.out.println("你的评级为：" + "不及格");
		} else {
			System.out.println("输入的数据的错误！");
		}
		return n;
	}

}
