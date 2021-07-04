package com.bridgelabz.stack;

import com.bridgelabz.linklist.LinkListService;

public class StacksService<T>
{

	LinkListService<T> linkedList= new LinkListService<T>();
	
	//method to add data in stacks
	public void push(T data) 
	{
		linkedList.add(data);
	}
	
	//method to print all the values present in the stacks
	public void print()
	{
		linkedList.print();
	}
	
	//method to check recently added value in stacks
	public void peak()
	{
		System.out.println("The data at the top of stack is "+ linkedList.head.data);

	}
	
	//method to delete recently added element in stacks
	public void pop()
	{
		linkedList.pop();

	}

}
