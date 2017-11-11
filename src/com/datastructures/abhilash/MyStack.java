package com.datastructures.abhilash;

import java.util.List;

public class MyStack<T> {

	private List<T> stack;
	private int top=-1;
	private int max;

	public MyStack(List<T> stack, int max) {
		this.stack = stack;
		this.max = max;
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	public boolean push(T key) {
		if ((top + 1) == max) {
			return false; // overflow
		} else {
			top++;
			stack.add(top, key);
			return true;
		}
	}

	public T pop() {
		if (!isEmpty()) {
			T popElem = stack.remove(top);
			top--;
			return popElem;
		} else {
			// underflow
			return null;
		}
	}

}
