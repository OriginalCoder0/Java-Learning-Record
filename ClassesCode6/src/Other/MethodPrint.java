package other;

/**
 * @program: ClassCode
 * @description: 要求打印多少次
 * @author: OriginalCoder
 * @create: 2020-10-20 18:42
 **/
public class MethodPrint {
    public static void main(String[] args) {
        printCount(5);
    }
    /**
     * 三要素：
     * 返回值类型：进行打印操作，没有参数，也没有结果返回给调用处
     * 方法名称：printCount
     * 参数列表：到底要打印多少次？
     */
    public static void printCount(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("Hello!" + (i+1));
        }
    }
}
