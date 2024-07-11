package com.javaex.ex03;

public class MyList<T> {
	
	private T[] oArr;
	private int crtPos;
	
	
	
	public MyList() {
		oArr = (T[])new Object[3]; //T배열로 형변환!!!!!!!!!!!!!
		crtPos = 0;
	}
	
	
	
	
	
	public void add(T obj) {
		
		this.oArr[crtPos] = obj;
		crtPos++;
			
	}
	
	public T get(int index) {
		
		return oArr[index];
		
	}
	
	public int size() {
		return crtPos;
	}
	

}
