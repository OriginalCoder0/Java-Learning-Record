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
		System.out.println("�����һ������A��");
		int a = scanner.nextInt();
		System.out.println("����ڶ�������B��");
		int b = scanner.nextInt();
		System.out.println("A=" + a + "\tB=" + b);
		//��������
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
		System.out.println("A=" + a + "\tB=" + b);
	}
	private static void bubble_sort() {
		int iArr[] = new int[5];			//����һ��5�������洢�ռ������
		iArr[0] = 9;
		iArr[1] = 8;
		iArr[2] = 1;
		iArr[3] = 3;
		iArr[4] = 6;
		//�������������Ϊ����Ķ���
		int iB[] = {1,4,3,8,2};//���ݸ�ֵ��Ԫ�ظ���ȷ������Ĵ�С
		int n= iB.length;
		
//		int t = 0;//����һ�����ɱ����������û����ڵ�����Ԫ�ص�ֵ
		int i = 0;//����һ���������������������±�
		int j = 0;
//		for(j=1;j<4;j++) {
//			for(i=0;i<5-j;i++) {			//���ζ����ڵ�����Ԫ�ص�ֵ���Ƚϣ�����С������ǰ��
//				if(iB[i]>iB[i+1]) {
//					t = iB[i];			//�ù��ɱ�������һ��Ԫ�ص�ֵ
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
