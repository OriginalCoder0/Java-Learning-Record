package Animal;

/**
 * @program: Demo02
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/10 19:50
 **/


//����Animal�ӿ�
interface Animala {
    int ID = 1;         //����ȫ�ֱ���
    void breathe();     //������󷽷�breathe()
    //����һ��Ĭ�Ϸ���
    default void getType(String type) {
        System.out.println("�ö������ڣ�" + type);
    }
    //����һ����̬����
    static int getID() {
        return Animala.ID;
    }
}

//Dog��ʵ��Animal�ӿ�
class Dog implements Animala {
    //ʵ��breathe()����
    public void breathe() {
        System.out.println("������˯����");
    }
}
//���������
public class Demo02 {
    public static void main(String[] args) {
        System.out.println(Animala.getID());            //ͨ���ӿ��������෽��
        Dog dog = new Dog();                            //����Dog��ʵ������
        System.out.println(dog.ID);                     //��ʵ�����л�ȡ�ӿڵ�ȫ�ֳ���
        dog.breathe();                                  //����dog�����breathe()����
        dog.getType("Ȯ��");                             //ͨ���ӿ�ʵ����Dog��ʵ�������󣬵��ýӿ�Ĭ�Ϸ���
    }
}
