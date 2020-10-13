/**
 * 
 */
package itwcn;

/**
 * 自定义类型：描述鸟类的行为特征
 * 
 * @author Administrator
 *
 */

public class Example02 {
	
	/**
	 * @param args
	 */

	/**属性变量(成员变量)：描述动物的品种**/
	private String kind = "鸟类";
	
	/**属性变量(成员变量)：描述动物的颜色**/
	private String color = "金色";
	
	/**属性变量(成员变量)：描述动物的体重**/
	private float weight = 0.0f;
	
	/**属性变量(成员变量)：描述动物的名字**/
	private String name = "CoCo";
	
	/**属性变量(成员变量)：描述动物的性别**/
	private String sex = "雌";
	
	/**属性变量(成员变量)：描述动物的年龄**/
	private int age = 1;
	
	/**属性变量：描述动物的嘴型**/
	private String mouth = "尖嘴";
	
	
	/**获取鸟的品种属性值**/
	public String getKind() {
		return this.kind;		//将局部变量age的值赋值给成员变量age,成员变量
	}
	public void setKind(String k) {
		this.kind = k;//使用形参的值修改属性变量
	}
	
	/**获取鸟的颜色属性值**/
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;//this后面的color是成员变量的值，而等号后面的color是成员方法的形参值color
	}
	
	/**获取鸟的体重属性值**/
	public float getWeight() {
		return this.weight;
	}
	public void setWeight(float weight) {
		if(weight<=0) {
			System.out.println("数据错误！");
		}
		this.weight = weight;
	}
	
	/**获取鸟的名字属性值**/
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	/**获取鸟的性别属性值**/
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	/**获取鸟的年龄属性值**/
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		if(age<=0) {
			System.out.println("数据错误");
		} else {
			this.age = age;
		}
	}
	
	public String getMouth() {
		return this.mouth;
	}
	public void setMouth(String mouth) {
		this.mouth = mouth;
	}
	
	/*方法：描述小鸟的鸣叫行为**/
	public String say() {
		return "叽叽喳喳~~~~";
	}
	
	/*方法：描述小鸟的飞翔行为**/
	public String fly() {
		String strR = "我是一只小小鸟";
		return strR;
	}
	
	public String toString() {
		System.out.println("我是一只" + this.getKind() + ",花色是" + this.getColor()
		+  "，名字叫" + this.getName() + ",性别是" + this.getSex()
		+  "，体重为" + this.getWeight() + "kg" + ",嘴型为" + this.getMouth());
		return color;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example02 example02 = new Example02();			//创建鸟对象
		example02.setKind("喜鹊");
		example02.setColor("黄色");
		example02.setName("Lily");
		example02.setSex("公");
		example02.setWeight(10);
		example02.setMouth("尖嘴");
		
		System.out.println("我是一只" + example02.getKind() + ",花色是" + example02.getColor()
						+  "，名字叫" + example02.getName() + ",性别是" + example02.getSex()
						+  "，体重为" + example02.getWeight() + "kg" + ",嘴型为" + example02.getMouth());
		System.out.println(example02.say());
		
		example02.toString();
		
		
		example02 = new Example02();			//创建鸟对象
		example02.setKind("乌鸦");
		example02.setColor("黑色");
		System.out.println("我是一只" + example02.getKind() + ",花色是" + example02.getColor());
		System.out.println(example02.say());
	}
	
}


