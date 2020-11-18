package cn.edu;

public class Test {

	public static void main(String[] args) {
		
		EmployeManager em = new EmployeManager();
		try {
			em.addEmploye(0, new Employe("001", "杨林", 3456));
			em.addEmploye(1, new Employe("002", "杨林", 3456));
			em.addEmploye(2, new Employe("003", "杨林", 3456));
			em.addEmploye(3, new Employe("004", "杨林", 3456));
			em.addEmploye(4, new Employe("005", "杨林", 3456));
			em.addEmploye(5, new Employe("006", "杨林", 3456));
			double dM = em.getMidNumber();
			System.out.println("中位数=" + dM);
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		
		Dog d = new Dog();  // 调用无参数的构造方法创建对象
		d.setKind("泰迪");
        d.setName("迈克");
        try {
        	// 捕获异常
			d.setWeight(7.0);			
		} catch (Exception e) {
			// 处理异常：
			e.printStackTrace();
		}
                
        Dog[] dA = new Dog[4];  // 创建数组对象，数组元素的类型是 Dog        
        dA[0] = d;  // 将一个已经存在的对象变量的值赋给 0 号元素
        
        try {        	
			dA[1] = new Dog("中华田园犬","大宝", 25);
			dA[2] = new Dog("吉娃娃","小乖乖", 1.5);
			dA[3] = new Dog("金毛","公主", 30);			
		} catch (Exception e) {
			e.printStackTrace();
		}
        for(Dog d1:dA) { // 基于java数组或集合的遍历循环结构：
        	             // 变量 d1 依次引用数组当中的各个元素
        	if(d1!=null) {
        		d1.showInfo();
        	}
        }
        
	}

}
