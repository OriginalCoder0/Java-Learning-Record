package com.itwcn;
/**
 * ʹ��final���ε��಻�ܱ��̳�
 * @author Administrator
 *
 */
public final class Ball extends Circle{
	public Ball() {
		super();		//���ø�����޲ι��췽��
	}
	public Ball(double r) {
		super();		//���ø�����вι��췽��
	}
	
	public double getTiJi (double r) {
		return PI * (double)4/3 * Math.pow(this.radius, 3) ;
	}
	
	
}