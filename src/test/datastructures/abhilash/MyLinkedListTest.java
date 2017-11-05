package test.datastructures.abhilash;

import com.datastructures.abhilash.ListElement;
import com.datastructures.abhilash.MyLinkedList;

public class MyLinkedListTest {
	
	public static void main(String[] args) {
		ListElement<Integer> head=new ListElement<Integer>(100);
		MyLinkedList<Integer> list=new MyLinkedList<>(head);
		ListElement<Integer> elem1=new ListElement<Integer>(200);
		list.insertAtEnd(elem1);
		ListElement<Integer> elem2=new ListElement<Integer>(50);
		list.insertAtFront(elem2);
		ListElement<Integer> elem3=new ListElement<Integer>(150);
		list.insertAfter(elem3, 100);
		ListElement<Integer> elem4=new ListElement<Integer>(120);
		list.insertAfter(elem4, 100);
		ListElement<Integer> elem5=new ListElement<Integer>(75);
		list.insertAfter(elem5, 50);
		ListElement<Integer> elem6=new ListElement<Integer>(175);
		list.insertAfter(elem6, 150);
		ListElement<Integer> elem7=new ListElement<Integer>(300);
		list.insertAfter(elem7, 200);
		ListElement<Integer> elem8=new ListElement<Integer>(130);
		ListElement<Integer> elem9=new ListElement<Integer>(310);
		list.insertBefore(elem8, 150);
		list.traverse();
//		ListElement<Integer> found= list.findElement(175);
//		System.out.println(found==null?"not found":"found:: "+found.getData());
		ListElement<Integer> delElem=list.deleteElement(200);
		System.out.println(delElem==null?"not found":"deleted element:: "+delElem.getData());
		System.out.println(list.insertAfter(elem6, 135)?"inserted":"not inserted");
		System.out.println(list.insertBefore(elem9, 300)?"inserted":"not inserted");
		list.traverse();
	}

}
