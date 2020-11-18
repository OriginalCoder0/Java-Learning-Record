package cn.edu;

public class Dog {
	
	static {  // ��̬�����
		int i;
		i = 9;
	}
		
	public Dog() {}
	
	/**���췽������*/
	public Dog(String k) {
		this.setKind(k);
	}
	
	/**���췽������*/
	public Dog(String k, String n) {
		this.setKind(k);
		this.setName(n);
	}	
	
	/**���췽������
	 * @throws Exception */
	public Dog(String k, String n, double w) throws Exception {
		this.setKind(k);
		this.setName(n);
		this.setWeight(w);
	}	
	
	private String kind = null;
	private String name = null;
	private double weight = 0.00;
			
	/**��������ֵ*/
	public void setKind(String k) {
		this.kind = k;
	}
	/**��ȡ����ֵ*/
	public String getKind() {
		return this.kind;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setWeight(double w) throws Exception {
		if(w>0) {
			this.weight = w;
		}else {
			throw new Exception("���ر������0��");
		}
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void showInfo() {
		System.out.println("����һֻ" + this.kind + ",�ҵ����ֽУ�" + this.name 
				           + "���ҵ����أ�" + this.weight + "���");
	}
	
}
