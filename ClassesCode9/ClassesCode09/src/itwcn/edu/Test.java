/**
 * 
 */
package itwcn.edu;

/**
 * @author Administrator
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student();
		stu1.setName("菜鸟");
		stu1.setScore(90);
		System.out.println("姓名：" + stu1.getName() + ",分数：" + stu1.getScore());
		Student stu2 = new Student("大佬",100);
		System.out.println("姓名：" + stu2.getName() + ",分数" + stu2.getScore());

	}

}
