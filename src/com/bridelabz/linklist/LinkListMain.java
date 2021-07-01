package com.bridelabz.linklist;

public class LinkListMain {

	public static void main(String[] args) {
		System.out.println("Welcome to LinkList");
		LinkListService linkList = new LinkListService();
		linkList.append(56);
		linkList.append(30);
		linkList.append(70);
		linkList.print();
	}

}
