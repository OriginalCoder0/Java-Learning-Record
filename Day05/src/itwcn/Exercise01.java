package itwcn;

/**
 * @program: Day05
 * @description: 作业练习
 * @author: OriginalCoder
 * @create: 2020-10-07 21:13
 **/
public class Exercise01 {

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    //属性变量，描述动物的品种
    private String kind = null;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    //属性变量，描述动物的大小
    private String size = "大";

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //属性变量，描述动物的性别
    private String sex = "公";

    public float getWeight() {
        if(weight<=0) {
            System.out.println("小老虎的体重不能小于等于0哦~");
        }
        return this.weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    //属性变量，描述动物的体重
    private float weight = 0.0f;

    public String toString() {
        System.out.println("我是：" + getKind() + ",性别：" + getSex()
                + ",体型大小：" + getSize() + ",体重：" +
                getWeight() + "kg");
        return null;
    }

    public static void main(String[] args) {
        Exercise01 exercise01 = new Exercise01();
        exercise01.setKind("小老虎");
        exercise01.setSex("雌性");
        exercise01.setSize("小");
        exercise01.setWeight(100);
        exercise01.toString();
    }


}
