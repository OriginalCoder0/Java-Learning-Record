package itwcn.com;

public class Test {
    public static void main(String[] args) {
        EmployeeManager em = new EmployeeManager();
        try {
            em.addEmployee(0,new Employee("001","杨林",3456));
            em.addEmployee(1,new Employee("002","何晓玉",4452));
            em.addEmployee(2,new Employee("003","郭文",5550));
            em.addEmployee(3,new Employee("004","杨彬",6523));
            em.addEmployee(4,new Employee("005","苏宇拓",3465));
            em.addEmployee(5,new Employee("006","杨楠",6456));
            em.addEmployee(6,new Employee("007","陈强",5002));
            em.addEmployee(7,new Employee("008","杨燕",4135));
            em.addEmployee(8,new Employee("009","陈蔚",3600));
            em.addEmployee(9,new Employee("010","邱鸣",3598));
            em.addEmployee(10,new Employee("011","王耀华",3698));
            em.addEmployee(11,new Employee("012","杜鹏",3456));
            em.addEmployee(12,new Employee("013","孟永科",4452));
            em.addEmployee(13,new Employee("014","巩月明",5550));
            em.addEmployee(14,new Employee("015","田格艳",6523));
            em.addEmployee(15,new Employee("016","王琪",3465));
            em.addEmployee(16,new Employee("017","董国株",6456));
            em.addEmployee(17,new Employee("018","张昭",5002));
            em.addEmployee(18,new Employee("019","龙丹丹",4235));
            em.addEmployee(19,new Employee("020","雷霆",5500));
            em.addEmployee(20,new Employee("021","程丹丹",6000));
            em.addEmployee(21,new Employee("022","刘键名",2000));
            em.addEmployee(22,new Employee("023","苏红江",6000));
            em.addEmployee(23,new Employee("024","廖嘉一",3256));

            double dM = em.getMidNumber();
            System.out.println("中位数：" + em.getMidNumber());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("平均数：" + String.format("%.2f", em.getAvg()));
        System.out.println("标准差：" + String.format("%.2f",em.getSD()));
    }
}
