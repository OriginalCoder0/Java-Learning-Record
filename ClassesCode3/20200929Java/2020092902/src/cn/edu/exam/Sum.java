package cn.edu.exam;

public class Sum {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=2;i<=10;i++) {
			if (i % 2==1) {
				continue;//��ֹ����ѭ����ִ����һ��ѭ��
			}
			sum +=i;
		}
		System.out.println("sum ="+sum);
	}

}
