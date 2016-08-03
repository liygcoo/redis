package com.guanliandu.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.guanliandu.redis.Person;
import com.guanliandu.redis.RedisClinet;
import com.guanliandu.redis.SerializeUtil;

import redis.clients.jedis.Jedis;

public class RedisStringJava {
	/**
     *  @param args
     *  @throws IOException
     *  @throws ClassNotFoundException
     */
     public  static  void main(String[] args)  throws IOException,
            ClassNotFoundException {
//        Jedis redis = new  Jedis("192.168.88.15");
        Jedis redis =  new Jedis("192.168.253.15", 6379);
        redis.auth("finedo-redis");


        /* -----------------------------------------------------------------------------------------------------------  */           
        //Hash 操作   

        //HSET key field value将哈希表key中的域field的值设为value。   
        redis.hset("sys:user:xinyong", "name", "www.google.cn");   
        redis.hset("sys:user:xinyong", "pass", "www.baidu.com");   
        redis.hset("sys:user:xinyong", "sex", "www.sina.com");   
        redis.hset("sys:user:xinyong1", "name", "xinyong");   
        redis.hset("sys:user:xinyong1", "pass", "123456");   
        redis.hset("sys:user:xinyong1", "sex", "nv");   

//        //HMSET key field value [field value ...] 同时将多个field - value(域-值)对设置到哈希表key中。   
//        Map map = new HashMap();   
//        map.put("cardid", "123456");   
//        map.put("username", "jzkangta");   
//        redis.hmset("hash", map);   
//
//        //HGET key field返回哈希表key中给定域field的值。   
//        System.out.println(redis.hget("hash", "username"));   
//
//        //HMGET key field [field ...]返回哈希表key中，一个或多个给定域的值。   
//        List list = redis.hmget("website","google","baidu","sina");   
//        for(int i=0;i<list.size();i++){   
//            System.out.println(list.get(i));   
//        }   

        //HGETALL key返回哈希表key中，所有的域和值。   
        Map<String,String> map1 = redis.hgetAll("sys:user:xinyong");   
        for(Map.Entry entry: map1.entrySet()) {   
             System.out.print(entry.getKey() + ":" + entry.getValue() + "\t");   
        }   

        
  }
}
