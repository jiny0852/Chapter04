package com.javaex.ex03;

public class MyListApp {

	public static void main(String[] args) {
		
		MyList<Point> pList = new MyList<Point>();
		
		
		Point p1 = new Point(2, 2);
		Point p2 = new Point(22, 22);
		Point p3 = new Point(222, 222);
		
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		
		Point p = pList.get(1);   //(Point)pList.get(1); 형변환 필요 음슴
		System.out.println(p.toString());
		//System.out.println(pList.get(1).toString());
		
		/////////////////////////////////
		
		MyList<Circle> cList = new MyList<Circle>();
		
		Circle c1 = new Circle(3);
		Circle c2 = new Circle(33);
		Circle c3 = new Circle(333);
		
		cList.add(c1);
		cList.add(c2);
		cList.add(c3);
		
		Circle c = cList.get(0);   //(Circle)cList.get(1); 형변환 필요 음슴
		System.out.println(c.toString());
		
		
		
	}

}
