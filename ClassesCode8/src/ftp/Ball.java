package cn.edu;

/**
 * ʹ�� final ���ε��಻�ܱ��̳У�
 * */
public final class Ball extends Circle {
	public Ball() {
		super();  // super(): �ǵ��ø��๹�췽��
	}
	
	public Ball(double r) {
		super(r);  // ���ø���������Ĺ��췽��
	}
	
	public double gettiji() {
		return PI * ((double)3)/4 * Math.pow(this.radius, 3);
	}
	/**�����ͨ�����ĵĴ�ֱ���������ĵľ���*/
	protected double distance = 0.00;
	
	public double getDistance() {
		return distance;
	}

	/**
	 * ����ͨ�����ĵĴ�ֱ���������ĵľ���
	 * @param d ͨ�����ĵĴ�ֱ���������ĵľ���
	 * */
	public void setDistance(double d) {
		if(distance>0) {
			this.distance = d;
		}		
	}

	/**��ȡ��ǰԲ������ܳ�*/
	@Override  // ������д
	public double getCircleLength() {
		double mR = Math.sqrt(this.radius * this.radius - this.distance * this.distance);
		return 2 * mR * PI;
	}
}
