package Test;

/**
 * @program: ClassCode
 * @description:
 * @author: OriginalCoder
 * @create: 2020-10-23 22:39
 **/
import java.util.Scanner;

public class oder {

    Scanner input = new Scanner(System.in);

    String[] names = new String[5];// ���涩��������
    String[] dishMegs = new String[5];// ������ѡ��Ʒ��
    int[] dishNums = new int[5];// ������ѡ��Ʒ����
    int[] times = new int[5];// �����Ͳ�ʱ��
    String[] addresses = new String[5];// �����Ͳ͵�ַ
    int[] states = new int[5];// ���涩��״̬��0��ʾ��Ԥ����1��ʾ�����
    double[] sumPrices = new double[5];// ���涩�����ܽ��

    int[] praiseNums = new int[5];

    String[] dishNames = { "���̼�", "�ɹ�Ѽ", "ˮ����", "���Ŷ���", "���˴�Ϻ" };
    double[] prices = { 20.0, 25.0, 10.0, 30.0, 20.0 };

    public void init() {
// ��ʼ��3��������Ϣ
// ��1��
        names[0] = "����";
        dishMegs[0] = "���̼�";
        dishNums[0] = 3;
        times[0] = 12;
        addresses[0] = "����·";
        states[0] = 0;
        sumPrices[0] = 60.0;
// ��2��
        names[1] = "����";
        dishMegs[1] = "���Ŷ���";
        dishNums[1] = 2;
        times[1] = 19;
        addresses[1] = "�Ͼ�·";
        states[1] = 1;
        sumPrices[1] = 60.0;
// ��3��
        names[2] = "����";
        dishMegs[2] = "ˮ����";
        dishNums[2] = 1;
        times[2] = 19;
        addresses[2] = "���·";
        states[2] = 1;
        sumPrices[2] = 15.0;
    }

    public void display() {
        System.out.println("***�鿴�ʹ�***");
        System.out
                .println("���\t\t������\t\t��Ʒ����\t\t��Ʒ����\t\t�Ͳ�ʱ��\t\t�Ͳ͵�ַ\t\t�ܽ��\t\t����״̬");
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                String state = (states[i] == 0) ? "��Ԥ��" : "�����";
                System.out.println((i + 1) + "\t\t" + names[i] + "\t\t"
                        + dishMegs[i] + "\t\t" + dishNums[i] + "��" + "\t\t"
                        + times[i] + "\t\t" + addresses[i] + "\t\t"
                        + sumPrices[i] + "Ԫ" + "\t\t" + state);
            }
        }
    }

    public void add() {
        System.out.println("***��Ҫ����***");
        boolean isAdd = false;// ��¼�Ƿ���Ե��
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                isAdd = false;
                System.out.print("�����붩����������");
                String name = input.next();
                System.out.println("���" + "\t\t" + "����" + "\t\t" + "����"
                        + "\t\t" + "������");
                for (int j = 0; j < dishNames.length; j++) {
                    System.out.println((j + 1) + "\t\t" + dishNames[j] + "\t\t"
                            + prices[j] + "Ԫ" + "\t\t" + praiseNums[j]);
                }
                System.out.print("��ѡ����Ҫ��Ĳ�Ʒ��ţ�");
                int chooseDish = input.nextInt();
                String dishMeg = dishNames[chooseDish - 1];
                System.out.print("��ѡ������Ҫ�ķ�����");
                int number = input.nextInt();
                System.out.print("�������Ͳ�ʱ�䣨�Ͳ�ʱ����10����20��������Ͳͣ���");
                int time = input.nextInt();
                while (time < 10 || time > 20) {
                    System.out.print("������������������10-20�������");
                    time = input.nextInt();
                }
                System.out.print("�������Ͳ͵�ַ��");
                String address = input.next();
// Ĭ�Ͽ���Ԥ��������д����״̬
                System.out.println("���ͳɹ���");
                System.out.println("�������ǣ�" + dishNames[chooseDish - 1] + number
                        + "��");
                System.out.println("�Ͳ�ʱ�䣺" + time + "��");
                double sumPrice = prices[chooseDish - 1] * number;// ����ͷ�
                double sendMoney = (sumPrice >= 50) ? 0 : 5;// �����Ͳͷ�
                System.out.println("�ͷѣ�" + sumPrice + "Ԫ��" + "�Ͳͷ�" + sendMoney
                        + "Ԫ��" + "�ܼƣ�" + (sumPrice + sendMoney) + "Ԫ��");
// �������
                names[i] = name;
                dishMegs[i] = dishMeg;
                times[i] = time;
                dishNums[i] = number;
                addresses[i] = address;
                sumPrices[i] = sumPrice + sendMoney;
                break;
            }
            if (isAdd) {
                System.out.println("�Բ������Ĳʹ�������");
            }
        }
    }

    public void delete() {
        System.out.println("***ɾ������***");
        boolean isDelFind = false;
        System.out.print("������Ҫɾ���Ķ�����ţ�");
        int delID = input.nextInt();
        for (int i = 0; i < names.length; i++) {
// ����״ֵ̬�ж��ܲ���ɾ����ֻ������ɵĲ���ɾ��
            if (names[i] != null && states[i] == 1 && delID == i + 1) {
                isDelFind = true;
                for (int j = delID - 1; j < names.length - 1; j++) {
                    names[j] = names[j + 1];
                    dishMegs[j] = dishMegs[j + 1];
                    dishNums[j] = dishNums[j + 1];
                    times[j] = times[j + 1];
                    addresses[j] = addresses[j + 1];
                    states[j] = states[j + 1];
                    sumPrices[j] = sumPrices[j + 1];
                }
// �����һλ���
                names[names.length - 1] = null;
                dishMegs[names.length - 1] = null;
                dishNums[names.length - 1] = 0;
                times[names.length - 1] = 0;
                addresses[names.length - 1] = null;
                states[names.length - 1] = 0;
                sumPrices[names.length - 1] = 0;
                System.out.println("ɾ�������ɹ���");
                break;
            } else if (names[i] != null && states[i] == 0 && delID == i + 1) {
                isDelFind = true;
                System.out.println("��ѡ��Ķ���δǩ�գ�����ɾ����");
                break;
            }
        } // δ�ҵ��Ķ�������ɾ��
        if (!isDelFind) {
            System.out.println("��Ҫɾ���Ķ��������ڣ�");
        }
    }
}