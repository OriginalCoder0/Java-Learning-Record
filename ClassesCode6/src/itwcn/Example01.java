/**
 *
 */
package itwcn;

/**
 * @author Administrator
 *
 */
//定义抽象类Animal
abstract class Animal {
    abstract void shout();
}
class Cat extends Animal{
    //实现shout()方法
    public void shout() {
        System.out.println("喵喵喵!");
    }
}

class Dog extends Animal{
    //实现shout()方法
    public void shout() {
        System.out.println("汪汪汪");
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
