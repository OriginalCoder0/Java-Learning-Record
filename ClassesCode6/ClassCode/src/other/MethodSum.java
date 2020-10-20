package other;

/**
 * @program: ClassCode
 * @description: 用来求1~100的累加和
 * @author: OriginalCoder
 * @create: 2020-10-20 18:38
 **/
public class MethodSum {
    public static void main(String[] args) {
        System.out.println("结果是：" + getSum());
    }

    /**
     * 三要素：
     * 返回值：有返回值，计算结果是一个int数字
     * 方法名称：getSum
     * 参数列表：数据范围已经确定，是固定的，所以不需要说明任何条件，不需要采纳数
     */
    public static int getSum() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum  += i;
        }
        return sum;
    }
}
