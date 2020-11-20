package Extends.demo01;
/**
 * @program: Demo02Person
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/27 20:17
 **/

public class Demo02Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "菜鸟";
//        person.age = -20;       //直接访问private内容，是错误写法
        person.setAge(-20);
        //间接访问private的setAge成员方法
        person.show();  //年龄显示-20，数据不合法
    }
}
