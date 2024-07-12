package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		
		Set<Integer> iSet = new HashSet<Integer>();
		
		while(true) {
			
			if (iSet.size() == 6) {
				break;
			}
			int no = (int) (Math.random()*45) +1;
			System.out.println(no);
			
			iSet.add(no); //박싱 --> 주머니에 주소가 들어감
			//
		}
		
		System.out.println("-------");
		//출력
		for (Integer mu : iSet) {
			System.out.println(mu);
		}
		
		
		/*
		for (int i=0; i < 45; i++) {
			int n1 = (int)(Math.random()*(45));
			n.add(n1+1);
		}
		
		for (int i =0; i < 6 ; i++) {
			System.out.println(n.get(i));
		}
		
		for (Integer v : n) {
			int n1 = (int)(Math.random()*(45));
			n.add(n1+1);
			System.out.println(n.toString());
		}
		*/
		
		
		
		

	}

}
