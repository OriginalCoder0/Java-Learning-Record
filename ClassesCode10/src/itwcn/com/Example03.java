/**
 * 
 */
package itwcn.com;

/**
 * @author Administrator
 *
 */
public class Example03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sbA = new StringBuffer();	//定义一个字符串缓冲区 ,线程安全
		StringBuilder sbB = new StringBuilder();	//线程不安全，在多线程环境下
		sbA.append("bcdadefgaaa");		//添加字符串
		int intA = sbA.indexOf("ade");
		System.out.println("append添加的结果：" + intA);
		
		String a = "ababkfhanfsa";
		System.out.println("将Ant替换成代码攻城狮：" + a.replace("Ant", "代码攻城狮"));

	}

}
