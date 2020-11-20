package Demo02;

/**
 * @program: ClassCode
 * @description: 访问数组元素进行获取
 * @author: OriginalCoder
 * @create: 2020-10-20 21:28
 **/

/**
 * 使用动态初始化数组的时候，其中的元素将会自动拥有一个默认值，规则如下：
 * 如果是整数型：那么默认为0
 * 如果是浮点型，那么默认为0.0
 * 如果是字符类型，那么默认为‘\u0000’
 * 如果是布尔类型，那么默认为false
 * 如果是引用类型，那么默认为null
 *
 *
 * 注意事项：
 * 静态初始化其实也是有默认值的，只不过系统自动马上将默认值替换成为了大括号当中的具体数值
 */
public class ArrayUse {
    public static void main(String[] args) {
        //静态初始化的省略格式
        int[] arrayA = {10,20,30};
        System.out.println(arrayA);     //内存地址值
        System.out.println(arrayA[0]);  //10
        System.out.println(arrayA[1]);  //20
        System.out.println(arrayA[2]);  //30
        System.out.println("=======");


        //动态初始化一个数组
        int[] arrayB  = new int[3];
        //将数据123赋值交给数组arrayB当中的1号元素
        arrayB[1] = 123;
        System.out.println(arrayB[0]);  //0
        System.out.println(arrayB[1]);  //123
        System.out.println(arrayB[2]);  //0
    }
}







