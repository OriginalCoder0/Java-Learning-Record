/**
 * 
 */
package itwcn;

/**
 * @author Administrator
 *
 */
public class Example02 {
	private String kind = null;
	private String name;
	private double weight;
	//获取品种属性值
	public String getKind() {
		return this.kind;
	}

	public void setKind(String k) {
		if(k == null || k.trim().isEmpty() == true) {
			System.out.println("品种无效！");
			return;
		}
		this.kind = k;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if(weight<=0) 
			System.out.println("输入的数据不合法！");
		this.weight = weight;
	}
	
	
	public Example02() {
		super();
	}
	
	public Example02(String kind) {
		super();
		this.setKind(kind);
	}
	
	public Example02(String kind,double weight) {
		super();
		this.setKind(kind);
		this.setWeight(weight);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Example01 example01 = new Example01();
//		Example01 example02 = new Example01();
//		example01.setKind("金毛");
//		example01.setWeight(20);
//		example01.setColor("金色");
//		example02.setKind("哈士奇");
//		System.out.println("品种：" + example02.getKind());
		
		
		
		Example02 example03 = new Example02("萨摩耶");
		Example02 example04 = new Example02("萨摩耶",32);
		System.out.println("品种：" + example03.getKind());
		System.out.println("品种：" + example04.getKind() + example04.getWeight());
		

	}

	

	

}
