/**
 * 
 */
package itwcn;

/**
 * @author Administrator
 *
 */
public class Example02 {
	private String kind = null;
	private String name;
	private double weight;
	//��ȡƷ������ֵ
	public String getKind() {
		return this.kind;
	}

	public void setKind(String k) {
		if(k == null || k.trim().isEmpty() == true) {
			System.out.println("Ʒ����Ч��");
			return;
		}
		this.kind = k;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if(weight<=0) 
			System.out.println("��������ݲ��Ϸ���");
		this.weight = weight;
	}
	
	
	public Example02() {
		super();
	}
	
	public Example02(String kind) {
		super();
		this.setKind(kind);
	}
	
	public Example02(String kind,double weight) {
		super();
		this.setKind(kind);
		this.setWeight(weight);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Example01 example01 = new Example01();
//		Example01 example02 = new Example01();
//		example01.setKind("��ë");
//		example01.setWeight(20);
//		example01.setColor("��ɫ");
//		example02.setKind("��ʿ��");
//		System.out.println("Ʒ�֣�" + example02.getKind());
		
		
		
		Example02 example03 = new Example02("��ĦҮ");
		Example02 example04 = new Example02("��ĦҮ",32);
		System.out.println("Ʒ�֣�" + example03.getKind());
		System.out.println("Ʒ�֣�" + example04.getKind() + example04.getWeight());
		

	}

	

	

}
