/**
 *
 */
package cn;

/**
 * @author Administrator
 *
 */
public class TestExample {

    private String strB = null;



    /**�Զ��巽��������ð������*/
    private static void SortBob() {
        int N = 0;
        int i = 0;
        int[] iA = new int[] {8,3,1,5,2};
        int n = iA.length;   // �������ĳ�������ֵ��¼��Ԫ�صĸ���
        for(N=0;N<n-1;N++) { // ���ƱȽϵ��ִ�
            for(i=0;i<n-1-N;i++) { // �������ݵ������ȽϵĴ���
                if(iA[i]>iA[i+1]) {
                    // �û������������ݵ�λ�ã�
                    int t = iA[i];
                    iA[i] = iA[i+1];
                    iA[i+1] = t;
                }
            }
        }
        for(i=0;i<n;i++) {
            System.out.print(iA[i] + "  ");
        }
        System.out.println();
    }

    /**�Զ��徲̬����*/
    private static void ArrayExam() {
        // �洢100��Ա���Ĺ��ʣ�
        float[] fPay = new float[100]; // �����¶���100��Ԫ�صĸ���
        for (int i = 0; i < 100; i++) {
            if (i < 10) {
                fPay[i] = 5800;
            } else {
                fPay[i] = 3800;
            }
        }
        float fMax = 0.0f; // �������ֵ
        double dSum = 0.00; // �����ۼ�ֵ
        // ����ƽ�����ʣ����ҳ����ֵ��
        for (int i = 0; i < 100; i++) {
            dSum = dSum + fPay[i];
            if (fPay[i] > fMax) {
                fMax = fPay[i]; // ��ʱ��Ϊ���ֵ
            }
        }
        double dAve = dSum / 100; // ����ƽ��ֵ
        System.out.println("��߹��� = " + fMax + ";ƽ������ = " + dAve);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        Bird b = new Bird();  // ���������
        b.setKind("ϲȵ");
        b.setColor("��ɫ");
        System.out.println(b.say());
        System.out.println("����һֻ" + b.getKind() + ",��ɫ�ǣ�" + b.getColor());

        //---
        b = new Bird();  // ���������
        b.setKind("��ѻ");
        b.setColor("��ɫ");
        System.out.println("����һֻ" + b.getKind() + ",��ɫ�ǣ�" + b.getColor());

        //SortBob();    // ִ������

		/*
		//ʹ���Զ����ഴ������
		Dog dog = new Dog();  // ����Dog���󣬲���ֵ�� dog ����

		dog.setKind("̩��");
		dog.setColor("��ɫ");
		dog.setSex("ĸ");
		//dog.weight = -2.5f;  // ֱ���������Ա�����ֵ��
		dog.setWeight(-5);

		dog.move(50);
		String strA = dog.toString();
		System.out.println(strA);

		dog = new Dog();  // ����Dog���󣬲���ֵ�� dog ����
		dog.setKind("�л���԰Ȯ");
		dog.setColor("��ɫ");
		dog.setSex("��");
		dog.setWeight(15);

		dog.move(60);
		strA = dog.toString();
		System.out.println(strA);

		dog = null;  // ���������������κζ���
		             // java�������ջ����Զ�ɾ���ڴ��еĶ������Ա�����ֵ

		//ArrayExam();  // ִ���Զ��巽��
		*/
    }

}
