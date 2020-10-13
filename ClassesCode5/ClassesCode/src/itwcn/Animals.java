/**
 * 
 */
package itwcn;

/**
 * 
 * 抽象实体类
 * 
 * @author Administrator
 * 
 * 抽象类Animals不能创建类
 *
 */
public abstract class Animals {
	private double weight = 0.0;
	/*
	 * 设置体重
	 * @param w 传入体重的值
	 * */
	public void setWeight(double w) {
		if(w>0) {
			this.weight = w;
		} else {
			System.out.println(w + "不是一个合法的重量");
		}
	}
	/*返回动物的体重*/
	public double getWeight() {
		return this.weight;
	}
	
	public abstract double move();			//抽象方法

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
