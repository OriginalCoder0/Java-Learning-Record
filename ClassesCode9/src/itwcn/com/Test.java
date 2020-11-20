package itwcn.com;

/**
 * 
 * @author Administrator
 *
 */
public class Test {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kangaroo k = new Kangaroo();	//创建大袋鼠的内部类实例
		k.setName("大袋鼠");
		k.setAge(5);
		k.setKind("袋鼠");
		
		k.testInnerClass();
		
//		方法一：
		Kangaroo.smallKangaroo sk = new Kangaroo().new smallKangaroo();
		sk.setSmallAge(2);
		sk.tellYourMother();
//		方法二：第24行的写法
//		Kangaroo k1 = new Kangaroo();
//		Kangaroo.smallKangaroo sk1 = k.new smallKangaroo();

		
		
		//测试匿名内部类
		ISmallKangaroo sKB = new ISmallKangaroo() {
			//匿名内部类
			@Override
			public void tellYourMother() {
				// TODO Auto-generated method stub
				System.out.println("我是匿名内部类的对象，My mother is big Kangaroo!" + k.getName());
			}
		};
		
		sKB.tellYourMother();
	}

}
