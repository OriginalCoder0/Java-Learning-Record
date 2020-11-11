/**
 *
 */
package itwcn;

/**
 * @author Administrator
 *
 */
public class Example02 {
    /**
     * @param r 球的半径
     */
    //计算球体体积
    private static double getPI() {
        return 3.1415926;
    }
    private static double getVolume(double r,double pi) {
        double dV = 4.0/3 * pi * r * r * r;
        return dV;
    }
    private static double getArea(double r,double pi) {
        double dA = 4 * pi * r * r;
        return dA;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double dVolume = getVolume(5.6,getPI());
        System.out.println("半径为5.6的球体的体积：" + dVolume);
        double dArea = getArea(5.6,getPI());
        System.out.println("半径为5.6的球体的面积：" + dArea);
    }

}
