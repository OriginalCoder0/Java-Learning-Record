/**
 *
 */
package itwcn;

/**
 * @author Administrator
 *
 */
public class MathTools {
    //����������ķ���
    public static double getVolume(double r) {
        double dV = (4.0/3) * r * r * r;
        return dV;
    }
    //����������ķ���
    public static double getArea(double r,double pi) {
        double dA = 4 * pi * r * r;
        return dA;
    }

}
