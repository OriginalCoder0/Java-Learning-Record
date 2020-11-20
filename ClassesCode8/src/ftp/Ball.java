package cn.edu;

/**
 * 使用 final 修饰的类不能被继承！
 * */
public final class Ball extends Circle {
	public Ball() {
		super();  // super(): 是调用父类构造方法
	}
	
	public Ball(double r) {
		super(r);  // 调用父类带参数的构造方法
	}
	
	public double gettiji() {
		return PI * ((double)3)/4 * Math.pow(this.radius, 3);
	}
	/**在球的通过球心的垂直轴上离球心的距离*/
	protected double distance = 0.00;
	
	public double getDistance() {
		return distance;
	}

	/**
	 * 设置通过球心的垂直轴上离球心的距离
	 * @param d 通过球心的垂直轴上离球心的距离
	 * */
	public void setDistance(double d) {
		if(distance>0) {
			this.distance = d;
		}		
	}

	/**获取当前圆对象的周长*/
	@Override  // 方法重写
	public double getCircleLength() {
		double mR = Math.sqrt(this.radius * this.radius - this.distance * this.distance);
		return 2 * mR * PI;
	}
}
