/**
 * 
 */
package cn.edu.exam;

/**
 * �����ࣺ���������ͨ�����ԡ�
 * 
 * @author Administrator
 *
 */
public abstract class Animal {

    protected String kind = "�����Ʒ��";  // �������Ʒ�ֵ�
	
	/**
	 * ��������kind��ֵ��
	 * 
	 * @param kind ����Ҫ���õ����Ʒ���ַ���
	 * */
	public void setKind(String kind) {
		if(kind!=null && kind.trim().isEmpty()==false) {
			this.kind = kind;
		}
	}
	
	/***/
	public String getKind() {
		return kind;
	}
	
	protected double weight = 0.00;
	/**
	 * ������������ֵ
	 * @param w �����Ҫ���õ�����ֵ
	 * */
	public void setWeight(double w) {
		if(w>0) {
			this.weight = w;
		}
	}
	
	/**��ȡ���أ�������������ֵ*/
	public double getWeight() {
		return this.weight;
	}
	
	/**�Ա�*/
	protected String sex;	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		if(sex.equals("��")||sex.equals("��")||sex.equals("��")||sex.equals("ĸ")) {
			this.sex = sex;
		}else {
			System.out.println("�Ƿ����Ա�������");
		}
	}
	
	/**���󷽷�����������˶���Ϊ��*/
	public abstract String move();
	
}
