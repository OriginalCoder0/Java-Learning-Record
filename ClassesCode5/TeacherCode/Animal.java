/**
 * 
 */
package cn.edu;

/**
 * �����ࣺ��������Ļ������������ܴ�������
 * 
 * @author xzy
 */
public abstract class Animal {
	public Animal() {}
	
	public Animal(String k) {
		this.setKind(k);
	}
	
	private String kind = null;	// Ʒ��
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	private double weight = 0.00;
	/**
	 * ��������
	 * @param w �������ص�ֵ
	 * */
	public void setWeight(double w) {
		if(w>0) {
			this.weight = w;
		}else {
			System.out.println(w + "����һ���Ϸ�������ֵ��");
		}
	}
	/**���ض��������*/
	public double getWeight() {
		return this.weight;
	}
	
	public abstract double move(); // ���󷽷�	
	
}
