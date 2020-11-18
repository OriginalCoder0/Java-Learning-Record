package itwcn.edu.com.demo03;

/**
 * @program: Demo01StaticField
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/18 21:44
 **/

/**
 * 如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类。多个对象共享同一份数据
 */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("郭靖",19);
        one.room = "101教室";
        Student two = new Student("黄蓉",17);

        System.out.println("姓名：" + one.getName() + ",年龄："
                + one.getAge() + ",教室：" + one.room
                + ",学号：" + one.getId());
        System.out.println("姓名：" + two.getName() + ",年龄："
                + two.getAge() + ",教室：" + two.room
                + ",学号：" + two.getId());

    }

}
