package com.javaex.ex01;

public class MyListApp {

	public static void main(String[] args) {
		/*
		//배열로 관리
		//미리 갯수를 결정해야한다(낭비, 수정)
		//갯수가 고정(변동폭이 작을때) 유리하다
		Point[] pArr = new Point[3];
		
		Point p1 = new Point(2, 2);
		Point p2 = new Point(3, 3);
		Point p3 = new Point(4, 4);
		
		pArr[0] = p1;
		pArr[1] = p2;
		pArr[2] = p3;
		
		for (int i = 0; i < pArr.length ; i++) {
			System.out.println(pArr[i].toString());
		}
		
		*/
		
		PointList pList = new PointList();
		
		Point p1 = new Point(2, 2);
		Point p2 = new Point(3, 3);
		Point p3 = new Point(4, 4);
		
		pList.add(p1);
		pList.add(p1);
		pList.add(p1);
		Point p = pList.get(1);
		System.out.println(p.toString());
		System.out.println(pList.size());
		
		
		for(int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		
		
		//원 관리
		CircleList cList = new CircleList();
		
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(10);
		Circle c3 = new Circle(100);
		
		
		cList.add(c1);
		cList.add(c2);
		cList.add(c3);
		
		Circle c = cList.get(0);
		System.out.println(c.toString());
		System.out.println(cList.size());
		
		for(int i = 0; i < cList.size(); i++) {
			System.out.println(cList.get(i).toString());
		}
		

	}

}
