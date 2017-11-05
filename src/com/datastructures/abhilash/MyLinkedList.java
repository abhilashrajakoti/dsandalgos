package com.datastructures.abhilash;

public class MyLinkedList<T> {

	private ListElement<T> head;

	public MyLinkedList(ListElement<T> head) {
		this.head = head;
	}

	public void traverse() {
		ListElement<T> curr = head;
		while (curr != null) {
			System.out.println(curr.getData());
			curr = curr.getNext();
		}
	}

	public ListElement<T> getHead() {
		return head;
	}

	public void insertAtEnd(ListElement<T> data) {
		ListElement<T> curr = head;
		while (curr.getNext() != null) {
			curr = curr.getNext();
		}
		curr.setNext(data);
		data.setNext(null);
	}

	public void insertAtFront(ListElement<T> data) {
		data.setNext(head);
		head = data;
	}

	public boolean insertAfter(ListElement<T> data, T pos) {
		ListElement<T> curr = head;
		while (curr != null && !curr.getData().equals(pos)) {
			curr = curr.getNext();
		}
		if (curr == null) {
			return false;
		} else {
			ListElement<T> temp = curr.getNext();
			curr.setNext(data);
			data.setNext(temp);
			return true;
		}
	}

	public boolean insertBefore(ListElement<T> data, T pos) {
		ListElement<T> curr = head;
		while (curr.getNext() != null && !curr.getNext().getData().equals(pos)) {
			curr = curr.getNext();
		}
		if (!curr.getData().equals(pos) && curr.getNext() == null) {
			return false;
		} else {
			ListElement<T> temp = curr.getNext();
			data.setNext(temp);
			curr.setNext(data);
			return true;
		}
	}

	public ListElement<T> findElement(T key) {
		ListElement<T> curr = head;
		if (head == null) {
			return null;
		}
		while (curr != null && !curr.getData().equals(key)) {
			curr = curr.getNext();
		}

		if (curr != null)
			return curr;
		else
			return null;
	}

	public ListElement<T> deleteElement(T key) {
		ListElement<T> curr = head;
		if (curr.getData().equals(key)) {
			// delete head
			ListElement<T> temp = curr.getNext();
			head = temp;
			return curr;
		}
		while (curr.getNext() != null && !curr.getNext().getData().equals(key)) {
			curr = curr.getNext();
		}
		if (curr.getData().equals(key) && curr.getNext() == null) {
			// last element deletion
			ListElement<T> delElem = curr;
			curr = null;
			return delElem;
		} else if (curr.getNext() == null) {
			return null;
		} else {
			ListElement<T> temp = curr.getNext().getNext();
			ListElement<T> delElem = curr.getNext();
			curr.setNext(temp);
			return delElem;
		}
	}

}
