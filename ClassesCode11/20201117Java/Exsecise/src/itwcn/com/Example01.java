package itwcn.com;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class Example01 {
    public static void main(String[] args)  {
        /**
         * 调用无参数的构造方法创建对象
         */
        Dog dog = new Dog();
        dog.setKind("金毛");
        dog.setName("豆豆");
        try {
            //捕获异常
            dog.setWeight(7.0);

        } catch (Exception e){
            e.printStackTrace();
        }
        dog.showInfo();
        /**创建数组对象，数组元素的类型是Dog**/
        Dog[] dA = new Dog[4];
        //将一个已经存在的对象变量的值赋值给0号元素
        dA[0] = dog;
        try {
            dA[1] = new Dog("中华田园犬","大黄",25);
            dA[2] = new Dog("金毛","逗逗",35);
            dA[3] = new Dog("萨摩耶","大白",30);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //基于Java数组或集合的遍历循环结构。变量d依次引用数组当中的每个元素
        for (Dog d:dA) {
            if(d != null) {
                d.showInfo();
            }
        }

//        List<String> list = new ArrayList<String>();
//        Scanner sc = new Scanner(System.in);
//        BigInteger dogName = sc.nextBigInteger();
//        list.add("金毛");
    }
}
