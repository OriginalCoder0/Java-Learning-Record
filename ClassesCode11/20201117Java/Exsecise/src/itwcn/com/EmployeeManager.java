package itwcn.com;

/**
 * 管理类，定义员工管理的方法
 * @author Administrator
 */
public class EmployeeManager{
    /**声明一个数组变量，没有引用对象**/
    private Employee[] empA = null;

    public EmployeeManager() {
        /**在创建管理对象时，创建数组对象**/
        empA = new Employee[24];
    }

    /**
     * 添加员工对象到管理器的数组
     * @param i 员工的索引
     * @param e 一个员工对象
     */
    public void addEmployee(int i,Employee e) throws Exception {
        if(i >= 24) {
            throw new Exception("员工编号的索引超出了数组的边界");
        }
        empA[i] = e;
    }

    /**计算并返回平均工资**/
    public double getAvg() {
        double average =0.0,sum = 0.0;
        for (int i = 0; i < 24; i++) {
            sum = (sum + empA[i].getSalary());
        }
        average = sum/24;
        /**求平均值**/
        return average;
    }
    /**计算并返回薪资的标准差 Standard Deviation**/
    /**
     * s为标准差，sqrt表示开根号，x1,x2,x3...是薪资数据，x是平均数，n为数据的个数
     * 计算公式：s = sqrt[[(x1-x)^2+(x2-x)^2+...+(xn-x)^2]/(1/n)]
     * @return 返回标准差
     */
    public double getSD() {
        double deviation = 0.0;
        double [] arr = new double[24];

        double b = 0.0,sum = 0.0;
        for (int i = 0; i < 24; i++) {
            arr[i] = Math.pow((empA[i].getSalary() - getAvg()),2);
            sum += arr[i];
        }
        b = sum/24;
        deviation = Math.sqrt(sum);

        return deviation;
    }
    /**计算并返回薪资的中位数**/
    public double getMidNumber() {
        //排序之后的中间数据，如果是偶数个数，取中间的2个元素的平均值
        double s1 = 0.00;
        double s2 = 0.00;

        try {
            //在求中位数之前先排序
            bubbleSort();
            s1 = empA[11].getSalary();
            s2 = empA[12].getSalary();

        } catch (Exception e) {
            e.printStackTrace();
        }
        //中位数，中间两位数的平均值
        return (s1 + s2)/2.0;
    }

    private void bubbleSort() {
        int n = 1;
        for (int i = 1;i<empA.length-1;i++) {
            for (int j = 0; j < empA.length-1-i; j++) {
                Employee temp = null;
                if (empA[i] == null && empA[i+1] == null) {
                    continue;
                }
                if(empA[i].getSalary()>empA[i+1].getSalary()) {
                    //置换相邻的两个元素所引用的对象
                    temp = empA[i];
                    empA[i] = empA[i+1];
                    empA[i+1] = temp;
                }
            }
        }
    }
}