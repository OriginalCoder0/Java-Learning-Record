package Extends.demo07;


/**
 * @program: Demo02ArrayList
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/28 23:37
 **/

import java.util.ArrayList;

/**
 * ����
 * ����ĳ������޷��ı��
 * ����ArrayList���ϵĳ����ǿ�������ı��
 *
 * ����ArrayList��˵����һ��������<E>������
 * ���ͣ�Ҳ����װ�ڼ��ϵ��е�����Ԫ�أ�ȫ����ͳһ�����ͣ�String����String��int����int
 * ע�⣺����ֻ�����������ͣ������ǻ�������
 *
 * ע�����
 * ����ArrayList������˵��ֱ�Ӵ�ӡ�õ��Ĳ��ǵ�ֵַ����������
 * �������Ϊ�գ��õ����ǿյ������ţ�[]
 */
public class Demo02ArrayList {
    public static void main(String[] args) {
        //������һ��ArrayList���ϣ����ϵ�������list������ȫ����String�ַ������͵�����
        //��ע����JDK1.7��ʼ���Ҳ�ļ������ڲ����Բ�д���ݣ�����<>������Ҫд
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        //�򼯺ϵ������һЩ���ݣ���Ҫ�õ�add����
        list.add("����");
        System.out.println(list);

        //��add�˶�����ݵ�ʱ�򣬻Ὣ����׷���������ĩβ
        list.add("����");
        list.add("��ţ");
        list.add("��");
        System.out.println(list);   //[����, ����, ��ţ, ��]
    }
}
