/**
 * 
 */
package itwcn.com;

import java.io.IOException;
import java.util.Random;

/**
 * @author Administrator
 *
 */
public class Example02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdefgadeabcadefgh";	//初始化字符串
		String a = "AmbiTIOUS Ant";		//初始化a字符串
		String b = "           Original Coder       ";
		System.out.println("字符串长度：" + s.length());
		System.out.println("字符串的第一个字符：" + s.charAt(0));
		System.out.println("字母c第一次出现的位置：" + s.indexOf('c'));
		System.out.println("字母c最后一次出现的位置：" + s.lastIndexOf('c'));
		System.out.println("子字符串第一次出现的位置：" + s.indexOf("abc"));
		System.out.println("子字符串最后一次出现的位置：" + s.lastIndexOf("abc"));
		System.out.println("将字符串全部转换为大写字母：" + s.toUpperCase());
		System.out.println("将a字符串转换为小写字母：" + a.toLowerCase());
		System.out.println("截取ade及其以后的内容：" + s.substring(7));
		System.out.println("指定截取的内容：" + s.substring(3, 9));
		String res = b.trim();
		System.out.println("返回一个新字符串，去掉收尾的空格：" + b.trim() + "b字符串的长度：" + res.length());
		System.out.println("b的字符串：" + b + "b字符串的长度为：" + b.length());
		
		System.out.println("将Ant替换成代码攻城狮：" + a.replace("Ant", "代码攻城狮"));
		
		long t = System.currentTimeMillis();  		//返回以毫秒为单位的当前时间
		System.out.println("当前时间：" + t);
		
		System.out.println("将1234转换成字符串：" +  String.valueOf(1234));
		System.out.println("===================================================");
		System.out.println("将asd,df,aaa,g,rrr分解为数组：");
		String str = "asd,df,aaa,g,rrr";
		String[] strArr = str.split(",");
		for(String m:strArr) {
			System.out.println(m);
		}
		
		
		
		//runtime类  下面是执行DOS命令的代码
		Runtime run = Runtime.getRuntime();
		try {
			run.exec("javac hello.java");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//绝对值
		double dA = Math.abs(-9);
		System.out.println(dA);
		
		//勾股定理
		double dB = Math.pow(3, 2);
		double dC = Math.sqrt(Math.pow(3,2) + Math.pow(4,2));
		System.out.println("弦长：" + dC);
		
		
		//获取随机数
		Random random  = new Random();
		int iR = random.nextInt();
		int i = 0;
		do {
			iR = random.nextInt(10);
			System.out.println("随机数：" + iR);
			i++;
		} while(i<10);
		
		
		
		
		//包装类
		Double dd1 = 0.00;		//将普通的doule进行封装，创建了一个Double类
		double dd2 = 0.00;		//基本数据类型
		//用Double创建类
		Double dd3 = new Double(0.00);
	}

}
