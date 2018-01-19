package com.javaex.problem04;

public class Rectangle extends Shape implements Resizeable{

	 public double width;
	 public double height;
	 
	 public Rectangle(double w, double h) {
	  super(4);
	  this.width = w;
	  this.height = h;
	 }

	 @Override
	 public double getArea() {
	  return width * height;
	 }

	 @Override
	 public double getPerimeter() {
	  return (width*2) + (height*2);
	 }

	 @Override
	 public void resize(double s) {
	  width = width * s;
	  height = height * s;
	  
	 }
	 
	}

