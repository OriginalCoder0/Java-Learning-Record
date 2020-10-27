package com.itwcn;

public interface ICircle {
	public abstract double getCircleArea();
	
	public default double getCircleLength() {
		return 0.00;
	}
}
