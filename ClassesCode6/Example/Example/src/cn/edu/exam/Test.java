/**
 * 
 */
package cn.edu.exam;

/**
 * @author Administrator
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//测试代码：
		Publisher p = new Publisher();
		p.setId("P001");
		p.setName("清华大学出版社");
		p.setCity("北京");
		
		Book[] bA = new Book[41];
		Book book = null;
		for(int i=0;i<41;i++) {
			book = new Book();
			book.setName("Java程序设计");
			book.setPrice(38.00);
			book.setPublisher(p);
			bA[i] = book;
		}
		
		double sum = 0.0;
		for(int i=0;i<41;i++) {
			sum += bA[i].getPrice();
		}
		
		System.out.println("全班同学的《"+ book.getName() + "》教材总共花费：" + sum);
		
		
		Fish f = new Fish();
		
		f.setKind("鲨鱼");
		f.setWeight(2000);
		
		String strKind = f.getKind();	
		double dW = f.getWeight();
		
		System.out.println("我是一条鱼，我的品种是：" + strKind + 
				           ",体重：" + dW + "。" +f.move());	
		
		int[] iB = new int[] {8,3,1,5,2,4,32};
		Math.SortBob(iB);
		for(int i=0;i<iB.length;i++) {
			System.out.print(iB[i] + "  ");
		}
		System.out.println();
		
		  // 1. 声明一个变量dog; null表示啥也没有，但是对变量的内存进行了初始化。
		Dog dog = new Dog(); //  2. 创建了一个对象;3. 将对象的首地址保存到变量的内存中。，把对象的首地址保存到了变量 dog 中。
		System.out.println("dog变量的品种=“" + dog.getKind()+"”");  // ?
		
		Dog dog2 = dog;      // 把 dog 对象变量的值保存到 dog2 变量中。
		dog2.setKind("中华田园犬");
		
		System.out.println("dog变量的品种=“" + dog.getKind()+"”");  // ?
		
		// 声明一个数组变量，创建数组对象：
		int[] iA = new int[100];
		System.out.println("iA的对象编号：" + iA);
		
		double[] iC = new double[10];
		System.out.println("iB的对象编号：" + iC);
	}

}
