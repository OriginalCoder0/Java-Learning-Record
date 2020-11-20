package Extends.demo07;


import java.util.ArrayList;

/**
 * @program: Demo05ArrayListBasic
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/14 10:18
 **/

/*
    从JDK 1.5开始，支持自动装箱，自动拆箱

    自动装箱：基本类型--->引用类型（包装类型）
    自动拆箱：包装类型--->基本类型
 */

/**
 * 如果希望向集合ArrayList当中存储基本数据类型，必须使用基本类型对应的”包装类“
 *
 * 基本类型             包装类(引用类型，包装类都位于java.lang包下)
 * byte                Byte
 * short               Short
 * int                 Integer          【特殊】
 * float               Float
 * double              Double
 * char                Character         【特殊】
 * boolean             Boolean
 *
 */
public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        //下面是错误写法，泛型只能是引用类型，不能是基本类型
//        ArrayList<int> listB = new ArrayList<>();

        ArrayList<Integer> listC = new ArrayList<>();
        listC.add(100);
        listC.add(200);
        System.out.println(listC);
        //[100,200]

        int num = listC.get(1);
        System.out.println("第1号元素是： "+num);
    }
}
