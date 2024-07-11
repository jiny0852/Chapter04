package com.javaex.ex02;

public class MyListApp {

	public static void main(String[] args) {
		
		MyList pList = new MyList();
		
		
		Point p1 = new Point(2, 2);
		Point p2 = new Point(14, 14);
		Point p3 = new Point(122, 122);
		
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		
		Point p = (Point)pList.get(1);
		System.out.println(p.toString());
		
		/////////////////////////////////
		
		MyList cList = new MyList();
		
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(15);
		Circle c3 = new Circle(115);
		
		cList.add(c1);
		cList.add(c2);
		cList.add(p3); //다른 자료형도 담을 수 있다(단점)
		
		Circle c = (Circle)cList.get(1);
		System.out.println(c.toString());
		
		
		
	}

}
