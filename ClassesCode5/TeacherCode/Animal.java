/**
 * 
 */
package cn.edu;

/**
 * 抽象类：描述动物的基本特征。不能创建对象
 * 
 * @author xzy
 */
public abstract class Animal {
	public Animal() {}
	
	public Animal(String k) {
		this.setKind(k);
	}
	
	private String kind = null;	// 品种
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	private double weight = 0.00;
	/**
	 * 设置体重
	 * @param w 传入体重的值
	 * */
	public void setWeight(double w) {
		if(w>0) {
			this.weight = w;
		}else {
			System.out.println(w + "不是一个合法的体重值！");
		}
	}
	/**返回动物的体重*/
	public double getWeight() {
		return this.weight;
	}
	
	public abstract double move(); // 抽象方法	
	
}
