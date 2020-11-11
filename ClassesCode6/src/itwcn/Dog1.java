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
    private String kind ="品种";
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
        String strInfo ="我是"+this.kind+"，体重"+this.weight;
        System.out.println(strInfo);
    }
}
