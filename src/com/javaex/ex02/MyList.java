package com.javaex.ex02;

public class MyList {
	
	private Object[] oArr;
	private int crtPos;
	
	
	
	public MyList() {
		oArr = new Object[3];
		crtPos = 0;
	}
	
	
	
	
	
	public void add(Object obj) {
		
		this.oArr[crtPos] = obj;
		crtPos++;
			
	}
	
	public Object get(int index) {
		
		return oArr[index];
		
	}
	
	public int size() {
		return crtPos;
	}
	

}
