package test.datastructures.abhilash;

import java.util.ArrayList;

import com.datastructures.abhilash.MyQueue;

public class MyQueueTest {
	public static void main(String[] args) {
		MyQueue<String> queue=new MyQueue<>(new ArrayList<String>(), 10);
		System.out.println(queue.dequeue()==null?"underflow":"dequeued");
		queue.enequeue("one");
		queue.enequeue("one");
		queue.enequeue("one");
		queue.enequeue("one");
		queue.enequeue("one");
		queue.enequeue("one");
		queue.enequeue("one");
		queue.enequeue("one");
		queue.enequeue("one");
		System.out.println(queue.enequeue("one")?"queued":"overflow");
	}

}
