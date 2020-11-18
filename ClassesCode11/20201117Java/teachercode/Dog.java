package cn.edu;

public class Dog {
	
	static {  // 静态代码块
		int i;
		i = 9;
	}
		
	public Dog() {}
	
	/**构造方法重载*/
	public Dog(String k) {
		this.setKind(k);
	}
	
	/**构造方法重载*/
	public Dog(String k, String n) {
		this.setKind(k);
		this.setName(n);
	}	
	
	/**构造方法重载
	 * @throws Exception */
	public Dog(String k, String n, double w) throws Exception {
		this.setKind(k);
		this.setName(n);
		this.setWeight(w);
	}	
	
	private String kind = null;
	private String name = null;
	private double weight = 0.00;
			
	/**设置属性值*/
	public void setKind(String k) {
		this.kind = k;
	}
	/**获取属性值*/
	public String getKind() {
		return this.kind;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setWeight(double w) throws Exception {
		if(w>0) {
			this.weight = w;
		}else {
			throw new Exception("体重必须大于0！");
		}
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void showInfo() {
		System.out.println("我是一只" + this.kind + ",我的名字叫：" + this.name 
				           + "，我的体重：" + this.weight + "公斤。");
	}
	
}
