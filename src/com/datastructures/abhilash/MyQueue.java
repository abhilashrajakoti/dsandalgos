package com.datastructures.abhilash;

import java.util.List;

public class MyQueue<T> {
	private List<T> queue;
	private int tail;
	private int head;
	private int size;
	
	public MyQueue(List<T> queue,int size) {
		this.queue=queue;
		this.size=size;
	}
	
	public boolean enequeue(T key) {
		if((tail==(size-1) && head==0)||(head==tail+1)){
			//overflow
			return false;
		}
		queue.add(tail, key);
		if(tail==size-1)
			tail=0;
		else
			tail++;
		return true;
	}
	
	public T dequeue() {
		if(tail==head) {
			return null;//underflow
		}
		T delElem=queue.remove(head);
		if(head==size-1)
			head=0;
		else
			head++;
		return delElem;
		
	}
	
	

}
