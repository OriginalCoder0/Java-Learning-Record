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
		stu1.setName("����");
		stu1.setScore(90);
		System.out.println("������" + stu1.getName() + ",������" + stu1.getScore());
		Student stu2 = new Student("����",100);
		System.out.println("������" + stu2.getName() + ",����" + stu2.getScore());

	}

}