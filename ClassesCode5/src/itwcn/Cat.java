/**
 * 
 */
package itwcn;

/**
 * 
 * ʵ������
 * @author Administrator
 *
 */
public class Cat extends Animals {
	
	private String kind = null;	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	private double weight = 0.0;	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		if(weight<=0) {
			System.out.println("�Ƿ����أ�");
			return;
		}
		this.weight = weight;
	}
	
	private int size = 0;
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		if(size<=0) {
			System.out.println("�Ƿ��ߴ磡");
			return;
		}
		this.size = size;
	}
	@Override
	public double move() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}

