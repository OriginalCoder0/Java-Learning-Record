package study;

/**
 * @program: ClassesCode
 * @description: ѧϰ�ӿڵ�ʹ��
 * @author: OriginalCoder
 * @create: 2020-10-13 23:00
 **/
interface Animal {
    int ID = 1;                     //����ȫ�ֱ���
    void breathe();                 //������󷽷�
    //����һ��Ĭ�Ϸ���
    default void getType(String type) {
        System.out.println("�ö�������" + type);
    }

    //���徲̬����
    static int getID() {
        return Animal.ID;
    }
}
//Dog��ʵ����Animal�Ľӿ�
class Dog implements Animal {
    //ʵ��breathe()����
    public void breathe() {
        System.out.println("���ں���");
    }
}
//���������
public class Example01 {
    public static void main(String[] args) {
        System.out.println(Animal.getID());         //ͨ���ӿ��������෽��
        Dog dog = new Dog();                        //����Dog���ʵ������
        System.out.println(dog.ID);                 //��ʵ�����л�ȡ�ӿ�ȫ�ֳ���
        dog.breathe();                              //����dog������breathe()����
        dog.getType("Ȯ��");                         //ͨ���ӿ�ʵ����Dog��ʵ�������󣬵��ýӿ�Ĭ�Ϸ���
    }
}
