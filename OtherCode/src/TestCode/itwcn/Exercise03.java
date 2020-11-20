package itwcn;

/**
 * @program: TestCode
 * @description: 打印1000以内的水仙数花数。打印出所有的”水仙花数”，所谓”水仙花数”是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个”水仙花数”，因为153=1的三次方＋5的三次方＋3的三次方。
 * @author: OriginalCoder
 * @create: 2020-09-16 15:38
 **/
public class Exercise03 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if(isNar(i)) {
                System.out.println("水仙花数:"+i);
            }
        }
    }
    public static boolean isNar(int a) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        num3 = a/100;
        num2 = (a-num3*100)/10;
        num1 = a-num3*100-num2*10;
        if (Math.pow(num1,3) + Math.pow(num2,3) + Math.pow(num3,3) == a) {
            return true;
        }
        return false;
    }
}
