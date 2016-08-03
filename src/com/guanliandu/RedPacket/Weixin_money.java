package com.guanliandu.RedPacket;

import java.util.Random;


public class Weixin_money {

    public static double getRandomMoney(LeftMoneyPackage _leftMoneyPackage) {
        if (_leftMoneyPackage.peoples == 1) {
            _leftMoneyPackage.peoples--;
            return (double) Math.round(_leftMoneyPackage.leftMoney * 100) / 100;
        }
        Random r = new Random();
        double min = 0.01;
        double max = _leftMoneyPackage.leftMoney / _leftMoneyPackage.peoples
                * 2;
        double money = r.nextDouble() * max;
        money = money < min ? min : money;
        money = (double) Math.floor(money * 100) / 100;
        _leftMoneyPackage.peoples--;
        _leftMoneyPackage.leftMoney -= money;
        return money;
    }
    static synchronized void init(int people,double money) {
        LeftMoneyPackage.peoples = people;
        LeftMoneyPackage.leftMoney = money;
    }
    public static void main(String[] args) {
        int people=30;
        double money=500;
        init(people,money);
        System.out.println("第一次测试:");
        LeftMoneyPackage _leftMoneyPackage=new LeftMoneyPackage();

        for(int i=0;i<people;i++){
            if(i%10==0) System.out.println();
            System.out.print(getRandomMoney(_leftMoneyPackage)+"  ");
        }
        System.out.println();
        int people1=30;
        double money1=500;
        init(people1,money1);
        System.out.println();
        System.out.println("第二次测试:");
        LeftMoneyPackage _leftMoneyPackage1=new LeftMoneyPackage();

        for(int i=0;i<people1;i++){
            if(i%10==0) System.out.println();
            System.out.print(getRandomMoney(_leftMoneyPackage1)+"  ");
        }
    }

}

class LeftMoneyPackage {
    static int peoples;
    static double leftMoney;
}
