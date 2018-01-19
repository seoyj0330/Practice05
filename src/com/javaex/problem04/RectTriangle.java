package com.javaex.problem04;

public class RectTriangle extends Shape{
	 
	 public double width;
	 public double height;
	 
	 public RectTriangle(double w, double h) {
	  super(3);
	  this.width = w;
	  this.height = h;
	  
	 }

	 @Override
	 public double getArea() {
	  
	  return (width * height) / 2;
	 }

	 @Override
	 public double getPerimeter() {
	  
	  return width + height + Math.sqrt((width*width)+(height*height));//피타고라스 정리...
	 }
	 
}
