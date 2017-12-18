package com.datastructures.abhilash;

public class BSTNode<T extends Comparable<T>> implements Comparable<BSTNode<T>> {
	private T data;
	private BSTNode<T> left;
	private BSTNode<T> right;
	private BSTNode<T> parent;

	public BSTNode(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BSTNode<T> getLeft() {
		return left;
	}

	public void setLeft(BSTNode<T> left) {
		this.left = left;
	}

	public BSTNode<T> getRight() {
		return right;
	}

	public void setRight(BSTNode<T> right) {
		this.right = right;
	}
	

	public BSTNode<T> getParent() {
		return parent;
	}

	public void setParent(BSTNode<T> parent) {
		this.parent = parent;
	}

	@Override
	public int compareTo(BSTNode<T> o) {
		return data.compareTo(o.data);
	}

	
}