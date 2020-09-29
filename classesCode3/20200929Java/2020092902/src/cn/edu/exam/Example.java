package cn.edu.exam;

import java.util.Scanner;

public class Example {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scA=new Scanner(System.in);
		System.out.println("请输入您的年龄：");
		int age=scA.nextInt();//获取年龄
		System.out.println("请输入您的性别：");
		String sex=scA.next();//获取性别
		//判断用户的输入是否满足入队要求：
		if(age>=18) {
			if(sex.equals("男"))//equals方法比较变量与常量的值是否相等
			{
				System.out.println("欢迎男同学加盟兴趣小组！");
			}else if(sex.equals("女")) {
				System.out.println("欢迎女同学加盟兴趣小组！");
			}else {
				System.out.println("你只有"+ age +"岁，欢迎以后加盟！");
			}
		}
		scA.close();//关闭键盘输入捕获器
		scA=null;//取消变量对键盘捕获器对象的引用
	}

}
