/**
 * 
 */
package cn;

/**
 * �Զ������ͣ������������Ϊ����
 */
public class Bird {
	
	/**���Ա�������Ա��������Ʒ��*/
	private String kind = "����";
	
	/**���Ա�������Ա����������ɫ*/
	private String color = "��ɫ";
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	/**�������Ʒ������ֵ*/
	public void setKind(String k) {
		this.kind = k;  // ʹ���βε�ֵ�޸����α���
	}
	/**��ȡ���Ʒ������ֵ*/
	public String getKind() {
		return this.kind;
	}
	
	public String say() {
		return "С�񻶿�ؽ��ˣ�";
	}
	
	/**����������С��ķ�����Ϊ��*/
	public String fly() {
		String strR = "����һֻСС�����Ҳ�ɲ��ߣ�";
		return strR;
	}
	

}
