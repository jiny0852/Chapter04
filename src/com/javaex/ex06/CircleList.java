package com.javaex.ex06;

import java.util.ArrayList;

public class CircleList {

	public static void main(String[] args) {
		
		ArrayList<Circle> cList = new ArrayList<Circle>();
		
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(15);
		Circle c3 = new Circle(100);
		
		cList.add(c1);
		cList.add(c2);
		cList.add(c3);
		cList.add(new Circle(40));
		
		System.out.println(cList.toString());
		System.out.println(cList.size());
		
		System.out.println("--------------");
		
		cList.remove(1);
		System.out.println(cList.toString());
		System.out.println(cList.size());

		System.out.println("--------------");
		
		cList.add(1, c2);
		cList.add(1, new Circle(40));
		
		for(int i = 0; i<cList.size(); i++) {
			System.out.println(cList.get(i).getRadius());
		}
		
		

	}

}
