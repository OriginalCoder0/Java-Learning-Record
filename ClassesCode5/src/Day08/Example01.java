package Day08;
/**
 * @program: ClassesCode
 * @description: ѧϰ������ͽӿ�
 * @author: OriginalCoder
 * @create: 2020-10-19 21:39
 **/

//���������Animal
abstract class Animal {
    //������󷽷�
    public abstract void shout();
}
//����Dog��̳г�����Animal
class Dog extends Animal {
    //ʵ�ֳ��󷽷�shout(),��д������
    public void shout() {
        System.out.println("������~");
    }
}
//���������
public class Example01 {
    public static void main(String[] args) {
        Dog dog = new Dog();            //����Dog���ʵ������
        dog.shout();                    //����dog�����shout()����
    }
}
