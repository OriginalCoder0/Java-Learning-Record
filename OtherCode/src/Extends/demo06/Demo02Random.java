package Extends.demo06;

import java.util.Random;

/**
 * @program: Demo02Random
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/28 22:23
 **/

public class Demo02Random {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10);
            //��Χʵ������0~9
            System.out.println("������ǣ�" + num);
        }
    }
}
