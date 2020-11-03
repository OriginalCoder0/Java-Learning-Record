/**
 * 
 */
package itwcn.com;

/**
 * @author Administrator
 *
 */
public class Kangaroo {
	private String name = "袋鼠它妈！";
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
	
	/**成员内部类**/
	class smallKangaroo{
		private int smallAge = 0;

		public int getSmallAge() {
			return this.smallAge;
		}

		public void setSmallAge(int a) {
//			age = a;	
			try {
				if(a<0) {
					System.out.println("数据不合法！");
				}
			} catch (Exception e) {
				System.out.println("请重新键入数值！" + e.getMessage());
			}
			this.smallAge = a;
		}
		
		public void tellYourMother() {
			//内部类可以直接访问外部类的成员变量
			System.out.println("我是成员内部类的对象，My mother is big Kangaroo!" + name);
		}

	}

	
	public void testInnerClass() {
		smallKangaroo sk = new smallKangaroo();
		sk.setSmallAge(3);
		System.out.println("调用内部类的方法！输出小袋鼠的年龄：" + sk.getSmallAge());
	}


}
