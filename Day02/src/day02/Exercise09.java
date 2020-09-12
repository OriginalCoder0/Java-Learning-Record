package day02;

/**
 * @program: Day02
 * @description: 数组排序之冒泡排序
 * @author: OriginalCoder
 * @create: 2020-09-12 17:29
 **/
public class Exercise09 {
    public static void main(String[] args) {
        int[] arr = {9,8,3,5,2};
        //冒泡排序前，先循环打印数组元素
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"");
        }
        System.out.println();           //换行
        //2.进行冒泡排序
        //2.1 外层循环定义需要比较的论述(两数对比，要比较n-1轮)
        for (int i = 1; i < arr.length; i++) {
            //2.2内层循环定义第i轮需要比较的两个数
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j] > arr[j+1]) {
                    //下面三行代码用于相邻两个元素的交换
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //3.完成冒泡排序以后，再次循环打印数组元素
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"");
        }
    }
}
