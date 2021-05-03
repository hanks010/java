package test;

import java.util.LinkedList;

public class Queue {

	private LinkedList<String> queue = new LinkedList<>();
	
	public void enQueue(String data) {
		queue.add(0, data);;
	}
	public String deQueue() {
		int len = queue.size();
		if(len ==0) {
			System.out.println("queue is empty");
			return null;
		}
	
		return (queue.remove(len-1));
	}
	public void showData() {
		for(String key :queue) {
			System.out.print(key+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		
		queue.enQueue("A");
		queue.	enQueue("B");
		queue.enQueue("C");
		
		queue.showData();
		queue.deQueue();
		queue.showData();
		
	}//main

}
