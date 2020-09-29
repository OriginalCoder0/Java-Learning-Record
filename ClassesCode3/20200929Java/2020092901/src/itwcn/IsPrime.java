/**
 * 
 */
package itwcn;
import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class IsPrime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		boolean isPrime = true;
		if ( x == 1)
		{
		    isPrime = false;
		}
		for( int i = 2; i< x; i++)
		{
		    if(x % i ==0)
		    {
		        isPrime = false;
		        break;
		    }
		}
		if(isPrime)
		{
		    System.out.println(x +"是素数");
		}
		else
		{
		    System.out.println(x+ "不是素数");
		}
		in.close();
	}
	

}
