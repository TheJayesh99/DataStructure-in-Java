package com.bridgelabz.queue;

public class QueueMain 
{
	public static void main(String[] args) 
	{
		QueueService<Integer> queue = new QueueService<Integer>();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		//printing all the elements in queue
		queue.print();
		// removing first element from the queue
		queue.dequeue();
		queue.print();
	}
}
