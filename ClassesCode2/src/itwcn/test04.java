package itwcn;

/**
 * @program: test04
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/20 11:02
 **/
import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class test04 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner =  new Scanner(System.in);
        System.out.println("������ѧ��������");
        String strName = scanner.next();			//�Ӽ��̷���һ���ַ���
        System.out.println("������ѧ���ɼ�: ");
        float fScore = scanner.nextFloat();			//�Ӽ��̻�ȡһ���������ݣ��ɼ�
        String strScore = "������";

        switch((int) fScore) {
            case 90:
                strScore = "����";
                break;
            case 80:
                strScore = "����";
            case 60:
                strScore = "����";
        }
    }

}
