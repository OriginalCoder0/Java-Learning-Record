/**
 * 
 */
package itwcn;

/**
 * @author Administrator
 *
 */
public class Example05 {

	/*
	 * ����˽�еķ���
	 */
	private static void getEvenSum() {
		int sum = 0;
		for (int i = 2; i <= 10; i = i + 2) {
			sum += i;
		}
		System.out.println("sum=" + sum);
	}
	
	private static void getOddSum() {
		int i=1,sum=0;
		while(i<10) {
			sum += i;
			i += 2;
		}
		System.out.println("sum=" + sum);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2,sum = 0;
		while (i <= 10) {
			sum += i;
			i += 2;
		}
		System.out.println("sum=" + sum);

		// ����ǰ�涨���˽�з���
		getEvenSum();
		getOddSum();
	}

}
