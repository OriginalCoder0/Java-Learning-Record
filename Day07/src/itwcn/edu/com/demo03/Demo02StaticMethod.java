package itwcn.edu.com.demo03;

/**
 * @program: Demo02StaticMethod
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/18 22:08
 **/

/**
 * һ��ʹ����static���γ�Ա��������ô��ͳ�Ϊ�˾�̬����
 * ��̬���������ڶ��󣬶���������
 *
 * ���û��static����ô�����ȴ������󣬲���ʹ����
 *
 *
 * �����ǳ�Ա���������ǳ�Ա�������������static�����Ƽ�ʹ�������ƽ��е��á�
 * ��̬������������.��̬����
 * ��̬������������.��̬����()
 *
 *
 * ע�����
 * 1.��̬����ֱ�ӷ��ʷǾ�̬��
 * 2.��̬�����в�����this�ؼ��֡�this����ǰ����ͨ��˭���õķ�����˭���ǵ�ǰ����
 */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();    //���ȴ�������
        obj.method();

        //���ھ�̬������˵������ͨ�����������е��ã�Ҳ����ֱ��ͨ�������������á�
        MyClass.methodStatic();

        //���ڱ��൱�еľ�̬����������ʡ��������
        myMethod();
    }

    public static void myMethod() {
        System.out.println("�Լ��ķ���");
    }

}
