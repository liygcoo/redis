package com.guanliandu.test;

import java.util.ArrayList;
import java.util.List;

public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "125123";
		System.out.println(a.substring(0, 3));
		
		String reg = "^\\d+$";
		if (!String.valueOf("12s3").matches(reg)) {
			System.out.println("ssssss");
		}
		
		List<String> ass = new ArrayList<String>();
		ass.add("asdasdadsd");
		if (ass.contains("asdasdads")) {
			System.out.println("1111");
		} else {
			System.out.println("2222");
		}
		
		if (a.contains("12")) {
			System.out.println("1111");
		} else {
			System.out.println("2222");
		}
		
	}

}
