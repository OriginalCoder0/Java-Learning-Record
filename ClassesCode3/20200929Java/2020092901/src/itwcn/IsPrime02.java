/**
 * 
 */
package itwcn;

/**
 * @author Administrator
 *
 */
public class IsPrime02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n;//����nΪҪ�жϵ�����
		System.out.println("������");
		A: for(n=2;n<=50;n++) {
			for(m=2;m<=n/2;m++) {
				if(n%m==0)
					continue A;
			}
			System.out.print(n+ " ");
		}

	}

}
