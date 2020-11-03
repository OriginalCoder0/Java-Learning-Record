/**
 * 
 */
package itwcn.edu;

/**
 * @author Administrator
 *
 */
public class Student {
	
	
	/**
	 * 带参数的构造方法
	 * 
	 * @param name 学生的姓名
	 * @param score 成绩
	 * */
	
	//无参构造方法
	public Student() {
		
	};
	//两个参数的构造方法
	public Student(String Sname,double Score) {
		this.setName(Sname);
		this.setScore(Score);
	}
	
	private String name = null;
	private double score = 0.0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return this.score;
	}
	public void setScore(double score) {
		if(score<0) {
			System.out.println("不合法！");
		}
		this.score = score;
	}
	
}
