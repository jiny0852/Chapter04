package com.javaex.ex04;

import java.util.ArrayList;

public class MyListApp {

	public static void main(String[] args) {
		
		ArrayList<Point> pList = new ArrayList<Point>();
		
		Point p01 = new Point(2, 2);
		Point p02 = new Point(12, 12);
		Point p03 = new Point(22, 22);
		
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		System.out.println(pList.size());
		
		
		Point p = pList.get(1);
		System.out.println(p.getX());
		
		Point p2 = pList.get(2);
		System.out.println(pList.size());
		
		for(int i = 0; i<pList.size(); i++) {
			Point pp = pList.get(i);
			System.out.println(pp.toString());
		}
		
		pList.remove(1);
		System.out.println("----------------");
		
		for(int i = 0; i<pList.size(); i++) {
			Point pp = pList.get(i);
			System.out.println(pp.toString());
		}
		
		System.out.println("----------------");
		System.out.println(pList.toString());
		System.out.println(pList);
		
		
		
		
		
	}

}
