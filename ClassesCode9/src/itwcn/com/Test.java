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
		Kangaroo k = new Kangaroo();	//�����������ڲ���ʵ��
		k.setName("�����");
		k.setAge(5);
		k.setKind("����");
		
		k.testInnerClass();
		
//		����һ��
		Kangaroo.smallKangaroo sk = new Kangaroo().new smallKangaroo();
		sk.setSmallAge(2);
		sk.tellYourMother();
//		����������24�е�д��
//		Kangaroo k1 = new Kangaroo();
//		Kangaroo.smallKangaroo sk1 = k.new smallKangaroo();

		
		
		//���������ڲ���
		ISmallKangaroo sKB = new ISmallKangaroo() {
			//�����ڲ���
			@Override
			public void tellYourMother() {
				// TODO Auto-generated method stub
				System.out.println("���������ڲ���Ķ���My mother is big Kangaroo!" + k.getName());
			}
		};
		
		sKB.tellYourMother();
	}

}
