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
	 * �������Ĺ��췽��
	 * 
	 * @param name ѧ��������
	 * @param score �ɼ�
	 * */
	
	//�޲ι��췽��
	public Student() {
		
	};
	//���������Ĺ��췽��
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
			System.out.println("���Ϸ���");
		}
		this.score = score;
	}
	
}
