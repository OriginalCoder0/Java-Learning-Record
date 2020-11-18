package itwcn.com;

/**
 * �����࣬����Ա������ķ���
 * @author Administrator
 */
public class EmployeeManager{
    /**����һ�����������û�����ö���**/
    private Employee[] empA = null;

    public EmployeeManager() {
        /**�ڴ����������ʱ�������������**/
        empA = new Employee[24];
    }

    /**
     * ���Ա�����󵽹�����������
     * @param i Ա��������
     * @param e һ��Ա������
     */
    public void addEmployee(int i,Employee e) throws Exception {
        if(i >= 24) {
            throw new Exception("Ա����ŵ���������������ı߽�");
        }
        empA[i] = e;
    }

    /**���㲢����ƽ������**/
    public double getAvg() {
        double average =0.0,sum = 0.0;
        for (int i = 0; i < 24; i++) {
            sum = (sum + empA[i].getSalary());
        }
        average = sum/24;
        /**��ƽ��ֵ**/
        return average;
    }
    /**���㲢����н�ʵı�׼�� Standard Deviation**/
    /**
     * sΪ��׼�sqrt��ʾ�����ţ�x1,x2,x3...��н�����ݣ�x��ƽ������nΪ���ݵĸ���
     * ���㹫ʽ��s = sqrt[[(x1-x)^2+(x2-x)^2+...+(xn-x)^2]/(1/n)]
     * @return ���ر�׼��
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
    /**���㲢����н�ʵ���λ��**/
    public double getMidNumber() {
        //����֮����м����ݣ������ż��������ȡ�м��2��Ԫ�ص�ƽ��ֵ
        double s1 = 0.00;
        double s2 = 0.00;

        try {
            //������λ��֮ǰ������
            bubbleSort();
            s1 = empA[11].getSalary();
            s2 = empA[12].getSalary();

        } catch (Exception e) {
            e.printStackTrace();
        }
        //��λ�����м���λ����ƽ��ֵ
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
                    //�û����ڵ�����Ԫ�������õĶ���
                    temp = empA[i];
                    empA[i] = empA[i+1];
                    empA[i+1] = temp;
                }
            }
        }
    }
}