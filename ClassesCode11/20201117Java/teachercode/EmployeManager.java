package cn.edu;

/**
 * 管理类：定义管理员工的方法。
 * */
public class EmployeManager {
	
	private Employe[] empA = null; // 声明一个数组变量，没有引用对象！
	/**构造方法*/
	public EmployeManager() {
		empA = new Employe[24];  // 在创建管理器对象时，创建数组对象！
	}
	
	/**
	 * 添加员工对象到管理器的数组
	 * @param i 员工的索引号
	 * @param e 一个员工对象
	 * */
	public void addEmploye(int i, Employe e) throws Exception {
		if(i>=24) {
			throw new Exception("员工的索引超出了数组的边界");
		}
		empA[i] = e;
	}
	
	/**计算并返回平均工资*/
	public double getAvg() {
		return 0.0;  // 请同学们完成作业！
	}
	
	/**计算并返回薪资的标准差*/
	public Double getSD() {
		return 0.0;  // 请同学们完成作业！
	}
	/**计算并返回薪资的中位数*/
	public double getMidNumber() {
		// 排序之后的中间数据，如果是偶数个元素，取中间 2 个元素的平均值
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
		return (s1+s2)/2.0;  // 中位数：中间两位数据的平均值
	}
	
	private void sort() {
		int i = 0,n = 1;
		for(n=1;n<empA.length-1;n++) {  // 控制两辆比较的轮次
			for(i=0;i<empA.length-n-1;i++) {
				Employe t = null;
				if(empA[i]==null||empA[i+1]==null) continue;
				if(empA[i].getSalary()>empA[i+1].getSalary()) {
					t = empA[i];  //置换相邻的两个元素所引用的对象
					empA[i] = empA[i+1];
					empA[i+1] = t;
				}
			}
		}
		
	}
	
}
