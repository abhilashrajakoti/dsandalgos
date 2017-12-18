package test.datastructures.abhilash;

import com.datastructures.abhilash.BST;
import com.datastructures.abhilash.BSTNode;

public class BSTtest {
	
	public static void main(String[] args) {
		BSTNode<Integer> root=new BSTNode<>(4);
		BSTNode<Integer> six=new BSTNode<>(6);
		BSTNode<Integer> one=new BSTNode<>(1);
		BSTNode<Integer> eight=new BSTNode<>(8);
		BSTNode<Integer> three=new BSTNode<>(3);
		BSTNode<Integer> two=new BSTNode<>(2);
		BST<Integer> bst=new BST<>(root);
		root.setLeft(one);
		root.setRight(six);
		root.setParent(null);
		six.setRight(eight);
		six.setParent(root);
		one.setRight(three);
		one.setParent(root);
		three.setLeft(two);
		three.setParent(one);
		eight.setParent(six);
		bst.inorder(root);
		System.out.println("===========");
		bst.preorder(root);
		System.out.println("===========");
		bst.postorder(root);
		System.out.println("===========");
		System.out.println(bst.treeSearch(root, 8));
		System.out.println("Tree Minimum: "+bst.treeMin(root).getData());
		System.out.println("Tree Maximum: "+bst.treeMax(root).getData());
		System.out.println("successor: "+bst.treeSuccessor(three).getData());
		System.out.println("predecessor: "+bst.treePredecessor(eight).getData());
	}

}
