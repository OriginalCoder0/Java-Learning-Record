/**
 *
 */
package itwcn;

/**
 * @author Administrator
 *
 */
//定义接口Animal
interface Animal10 {
    void shout();				//定义抽象shout()方法
}
//定义Cat类实现Animal接口
class Cat10 implements Animal10 {
    //实现接口shout方法
    public void shout() {
        System.out.println("喵喵喵");
    }
    public void catchMouse() {
        System.out.println("小喵抓老鼠");
    }
}
//定义Dog类实现Animal接口
class Dog10 implements Animal10 {
    //实现接口shout()方法
    public void shout() {
        System.out.println("汪汪汪");
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
            System.out.println("该类型的对象不是Cat类型");
        }
    }
}
