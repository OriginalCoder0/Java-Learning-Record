package itwcn.com;

public class Test {
    public static void main(String[] args) {
        EmployeeManager em = new EmployeeManager();
        try {
            em.addEmployee(0,new Employee("001","����",3456));
            em.addEmployee(1,new Employee("002","������",4452));
            em.addEmployee(2,new Employee("003","����",5550));
            em.addEmployee(3,new Employee("004","���",6523));
            em.addEmployee(4,new Employee("005","������",3465));
            em.addEmployee(5,new Employee("006","���",6456));
            em.addEmployee(6,new Employee("007","��ǿ",5002));
            em.addEmployee(7,new Employee("008","����",4135));
            em.addEmployee(8,new Employee("009","��ε",3600));
            em.addEmployee(9,new Employee("010","����",3598));
            em.addEmployee(10,new Employee("011","��ҫ��",3698));
            em.addEmployee(11,new Employee("012","����",3456));
            em.addEmployee(12,new Employee("013","������",4452));
            em.addEmployee(13,new Employee("014","������",5550));
            em.addEmployee(14,new Employee("015","�����",6523));
            em.addEmployee(15,new Employee("016","����",3465));
            em.addEmployee(16,new Employee("017","������",6456));
            em.addEmployee(17,new Employee("018","����",5002));
            em.addEmployee(18,new Employee("019","������",4235));
            em.addEmployee(19,new Employee("020","����",5500));
            em.addEmployee(20,new Employee("021","�̵���",6000));
            em.addEmployee(21,new Employee("022","������",2000));
            em.addEmployee(22,new Employee("023","�պ콭",6000));
            em.addEmployee(23,new Employee("024","�μ�һ",3256));

            double dM = em.getMidNumber();
            System.out.println("��λ����" + em.getMidNumber());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("ƽ������" + String.format("%.2f", em.getAvg()));
        System.out.println("��׼�" + String.format("%.2f",em.getSD()));
    }
}
