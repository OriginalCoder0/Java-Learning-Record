/**
 *
 */
package itwcn;

/**
 * @author Administrator
 *
 */
//����ӿ�Animal
interface Animal10 {
    void shout();				//�������shout()����
}
//����Cat��ʵ��Animal�ӿ�
class Cat10 implements Animal10 {
    //ʵ�ֽӿ�shout����
    public void shout() {
        System.out.println("������");
    }
    public void catchMouse() {
        System.out.println("С��ץ����");
    }
}
//����Dog��ʵ��Animal�ӿ�
class Dog10 implements Animal10 {
    //ʵ�ֽӿ�shout()����
    public void shout() {
        System.out.println("������");
    }
}
public class Example03 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Animal10 an1 = new Dog10();
        if(an1 instanceof Cat10) {
            Cat10 cat = (Cat10) an1;
            cat.shout();
            cat.catchMouse();
        } else {
            System.out.println("�����͵Ķ�����Cat����");
        }
    }
}
