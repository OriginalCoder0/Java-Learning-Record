package itwcn;

/**
 * @program: Day03
 * @description: 学习方法的递归，方法的递归是指在一个方法的内部调用自身的过程。
 *              递归必须要有结束条件，不然就会陷入无限循环的状态，永远无法结束调用。
 * @author: OriginalCoder
 * @create: 2020-09-15 11:38
 **/
public class Exercise08 {
    //使用递归实现1~n的和
    public static int getSum(int n){
        if (n == 1) {
            //满足条件，递归结束
            return 1;
        }
        int temp = getSum(n-1);
        return temp+n;
    }

    public static void main(String[] args) {
        int sum = getSum(4);                //调用递归方法，获得1~4的和
        System.out.println("sum="+sum);        //打印结果
    }
}
