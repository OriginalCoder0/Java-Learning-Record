package Day09;

/**
 * @program: ClassesCode
 * @description: ѧϰ�ӿڵ�ʹ��
 * @author: OriginalCoder
 * @create: 2020-10-19 22:01
 **/
//����Animal�ӿ�
interface Animal {
    int ID = 1;                     //����ȫ�ֱ���
    void breathe();                 //������󷽷�breathe()
    //����һ��Ĭ�Ϸ���
    default void getType(String type) {
        System.out.println("�ö������ڣ�" + type);
    }
    //����һ����̬����
    static int getID() {
        return Animal.ID;
    }
}
//Dog��ʵ��Animal�Ľӿ�
class Dog implements Animal {
    //ʵ��breathe()����

    @Override
    public void breathe() {
        System.out.println("���ں���");
    }
}
//���������
public class Example02 {
    public static void main(String[] args) {
        System.out.println(Animal.getID());     //ͨ���ӿ��������෽��
        Dog dog = new Dog();                    //����Dog���ʵ������
        System.out.println(dog.ID);             //��ʵ�����л�ȡ�ӿ�ȫ�ֱ���
        dog.breathe();                          //����dog�����breathe()����
        dog.getType("Ȯ��");                     //ͨ���ӿ�ʵ����Dog��ʵ�������󣬵��ýӿ�Ĭ�Ϸ���
    }
}
