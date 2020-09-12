package day02;

/**
 * @program: Day02
 * @description: 了解数组越界和空指针问题，熟悉相关操作
 * @author: OriginalCoder
 * @create: 2020-09-12 16:36
 **/

/**
 * 每个数组都有索引范围，即0~lenght-1,在访问数组时，不能超出这个范围，否则就会出现访问数组越界的问题
 */

public class Exercise06 {
    public static void main(String[] args) {
        int[] arr = new int[4];                 //定义一个长度为4的数组
        System.out.println("arr[4]="+arr[4]);   //通过角标4访问数组元素
    }
}




/**以下代码会出现报错信息，将变量arr置为null,NullPointerException,即空指针出现异常
 *
 */
//public class Exercise06 {
//    public static void main(String[] args) {
//        int[] arr = new int[3];                     //定义一个长度为3的数组
//        arr[0] = 5;                                 //为数组的第一个元素赋值
//        System.out.println("arr[0]="+arr[0]);       //访问数组的元素
//        arr = null;
//        System.out.println("arr[0]="+arr[0]);       //再次访问数组的元素
//    }
//}

