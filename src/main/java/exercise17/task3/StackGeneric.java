package exercise17.task3;

import java.util.ArrayList;

public class StackGeneric<Type> {

	private final ArrayList<Type> typeList = new ArrayList<>();

	public void push(Type element) {
		typeList.add(element);
	}

	public Type pop() {
		Type element = null;
		try {
			element = typeList.getLast();
			typeList.removeLast();
		} catch (Exception e) {
			System.out.println("Can not pop an empty stack!");
		}
		return element;
	}

	public ArrayList<Type> getTypeList() {
		return typeList;
	}

	public static void main(String[] args) {
		StackGeneric<String> stack = new StackGeneric<>();
		stack.pop();
		stack.push("Hello");
		stack.push("World");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}