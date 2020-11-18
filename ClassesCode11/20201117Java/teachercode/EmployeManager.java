package cn.edu;

/**
 * �����ࣺ�������Ա���ķ�����
 * */
public class EmployeManager {
	
	private Employe[] empA = null; // ����һ�����������û�����ö���
	/**���췽��*/
	public EmployeManager() {
		empA = new Employe[24];  // �ڴ�������������ʱ�������������
	}
	
	/**
	 * ���Ա�����󵽹�����������
	 * @param i Ա����������
	 * @param e һ��Ա������
	 * */
	public void addEmploye(int i, Employe e) throws Exception {
		if(i>=24) {
			throw new Exception("Ա������������������ı߽�");
		}
		empA[i] = e;
	}
	
	/**���㲢����ƽ������*/
	public double getAvg() {
		return 0.0;  // ��ͬѧ�������ҵ��
	}
	
	/**���㲢����н�ʵı�׼��*/
	public Double getSD() {
		return 0.0;  // ��ͬѧ�������ҵ��
	}
	/**���㲢����н�ʵ���λ��*/
	public double getMidNumber() {
		// ����֮����м����ݣ������ż����Ԫ�أ�ȡ�м� 2 ��Ԫ�ص�ƽ��ֵ
		double s1 = 0.0;
		double s2 = 0.00;
		try {
			sort();
			if(empA[11]!=null) {
				s1 = empA[11].getSalary();
			}
			if(empA[12]!=null) {
				s2 = empA[12].getSalary(); 
			}
			   
		}catch(Exception e) {
			e.printStackTrace();
		}
		return (s1+s2)/2.0;  // ��λ�����м���λ���ݵ�ƽ��ֵ
	}
	
	private void sort() {
		int i = 0,n = 1;
		for(n=1;n<empA.length-1;n++) {  // ���������Ƚϵ��ִ�
			for(i=0;i<empA.length-n-1;i++) {
				Employe t = null;
				if(empA[i]==null||empA[i+1]==null) continue;
				if(empA[i].getSalary()>empA[i+1].getSalary()) {
					t = empA[i];  //�û����ڵ�����Ԫ�������õĶ���
					empA[i] = empA[i+1];
					empA[i+1] = t;
				}
			}
		}
		
	}
	
}
