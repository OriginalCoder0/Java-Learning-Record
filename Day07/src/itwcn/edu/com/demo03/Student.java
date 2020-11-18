package itwcn.edu.com.demo03;

/**
 * @program: Student
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/11/18 21:46
 **/

public class Student {
    private int id;         //ѧ��
    private String name;    //����
    private int age;        //����
    static String room;     //���ڽ���

    private static int idCounter = 0;   //ѧ�ż�������ÿ��newһ���¶����ʱ�򣬼�����++

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
