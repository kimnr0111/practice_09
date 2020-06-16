package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	List<Friend> fList = new ArrayList<Friend>();
    	Scanner sc = new Scanner(System.in);
    	String[] infoArray;
    	
    	
    	System.out.println("친구를 3명 등록해 주세요");
    	for(int i=0;i<3;i++) {
    		String friend = sc.nextLine();
    		infoArray = friend.split(" ");
    		String name = infoArray[0];
    		String hp = infoArray[1];
    		String school = infoArray[2];
    		fList.add(new Friend(name, hp, school));
    	}
    	
    	for(int i=0;i<fList.size();i++) {
    		fList.get(i).showInfo();
    	}

    	
    	
    }

}
