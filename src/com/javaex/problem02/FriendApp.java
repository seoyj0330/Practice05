package com.javaex.problem02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Friend> friendList = new ArrayList<Friend>();
		
		Friend[] dd = new Friend[3];

		System.out.println("친구를 3명 등록해 주세요");

		for (int i = 0; i < 3; i++) {
			String input = scan.nextLine();
			String[] data = input.split(" ");
			
//			String a = input.split(" ")[0]
//			String b = input.split(" ")[1]
//			String c = input.split(" ")[2]
			
			Friend friend = new Friend();
			friend.setName(data[0]);
			friend.setHp(data[1]);
			friend.setSchool(data[2]);

			// 리스트에 추가
			friendList.add(friend);
		}

		for (int i = 0; i < friendList.size(); i++) {
			friendList.get(i).showInfo();
		}

		// for(Friend f : friendList) {
		// friendList.get(i).showInfo();
		// }

		scan.close();

	}

}
