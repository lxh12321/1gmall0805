package com.atguigu.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

public class NotSafeDemo {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();//Collections.synchronizedList(new ArrayList<>());//new Vector<>();//new ArrayList<>();

        for (int i = 1; i <=30 ; i++) {
           new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0,6));
               System.out.println(list);
           },String.valueOf(i)).start();
        }
    }
}