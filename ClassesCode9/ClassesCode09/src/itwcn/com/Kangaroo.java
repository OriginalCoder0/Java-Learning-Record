/**
 * 
 */
package itwcn.com;

/**
 * @author Administrator
 *
 */
public class Kangaroo {
	private String name = "�������裡";
	private String kind = null;
	private int age = 0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/**��Ա�ڲ���**/
	class smallKangaroo{
		private int smallAge = 0;

		public int getSmallAge() {
			return this.smallAge;
		}

		public void setSmallAge(int a) {
//			age = a;	
			try {
				if(a<0) {
					System.out.println("���ݲ��Ϸ���");
				}
			} catch (Exception e) {
				System.out.println("�����¼�����ֵ��" + e.getMessage());
			}
			this.smallAge = a;
		}
		
		public void tellYourMother() {
			//�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա����
			System.out.println("���ǳ�Ա�ڲ���Ķ���My mother is big Kangaroo!" + name);
		}

	}

	
	public void testInnerClass() {
		smallKangaroo sk = new smallKangaroo();
		sk.setSmallAge(3);
		System.out.println("�����ڲ���ķ��������С��������䣺" + sk.getSmallAge());
	}


}