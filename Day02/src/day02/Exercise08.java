package day02;

/**
 * @program: Day02
 * @description: 获取数组最值
 * @author: OriginalCoder
 * @create: 2020-09-12 17:12
 **/
public class Exercise08 {
    public static void main(String[] args) {
        //1.定义一个int[]数组
        int[] arr = {5,1,2,7,8,4};
        //2.定义变量max用于记住最大数，首先假设第一个元素为最大值
        int max = arr[0];
        //3.遍历数组，查找最大值
        for (int i = 0; i < arr.length; i++) {
            //比较arr[i]的值是大于max
            if (arr[i] > max) {
                //条件成立，将arr[i]的值赋给max
                max = arr[i];
            }
        }
        System.out.println("数组arr中最大值为："+max);
    }
}
