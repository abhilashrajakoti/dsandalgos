package com.datastructures.abhilash;

public class BST<T extends Comparable<T>> {
	private BSTNode<T> root;

	public BST(BSTNode<T> root) {
		this.root = root;
	}

	public void inorder(BSTNode<T> x) {
		if (x != null) {
			inorder(x.getLeft());
			System.out.println(x.getData());
			inorder(x.getRight());
		}
	}

	public void preorder(BSTNode<T> x) {
		if (x != null) {
			System.out.println(x.getData());
			preorder(x.getLeft());
			preorder(x.getRight());
		}
	}

	public void postorder(BSTNode<T> x) {
		if (x != null) {
			postorder(x.getLeft());
			postorder(x.getRight());
			System.out.println(x.getData());

		}
	}

	public BSTNode<T> treeSearch(BSTNode<T> x, T k) {
		BSTNode<T> knode = new BSTNode<>(k);
		if (x == null || x.getData().equals(k))
			return x;
		else if (knode.compareTo(x) < 0)
			return treeSearch(x.getLeft(), k);
		else
			return treeSearch(x.getRight(), k);

	}
	
	public BSTNode<T> treeMin(BSTNode<T> x){
		while(x.getLeft()!=null) {
			x=x.getLeft();
		}
		return x;
	}
	public BSTNode<T> treeMax(BSTNode<T> x){
		while(x.getRight()!=null) {
			x=x.getRight();
		}
		return x;
	}
	public BSTNode<T> treeSuccessor(BSTNode<T> x){
		if(x.getRight()!=null){
			return treeMin(x.getRight());
		}
		BSTNode<T> y=x.getParent();
		while(y!=null && x==y.getRight()) {
			x=y;
			y=y.getParent();
		}
		return y;
	}
	public BSTNode<T> treePredecessor(BSTNode<T> x){
		if(x.getLeft()!=null) {
			return treeMax(x.getLeft());
		}
		BSTNode<T> y=x.getParent();
		while(y!=null && x==y.getLeft()) {
			x=y;
			y=y.getParent();
		}
		return y;
		
	}

}
