/**
 * 
 */
package itwcn;

/**
 * @author Administrator
 *
 */
public class Example04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0;
		for(i=2;i<=10;i++) {
			if(i%2==0) {
				sum +=i;
			}
		}
		System.out.println("sum=" + sum);
	}
}
