package com.bridelabz.stack;

public class StackMain 
{
	public static void main(String[] args) {		
		StacksService<Integer> stack = new StacksService<Integer>();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.print();
		stack.peak();
		stack.pop();
		stack.print();
	}
}
	