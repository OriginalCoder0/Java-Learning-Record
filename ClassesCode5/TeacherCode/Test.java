/**
 * 
 */
package cn.edu;

/**
 * @author Administrator
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setKind("中华田园犬");
		dog.setWeight(8);
		
		Dog dog2 = dog; // 将 dog 变量的值赋给 dog2
		dog2.setKind("吉娃娃");		
		System.out.println("dog变量引用的对象品种：" + dog.getKind());
		dog.setKind("中华田园犬");
		System.out.println("dog2变量引用的对象品种：" + dog2.getKind());
		System.out.println("我是" + dog2.getKind() + ";能以每小时" + dog2.move() + "公里的速度奔跑。");
		
		Fish f1 = new Fish();
		f1.setKind("鲨鱼");
		f1.setWeight(3000);
		System.out.println("我是" + f1.getKind() + ";能以每小时" + f1.move() + "公里的速度游泳");
	}

}
