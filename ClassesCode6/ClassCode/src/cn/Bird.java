/**
 * 
 */
package cn;

/**
 * 自定义类型：描述鸟类的行为特征
 */
public class Bird {
	
	/**属性变量（成员变量）：品种*/
	private String kind = "鸟类";
	
	/**属性变量（成员变量）：花色*/
	private String color = "白色";
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	/**设置鸟的品种属性值*/
	public void setKind(String k) {
		this.kind = k;  // 使用形参的值修改数形变量
	}
	/**获取鸟的品种属性值*/
	public String getKind() {
		return this.kind;
	}
	
	public String say() {
		return "小鸟欢快地叫了！";
	}
	
	/**方法：描述小鸟的飞翔行为。*/
	public String fly() {
		String strR = "我是一只小小鸟，想飞也飞不高！";
		return strR;
	}
	

}
