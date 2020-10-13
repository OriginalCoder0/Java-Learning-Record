/**
 * 
 */
package cn.edu;

/**
 * 实体类
 * 
 */
public class Dog extends Animal {	
	public Dog() {
		super();
	}
	public Dog(String k) {
		super(k);  // 调用父类的带参数的构造方法
	}
	
	private int size = 0;  //尺寸
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		if(size<=0) {
			System.out.println("非法尺寸！");
			return;
		}
		this.size = size;
	}	
	@Override  //注解：表示重写父类的同名方法
	public double move() {
		return 60;
	}
	
}
