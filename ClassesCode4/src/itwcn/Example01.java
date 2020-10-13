/**
 * 
 */
package itwcn;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Example01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bubble_sort();
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入第一个变量A：");
		int a = scanner.nextInt();
		System.out.println("输入第二个变量B：");
		int b = scanner.nextInt();
		System.out.println("A=" + a + "\tB=" + b);
		//变量交换
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
		System.out.println("A=" + a + "\tB=" + b);
	}
	private static void bubble_sort() {
		int iArr[] = new int[5];			//声明一个5个变量存储空间的数组
		iArr[0] = 9;
		iArr[1] = 8;
		iArr[2] = 1;
		iArr[3] = 3;
		iArr[4] = 6;
		//大括号里的内容为数组的对象
		int iB[] = {1,4,3,8,2};//根据赋值的元素个数确定数组的大小
		int n= iB.length;
		
//		int t = 0;//声明一个过渡变量，用于置换相邻的两个元素的值
		int i = 0;//声明一个变量，引用数组索引下标
		int j = 0;
//		for(j=1;j<4;j++) {
//			for(i=0;i<5-j;i++) {			//依次对相邻的两个元素的值作比较，并将小数放在前面
//				if(iB[i]>iB[i+1]) {
//					t = iB[i];			//用过渡变量接受一个元素的值
//					iB[i] = iB[i+1];
//					iB[i+1] = t;
//				}
//			}
//		}


		for(i = 0;i<4;i++) {
			for(j = n-1;j>i;j--) {
				if(iArr[j]<iArr[j-1]) {
					iArr[j] = iArr[j] + iArr[j-1];
					iArr[j-1] = iArr[j] - iArr[j-1];
					iArr[j] = iArr[j] - iArr[j-1];
				}
			}
		}
		for(i=0;i<n;i++) {
			System.out.println(iArr[i] + "");
		}
		System.out.println(" ");
	}

}
