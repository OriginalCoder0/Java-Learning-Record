package other;

/**
 * @program: ClassCode
 * @description: 学习判断两值是否一样
 * @author: OriginalCoder
 * @create: 2020-10-20 18:37
 **/
public class Exercise01 {
    public static void main(String[] args) {
        System.out.println(isSame(5,9));
    }
    /**
     * 三要素：
     * 返回值类型：boolean
     * 方法名称：isSame
     * 参数列表：int a,int b
     */
    public static boolean isSame(int a,int b) {
        //方法一：
        /*boolean same;
        if(a == b) {
            same = true;
        } else  {
            same = false;
        }*/

        //方法二：
//        boolean same = a == b ? true : false;
        //方法三：
//        boolean same = a == b;

//        return same;

        //方法四：
        return a == b;
    }
}
