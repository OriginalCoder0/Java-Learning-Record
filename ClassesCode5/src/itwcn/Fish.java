/**
 * 
 */
package itwcn;

/**
 * @author Administrator
 *
 */
public class Fish extends Animals {
	private String kind = null;
	private double weight = 0.0;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fish fish1 = new Fish();
		fish1.setKind("鲨鱼");
		fish1.setWeight(3000);
		System.out.println("我是：" + fish1.getKind() + "我的速度：" + fish1.move());

	}


	@Override
	public double move() {
		// TODO Auto-generated method stub
		return 0;
	}




}
