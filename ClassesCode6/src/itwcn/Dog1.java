/**
 *
 */
package itwcn;

/**
 * @author Administrator
 *
 */
public class Dog1 {
    int i = 0;
    private String kind ="Ʒ��";
    public void setKind(String k) {
        this.kind = k;
    }
    public String setKind() {
        return kind;
    }
    private double weight=0.00;
    public double getweight() {
        return weight;
    }
    public void setweight(double weight) {
        this.weight =weight;
    }
    public void showInfo() {
        String strInfo ="����"+this.kind+"������"+this.weight;
        System.out.println(strInfo);
    }
}
