package day02;

/**
 * @program: Day02
 * @description: 学习如何定义数组和访问数组中的元素
 * @author: OriginalCoder
 * @create: 2020-09-12 14:23
 **/
public class Exercise04 {
    public static void main(String[] args) {
        //1.第1种方式定义属组
        int[] ids = new int[100];
        System.out.println("ids[0]="+ids[0]);               //访问数组的第一个元素
        System.out.println("ids[99]="+ids[99]);             //访问数组的最后一个元素
        System.out.println("==================");
        //2.第2中方式定义数组
        String[] names = new String[]{"张三","Tom","Jack"};
        System.out.println("names[0]="+names[0]);           //访问数组的第一个元素
        System.out.println("names[2]="+names[2]);           //访问数组的最后一个元素
        System.out.println("==================");
        //3.第3种方式定义数组
        Object[] object = {"张三","Tom","Jack"};
        System.out.println("数组的长度为："+object.length);    //获取数组的长度
        System.out.println("object[0]="+object[0]);          //访问数组的第一个元素
        System.out.println("object[2]="+object[2]);          //访问数组的最后一个元素
    }
}
