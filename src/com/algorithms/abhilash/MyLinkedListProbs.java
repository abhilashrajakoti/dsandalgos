package com.algorithms.abhilash;
import com.datastructures.abhilash.ListElement;
import com.datastructures.abhilash.MyLinkedList;

public class MyLinkedListProbs {
	public static void main(String[] args) {
		ListElement<Integer> elem1 = new ListElement<Integer>(100);
		ListElement<Integer> elem2 = new ListElement<Integer>(200);
		elem1.setNext(elem2);
		ListElement<Integer> elem3 = new ListElement<Integer>(300);
		elem2.setNext(elem3);
		ListElement<Integer> elem4 = new ListElement<Integer>(400);
		elem3.setNext(elem4);
		elem4.setNext(elem2);
		MyLinkedList<Integer> list = new MyLinkedList<>(elem1);
		detectLoop(list);
		list.traverse();
	}

	public static void detectLoop(MyLinkedList<Integer> list) {	
		ListElement<Integer> head = list.getHead();
		ListElement<Integer> p = head;
		ListElement<Integer> q = head.getNext();
		while (p != null && q != null) {
			if (p.getData().equals(q.getData())) {
				System.out.println("Loop detected");
				System.out.println("Deleteing Loop...");
				deleteLoop(p);
				System.out.println("Loop deleted");
				break;
			}
			p = p.getNext();
			q = q.getNext() != null ? q.getNext().getNext() : q.getNext();

		}
	
	}
	
	public static void deleteLoop(ListElement<Integer> loopElement) {
		loopElement.getNext().setNext(null);
//		System.out.println(loopElement.getData());
	}
	
	public static void reverse(MyLinkedList<Integer> list) {
		ListElement<Integer> head=list.getHead();
		ListElement<Integer> p,q,r;
	}

}
