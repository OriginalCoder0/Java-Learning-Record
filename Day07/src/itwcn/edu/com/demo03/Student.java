package itwcn.edu.com.demo03;

/**
 * @program: Student
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/18 21:46
 **/

public class Student {
    private int id;         //学号
    private String name;    //姓名
    private int age;        //年龄
    static String room;     //所在教室

    private static int idCounter = 0;   //学号计数器，每当new一个新对象的时候，计数器++

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student() {
//        idCounter++;
        this.id = ++idCounter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
