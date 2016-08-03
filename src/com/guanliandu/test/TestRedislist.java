package com.guanliandu.test;

import java.util.Random;

public class TestRedislist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		int n2 = r.nextInt(10);
		System.out.println(n2);
		n2 = Math.abs(r.nextInt() % 5);
		System.out.println(n2);
		
		
		
	}

}
