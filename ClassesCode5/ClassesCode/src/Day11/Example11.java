package Day11;

/**
 * @program: ClassesCode
 * @description: ѧϰ��̬
 * @author: OriginalCoder
 * @create: 2020-10-19 22:43
 **/
//���������Animal
abstract class Animal {
    abstract void shout();              //�������shout()����
}
//����Cat��̳�Animal������
class Cat extends Animal {
    //ʵ��shout()����
    public void shout() {
        System.out.println("������~");
    }
}
//����Dog��̳�Animal������
class Dog extends Animal {
    //ʵ��shout()����
    public void shout() {
        System.out.println("������~");
    }
}
public class Example11 {
    public static void main(String[] args) {
        Animal an1 = new Cat();
        Animal an2 = new Dog();
        an1.shout();
        an2.shout();
    }
}
