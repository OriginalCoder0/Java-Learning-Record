/**
 * 
 */
package cn.edu.exam;

/**
 * 定义实体类：描述鱼类的基本特征。
 */
public class Fish extends Animal {
	
	/**方法：描述鱼的运动行为。*/
	@Override
	public String move() {
		return "我是鱼，能够在水中以每小时20公里的速度游行。";
	}
	
}
