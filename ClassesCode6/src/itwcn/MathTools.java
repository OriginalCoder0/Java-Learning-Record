/**
 *
 */
package itwcn;

/**
 * @author Administrator
 *
 */
public class MathTools {
    //计算球体积的方法
    public static double getVolume(double r) {
        double dV = (4.0/3) * r * r * r;
        return dV;
    }
    //计算球面积的方法
    public static double getArea(double r,double pi) {
        double dA = 4 * pi * r * r;
        return dA;
    }

}
