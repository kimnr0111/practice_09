package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {

    	List<Goods> gList = new ArrayList<Goods>();
    	Scanner sc = new Scanner(System.in);
    	boolean flag = true;
    	String item;
    	String[] itemArray;
    	int sum = 0;
    	
    	System.out.println("상품을 입력해주세요(종료 q)");
    	while(flag) {
    		item = sc.nextLine();
    		if(item.equals("q")) {
    			flag = false;
    		} else {
    			itemArray = item.split(",");
    			String name = itemArray[0];
    			int price = Integer.parseInt(itemArray[1]);
    			int count = Integer.parseInt(itemArray[2]);
    			gList.add(new Goods(name, price, count));
    			
    			
    			
    			/*
    			for(int i=0;i<itemArray.length;i++) {
    				System.out.println(itemArray[i]);
    			}
    			*/
    			
    		}
    	}
    	System.out.println("[입력완료]");
    	System.out.println("=====================");
    	for(int i=0;i<gList.size();i++) {
    		gList.get(i).showInfo();
    		sum = sum + gList.get(i).getCount();
    	}
    	System.out.println("모든 상품의 갯수는 " + sum + "개입니다.");
    	
       
    }

}
