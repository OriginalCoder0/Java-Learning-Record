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
	 * 调用私有的方法
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

		// 调用前面定义的私有方法
		getEvenSum();
		getOddSum();
	}

}
