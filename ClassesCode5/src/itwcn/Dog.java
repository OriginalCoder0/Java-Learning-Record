/**
 * 
 */
package itwcn;

/**
 * @author Administrator
 *
 */
public class Dog extends Animals {
	
	
	private String kind = null;
	private String color = null;
	private String size = null;
	private String sex = null;
	private double weight = 0.0;
	
	public String getKind() {
		return this.kind;
	}


	public void setKind(String kind) {
		this.kind = kind;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		if(size == "��" || size == "��" || size == "С") {
			System.out.println("���Ĵ�Сֻ��Ϊ����С");
		}
		this.size = size;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		if(sex == null || sex.trim().isEmpty() == true) {
			System.out.println("������Ч");
			return;
		}
		this.sex = sex;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		if(weight<=0) {
			System.out.println("��������ز���С�ڵ���0Ŷ~");
		}
		this.weight = weight;
	}
	

	
	/*���캯��
	 * 
	 * */
	//Ĭ�Ϲ��캯��
	public Dog() {
		super();
	}
	//��һ�������Ĺ��캯��
	public Dog(String k) {
		this.setKind(kind);
	}
	//�������������Ĺ��캯��
	public Dog(String k,String c) {
		this.setKind(k);
		this.setColor(c);
	}
	//�������������Ĺ��캯��
	public Dog(String k,String c,String s) {
		this.setKind(k);
		this.setColor(c);
		this.setSize(s);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog("");
		
		
		System.out.println("��1��" + dog1.getKind());


	}


	@Override
	public double move() {
		// TODO Auto-generated method stub
		return 0;
	}

}
