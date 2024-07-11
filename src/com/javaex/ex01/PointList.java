package com.javaex.ex01;

public class PointList {
	
	//필드
	private Point[] pArr;
	private int crtPos;

	
	//생성자
	public PointList() {
		//메모리 올리고
		pArr = new Point[3];
		crtPos = 0;
	}
	
	
	
	//메소드 gs
	
	//메소드 일반
	
	public void add(Point point) {
		
		this.pArr[crtPos] = point;
		crtPos++;
				
	}
	
	public Point get(int index) {
		
		return pArr[index];
		
	}
	
	
	public int size() {
		return crtPos;
	}
	
	
	
	
	
	
	
	

}
