/**
 * 
 */
package cn.edu.exam;

/**
 * @author Administrator
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//���Դ��룺
		Publisher p = new Publisher();
		p.setId("P001");
		p.setName("�廪��ѧ������");
		p.setCity("����");
		
		Book[] bA = new Book[41];
		Book book = null;
		for(int i=0;i<41;i++) {
			book = new Book();
			book.setName("Java�������");
			book.setPrice(38.00);
			book.setPublisher(p);
			bA[i] = book;
		}
		
		double sum = 0.0;
		for(int i=0;i<41;i++) {
			sum += bA[i].getPrice();
		}
		
		System.out.println("ȫ��ͬѧ�ġ�"+ book.getName() + "���̲��ܹ����ѣ�" + sum);
		
		
		Fish f = new Fish();
		
		f.setKind("����");
		f.setWeight(2000);
		
		String strKind = f.getKind();	
		double dW = f.getWeight();
		
		System.out.println("����һ���㣬�ҵ�Ʒ���ǣ�" + strKind + 
				           ",���أ�" + dW + "��" +f.move());	
		
		int[] iB = new int[] {8,3,1,5,2,4,32};
		Math.SortBob(iB);
		for(int i=0;i<iB.length;i++) {
			System.out.print(iB[i] + "  ");
		}
		System.out.println();
		
		  // 1. ����һ������dog; null��ʾɶҲû�У����ǶԱ������ڴ�����˳�ʼ����
		Dog dog = new Dog(); //  2. ������һ������;3. ��������׵�ַ���浽�������ڴ��С����Ѷ�����׵�ַ���浽�˱��� dog �С�
		System.out.println("dog������Ʒ��=��" + dog.getKind()+"��");  // ?
		
		Dog dog2 = dog;      // �� dog ���������ֵ���浽 dog2 �����С�
		dog2.setKind("�л���԰Ȯ");
		
		System.out.println("dog������Ʒ��=��" + dog.getKind()+"��");  // ?
		
		// ����һ����������������������
		int[] iA = new int[100];
		System.out.println("iA�Ķ����ţ�" + iA);
		
		double[] iC = new double[10];
		System.out.println("iB�Ķ����ţ�" + iC);
	}

}
