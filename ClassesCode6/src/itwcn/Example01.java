/**
 *
 */
package itwcn;

/**
 * @author Administrator
 *
 */
//���������Animal
abstract class Animal {
    abstract void shout();
}
class Cat extends Animal{
    //ʵ��shout()����
    public void shout() {
        System.out.println("������!");
    }
}

class Dog extends Animal{
    //ʵ��shout()����
    public void shout() {
        System.out.println("������");
    }
}
public class Example01 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Animal an1 = new Dog();
        Animal an2 = new Cat();
        an1.shout();
        an2.shout();
    }

}
