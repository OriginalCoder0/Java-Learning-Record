package cn.edu;

public class Test {

	public static void main(String[] args) {
		
		EmployeManager em = new EmployeManager();
		try {
			em.addEmploye(0, new Employe("001", "����", 3456));
			em.addEmploye(1, new Employe("002", "����", 3456));
			em.addEmploye(2, new Employe("003", "����", 3456));
			em.addEmploye(3, new Employe("004", "����", 3456));
			em.addEmploye(4, new Employe("005", "����", 3456));
			em.addEmploye(5, new Employe("006", "����", 3456));
			double dM = em.getMidNumber();
			System.out.println("��λ��=" + dM);
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		
		Dog d = new Dog();  // �����޲����Ĺ��췽����������
		d.setKind("̩��");
        d.setName("����");
        try {
        	// �����쳣
			d.setWeight(7.0);			
		} catch (Exception e) {
			// �����쳣��
			e.printStackTrace();
		}
                
        Dog[] dA = new Dog[4];  // ���������������Ԫ�ص������� Dog        
        dA[0] = d;  // ��һ���Ѿ����ڵĶ��������ֵ���� 0 ��Ԫ��
        
        try {        	
			dA[1] = new Dog("�л���԰Ȯ","��", 25);
			dA[2] = new Dog("������","С�Թ�", 1.5);
			dA[3] = new Dog("��ë","����", 30);			
		} catch (Exception e) {
			e.printStackTrace();
		}
        for(Dog d1:dA) { // ����java����򼯺ϵı���ѭ���ṹ��
        	             // ���� d1 �����������鵱�еĸ���Ԫ��
        	if(d1!=null) {
        		d1.showInfo();
        	}
        }
        
	}

}
