package Test;

/**
 * @program: ClassesCode
 * @description:
 * @author: OriginalCoder
 * @create: 2020-10-13 21:39
 **/
public class Test {
    public static void main(String[] args) {
        Dog dog  = new Dog();
        dog.setKind("中华田园犬");
        dog.setWeight(8);

        Dog dog2 = dog;
        dog2.setKind("金毛犬");
        System.out.println("dog对象引用的对象品种：" + dog.getKind());
        dog.setKind("中华田园犬");
        System.out.println("dog2对象引用的对象品种：" + dog2.getKind());

        System.out.println("我是" + dog2.getKind() + ";能以每小时" + dog2.move() + "公里的速度运动");

        Fish f1 = new Fish();
        f1.setKind("鲨鱼");
        f1.setWeight(3000);
        System.out.println("我是" + f1.getKind() + ";能以每小时" + f1.move() + "公里速度运动！");
    }
}
