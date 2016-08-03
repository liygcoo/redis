package com.guanliandu.test;

import java.util.Random;

public class Qhbrod {

	public static void main(String[] args) {
		// remainMoney 剩余的钱
		long remainMoney = 100;
		// remainSize 剩余的红包数量
		int remainSize = 10;
//		for (int i=0;i<remainSize; i++) {
			getRandomMoney(remainSize, remainMoney);
//			remainMoney -= smoney;
//			System.out.println(remainSize+"===remainMoney==="+remainMoney);
//		}
		System.out.println(remainSize+"===remainMoney==="+remainMoney);
	}
	
	public static double getRandomMoney(int remainSize,long remainMoney) {
        // remainSize 剩余的红包数量
        // remainMoney 剩余的钱
		while (true) {
	        if (remainSize == 1) {
	            remainSize--;
	            return (double) Math.round(remainMoney * 100) / 100;
	        }
	        Random r     = new Random();
	        double min   = 0.01; //
	        double max   = remainMoney / remainSize * 2;
	        double money = r.nextDouble() * max;
	        money = money <= min ? 0.01: money;
	        money = Math.floor(money * 100) / 100;
	        remainSize--;
	        remainMoney -= money;
	        System.out.println(money);
       
		}
//		 return remainMoney;
    }
}
