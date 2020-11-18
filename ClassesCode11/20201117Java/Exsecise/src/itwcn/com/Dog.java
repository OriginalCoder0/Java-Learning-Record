package itwcn.com;

/**
 * @author Administrator
 */
public class Dog {

    public Dog() {
    }

    /**
     * 构造方法的重载
     * @param k
     */
    public Dog(String k) {
        this.setKind(k);
    }

    public Dog(String k, String n) {
        this.setKind(k);
        this.setName(n);
    }

    public Dog(String k, String n, double w) throws Exception {
        this.setKind(k);
        this.setName(n);
        this.setWeight(w);
    }

    private String kind = null;
    private String name = null;
    private double weight = 0.00;
    /**
     * 获取品种属性值
     * **/
    public String getKind() {
        return kind;
    }
    /**
     * 设置品种属性值
     * **/
    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double w) throws Exception {
        if(w>0) {
            this.weight = w;
        } else {
            throw new Exception("体重必须大于0！");
        }
    }
    public void showInfo() {
        System.out.println("我是一只：" + getKind() + "，我叫：" + getName() + "，我的体重是：" + getWeight());
    }

}
