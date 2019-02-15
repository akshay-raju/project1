package com.cap;

import java.util.ArrayList;
import java.util.List;

public class Friend {
	int n = 20;

	String friendname;
	long friendmobile;

	public Friend(String friendname, long friendmobile) {
		super();
		this.friendname = friendname;
		this.friendmobile = friendmobile;
	}

	public void addValues(String friendname[], long friendmobile[]) {

		ArrayList<Friend> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			list.add(friendname[i], friendmobile[i]);
		}

		printValues(list);
	}

	public void printValues(ArrayList<Friend> list) {

		for (int i = 0; i < n; i++) {

			Friend data = list.get(i);

			System.out.println(data.friendname + " " + data.friendmobile);
		}
	}

}
