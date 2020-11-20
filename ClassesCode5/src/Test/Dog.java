package Test;

/**
 * @program: ClassesCode
 * @description:
 * @author: OriginalCoder
 * @create: 2020-10-13 21:23
 **/

//实体类
public class Dog extends Animal{
    public Dog(){
        super();        //重写父类的无参构造函数
    }
    public Dog(String k) {
        super(k);       //重写父类的有一个参数的构造函数
    }


    private int size = 0;       //尺寸

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if(size<=0) {
            System.out.println("非法数据");
            return;
        }
        this.size = size;
    }

    @Override       //表示重写父类的同名方法
    public double move() {
        return 60;
    }


}
