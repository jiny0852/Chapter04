package com.javaex.ex01;

public class CircleList {
	
	private Circle[] cArr;
	private int crtPos;

	
	public CircleList() {
		cArr = new Circle[3];
		crtPos = 0;
	}
	
	public void add(Circle circle) {
		
		this.cArr[crtPos] = circle;
		crtPos++;
			
	}
	
	public Circle get(int index) {
		
		return cArr[index];
		
	}
	
	public int size() {
		return crtPos;
	}
		
		
		
		

}
