package day02;

/**
 * @program: Day02
 * @description: 了解Java不同数据类型元素的默认值
 * @author: OriginalCoder
 * @create: 2020-09-12 15:15
 **/

/**
 *          数据类型                     |           默认初始化值
 *          byte、short、int、long       |           0
 *          float、double               |           0.0
 *          char                        |           一个空字符，即‘\u0000’
 *          boolean                     |           false
 *          应用数据类型                  |           null,表示变量不引用任何对象
 */
public class Exercise05 {
    public static void main(String[] args) {
        //1.第一种方式定义数组
        int[] ids = new int[100];
        System.out.println("ids[0]="+ids[0]);       //访问数组的第一个元素
        //为数组指定元素进行初始化赋值
        ids[0] = 2500;
        System.out.println("ids[0]="+ids[0]);       //再次访问数组第一个元素
        System.out.println("==============");
        //2.第二种方式定义数组
        String[] names = new String[] {"张三","Tom","Jack"};
        System.out.println("names[0]="+names[0]);   //访问数组的第一个元素
        //为数组定义时指定的初始值进行修改
        names[0] = "李四";
        System.out.println("names[0]="+names[0]);   //再次访问数组第一个元素
        System.out.println("==============");
        //3.第三种方式定义数组
        Object[] object = {"张三","Tom","Jack"};
        System.out.println("object[0]="+object[0]);    //访问数组第一个元素
        object[0] = "李四";
        System.out.println("object[0]="+object[0]);    //再次访问数组第一个元素
    }
}
