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
		if(size == "大" || size == "中" || size == "小") {
			System.out.println("狗的大小只能为大中小");
		}
		this.size = size;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		if(sex == null || sex.trim().isEmpty() == true) {
			System.out.println("数据无效");
			return;
		}
		this.sex = sex;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		if(weight<=0) {
			System.out.println("动物的体重不能小于等于0哦~");
		}
		this.weight = weight;
	}
	

	
	/*构造函数
	 * 
	 * */
	//默认构造函数
	public Dog() {
		super();
	}
	//含一个参数的构造函数
	public Dog(String k) {
		this.setKind(kind);
	}
	//含有两个参数的构造函数
	public Dog(String k,String c) {
		this.setKind(k);
		this.setColor(c);
	}
	//含有三个参数的构造函数
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
		
		
		System.out.println("狗1：" + dog1.getKind());


	}


	@Override
	public double move() {
		// TODO Auto-generated method stub
		return 0;
	}

}
