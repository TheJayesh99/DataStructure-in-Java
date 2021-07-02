package com.bridelabz.queue;

public class QueueMain 
{
	public static void main(String[] args) 
	{
		QueueService<Integer> queue = new QueueService<Integer>();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.print();
	}
}
