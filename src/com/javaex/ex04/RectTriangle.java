package com.javaex.ex04;

public class RectTriangle extends Shape {
	
	private double width;
	private double height;
	
	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		return width*height*1/2;
	}

	@Override
	public double getPerimeter() {
		return width + height + Math.sqrt(width*width+height*height);
	}
	
	
	
	

}
