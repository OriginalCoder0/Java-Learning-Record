package itwcn.edu.com.demo03;

/**
 * @program: Demo01StaticField
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/18 21:44
 **/

/**
 * ���һ����Ա����ʹ����static�ؼ��֣���ô��������������ڶ����Լ��������������ڵ��ࡣ���������ͬһ������
 */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("����",19);
        one.room = "101����";
        Student two = new Student("����",17);

        System.out.println("������" + one.getName() + ",���䣺"
                + one.getAge() + ",���ң�" + one.room
                + ",ѧ�ţ�" + one.getId());
        System.out.println("������" + two.getName() + ",���䣺"
                + two.getAge() + ",���ң�" + two.room
                + ",ѧ�ţ�" + two.getId());

    }

}
