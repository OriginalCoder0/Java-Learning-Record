/**
 *
 */
package itwcn;

/**
 * ʵ���ࣺ����Բ����Ϊ����
 * @author Administrator
 *
 */
public class Circle {
    /**���Ա����������뾶**/
    private double radius = 0.00;
    private final double  Pi = 3.141926;			//������

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        if(r>0) {
            this.radius = r;
        } else {
            System.out.println("���ݲ��Ϸ���");
        }

    }
    /**��ȡԲ�����**/
    public double getArea() {
        return Pi * this.radius * this.radius;
    }
    /**��ȡԲ���ܳ�**/
    public double getLength() {
        return Pi * 2 * this.radius;
    }

}
