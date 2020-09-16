package itwcn;

/**
 * @program: TestCode
 * @description: 判断101-200之间有多少个素数，并输出所有素数。
 * @author: OriginalCoder
 * @create: 2020-09-16 14:41
 **/
public class Exercise02 {
    public static void main(String[] args) {
        getPrimeNumber(101,200);
    }
    /**
     * 判断a和b之间有多少素数
     */
    public static void getPrimeNumber(int a,int b) {
        int sum = 0;
        if (a >= b) {
            System.out.println("a不能大于b");
        }
        System.out.print("素数：");
        for (int i = a; i <= b; i++) {
            if (isPrimeNumber(i)) {
                sum += 1;
                System.out.print(i+" ");
            }
        }
        System.out.println( );
        System.out.println("存在"+sum+"个素数");
    }
    private static boolean isPrimeNumber(int i) {
        boolean flag = true;
        for (int j = 2; j < i/2; j++) {
            if(i%j == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }


}
