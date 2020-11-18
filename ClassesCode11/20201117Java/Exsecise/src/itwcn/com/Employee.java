package itwcn.com;

/**
 * @author Administrator
 */
public class Employee {

    private String id = null;
    private String name = null;
    private double salary = 0.0;

    public Employee() {
    }

    public Employee(String id, String name, double salary) {
        this.setId(id);
        this.setName(name);
        this.setSalary(salary);
    }

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
