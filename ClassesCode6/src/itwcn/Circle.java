/**
 *
 */
package itwcn;

/**
 * 实体类：描述圆的行为特征
 * @author Administrator
 *
 */
public class Circle {
    /**属性变量：描述半径**/
    private double radius = 0.00;
    private final double  Pi = 3.141926;			//常变量

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        if(r>0) {
            this.radius = r;
        } else {
            System.out.println("数据不合法！");
        }

    }
    /**获取圆的面积**/
    public double getArea() {
        return Pi * this.radius * this.radius;
    }
    /**获取圆的周长**/
    public double getLength() {
        return Pi * 2 * this.radius;
    }

}
