package test.datastructures.abhilash;

import java.util.ArrayList;
import java.util.List;

import com.datastructures.abhilash.MyStack;


public class MyStackTest {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		MyStack<String> stack=new MyStack<>(list,5);
		System.out.println(stack.isEmpty());
		stack.push("11-645");
		stack.push("Srinivasapuram");
		stack.push("santhapet");
		stack.push("Nellore");
		stack.push("pin-524001");
		System.out.println(stack.push("Andhra Pradesh"));
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
	}

}
