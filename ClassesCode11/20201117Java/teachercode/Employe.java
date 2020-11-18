/**
 * 
 */
package cn.edu;

/**
 * 实例类：定义员工的属性
 */
public class Employe {

	public Employe() {}
	
	public Employe(String id, String name, double salary) {
		this.setId(id);
		this.setName(name);
		this.setSalary(salary);
	}
		
	private String id = null;
	private String name = null;
	private double salary = 0.0;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
