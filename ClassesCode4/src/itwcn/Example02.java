/**
 * 
 */
package itwcn;

/**
 * �Զ������ͣ������������Ϊ����
 * 
 * @author Administrator
 *
 */

public class Example02 {
	
	/**
	 * @param args
	 */

	/**���Ա���(��Ա����)�����������Ʒ��**/
	private String kind = "����";
	
	/**���Ա���(��Ա����)�������������ɫ**/
	private String color = "��ɫ";
	
	/**���Ա���(��Ա����)���������������**/
	private float weight = 0.0f;
	
	/**���Ա���(��Ա����)���������������**/
	private String name = "CoCo";
	
	/**���Ա���(��Ա����)������������Ա�**/
	private String sex = "��";
	
	/**���Ա���(��Ա����)���������������**/
	private int age = 1;
	
	/**���Ա������������������**/
	private String mouth = "����";
	
	
	/**��ȡ���Ʒ������ֵ**/
	public String getKind() {
		return this.kind;		//���ֲ�����age��ֵ��ֵ����Ա����age,��Ա����
	}
	public void setKind(String k) {
		this.kind = k;//ʹ���βε�ֵ�޸����Ա���
	}
	
	/**��ȡ�����ɫ����ֵ**/
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;//this�����color�ǳ�Ա������ֵ�����Ⱥź����color�ǳ�Ա�������β�ֵcolor
	}
	
	/**��ȡ�����������ֵ**/
	public float getWeight() {
		return this.weight;
	}
	public void setWeight(float weight) {
		if(weight<=0) {
			System.out.println("���ݴ���");
		}
		this.weight = weight;
	}
	
	/**��ȡ�����������ֵ**/
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	/**��ȡ����Ա�����ֵ**/
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	/**��ȡ�����������ֵ**/
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		if(age<=0) {
			System.out.println("���ݴ���");
		} else {
			this.age = age;
		}
	}
	
	public String getMouth() {
		return this.mouth;
	}
	public void setMouth(String mouth) {
		this.mouth = mouth;
	}
	
	/*����������С���������Ϊ**/
	public String say() {
		return "ߴߴ����~~~~";
	}
	
	/*����������С��ķ�����Ϊ**/
	public String fly() {
		String strR = "����һֻСС��";
		return strR;
	}
	
	public String toString() {
		System.out.println("����һֻ" + this.getKind() + ",��ɫ��" + this.getColor()
		+  "�����ֽ�" + this.getName() + ",�Ա���" + this.getSex()
		+  "������Ϊ" + this.getWeight() + "kg" + ",����Ϊ" + this.getMouth());
		return color;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example02 example02 = new Example02();			//���������
		example02.setKind("ϲȵ");
		example02.setColor("��ɫ");
		example02.setName("Lily");
		example02.setSex("��");
		example02.setWeight(10);
		example02.setMouth("����");
		
		System.out.println("����һֻ" + example02.getKind() + ",��ɫ��" + example02.getColor()
						+  "�����ֽ�" + example02.getName() + ",�Ա���" + example02.getSex()
						+  "������Ϊ" + example02.getWeight() + "kg" + ",����Ϊ" + example02.getMouth());
		System.out.println(example02.say());
		
		example02.toString();
		
		
		example02 = new Example02();			//���������
		example02.setKind("��ѻ");
		example02.setColor("��ɫ");
		System.out.println("����һֻ" + example02.getKind() + ",��ɫ��" + example02.getColor());
		System.out.println(example02.say());
	}
	
}


