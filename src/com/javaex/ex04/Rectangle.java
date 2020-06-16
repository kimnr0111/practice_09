package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {
	
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
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
		return width*height;
	}

	@Override
	public double getPerimeter() {

		return (width+height)*2;
	}


	@Override
	public void resize(double s) {
		width = width*0.5;
		height = height*0.5;
	}

}
