/**
 * 
 */
package cn.edu.exam;

/**
 * 抽象类：描述动物的通用特性。
 * 
 * @author Administrator
 *
 */
public abstract class Animal {

    protected String kind = "动物的品种";  // 描述鱼的品种的
	
	/**
	 * 设置属性kind的值。
	 * 
	 * @param kind 传入要设置的鱼的品种字符串
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
	 * 设置体重属性值
	 * @param w 传入的要设置的体重值
	 * */
	public void setWeight(double w) {
		if(w>0) {
			this.weight = w;
		}
	}
	
	/**获取体重：返回体重属性值*/
	public double getWeight() {
		return this.weight;
	}
	
	/**性别*/
	protected String sex;	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		if(sex.equals("雌")||sex.equals("雄")||sex.equals("公")||sex.equals("母")) {
			this.sex = sex;
		}else {
			System.out.println("非法的性别描述！");
		}
	}
	
	/**抽象方法：描述鱼的运动行为。*/
	public abstract String move();
	
}
