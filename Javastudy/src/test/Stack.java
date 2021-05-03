package test;

import java.util.ArrayList;

public class Stack {

	private ArrayList<String> arrayStack = new ArrayList<>();

	public void push(String data) {
		arrayStack.add(data);
	}

	public String pop() {
		int len = arrayStack.size();
		if (len == 0) {
			System.out.println("stack is empty");
			return null;
		}
		return (arrayStack.remove(len - 1));

	}
	public void show() {
		for(String key:arrayStack) {
			System.out.print(key+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.show();
		stack.pop();
		stack.show();
	}

}
