package com.guanliandu.redis;

import java.io.Serializable;
/**
 * 测试用pojo，实现了Serializable，以便进行系列化操作
 * 
 *  @author mingyuan
 * 
 */
public class Person implements Serializable {
     private  static  final  long serialVersionUID = -3562550857760039655L;
    
     private String name;
     private  int num;
     private long price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
     
   
}