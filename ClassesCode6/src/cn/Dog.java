/**
 *
 */
package cn;

/**
 * @author Administrator
 *
 */
public class Dog extends Animal {

    /**无参数的构造方法*/
    public Dog() {
        super();  // 执行父类的构造函数
    }

    /**
     * 重载的带参数的构造函数
     *
     * @param k 描述狗的品种
     * */
    public Dog(String k) {
        super();
        this.kind = k;  // 在创建对象时确定狗的品种
    }

    /**
     * 重载的带参数的构造函数
     *
     * @param k 描述狗的品种
     * */
    public Dog(float w) {
        super();
        this.setWeight(w);
    }

    /**
     * 重载的带参数的构造函数
     *
     * @param k 描述狗的品种
     * @param w 描述狗的体重
     * */
    public Dog(String k, float w) {
        super();
        this.kind = k;  // 在创建对象时确定狗的品种
        this.setWeight(w);  // 调用方法设置新对象的体重
    }

    /**
     * 面向对象的基本特征：封装、继承、多态
     * 封装：将属性变量私有化，不能被其它类直接访问；同时，暴露读写属性值得方法。
     *      可以在属性方法中添加属性参数的合法性验证，避免非法数据的传入。
     * */


    /**宠物昵称*/
    private String name;

    /**耳朵特征*/
    private String ear;
    /**年龄*/
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEar() {
        return ear;
    }
    public void setEar(String ear) {
        this.ear = ear;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age<=0) {
            System.out.println("年龄不能小于等于 0 ！");
            return;
        }
        this.age = age;
    }
    /**描述狗狗奔跑的行为*/
    public void move(double s) {
        System.out.println("我能以每小时"+ s +"公里的速度奔跑！");
    }

    /**描述狗狗叫的行为*/
    public void woof() {
        System.out.println("我发现了可疑的人，主人请注意了！");
    }

    @Override
    public String move() {
        return "我的品种：" + kind + "，体重：" + weight;
    }

    /**重载方法：描述狗狗奔跑的行为*/
    public String move(String method, double s) {
        return "我能以每小时"+ s +"公里的速度奔跑！";
    }

}
