package com.helapal.datastructures.stack;

import com.helapal.datastructures.api.Stack;

public class ArrayStack<T> implements Stack<T>{
	private T[] stack;
	private int top;
	
	public ArrayStack(){
		this(100);
	}
	
	@SuppressWarnings("unchecked")
	public ArrayStack(int size) {
		top = -1;
		stack = (T[]) new Object[size];
	}

	@Override
	public void push(T element) {
		if(stack.length == top + 1) {
			resize();
		}
		top++;
		stack[top] = element;
	}

	@Override
	public T peak() {
		if(top == -1) return null;
		return stack[top];
	}

	@Override
	public T pop() {
		T result = null;
		if(top >= 0) {
			result = stack[top];
			top--;
		}
		return result;
	}

	@Override
	public int size() {
		return top + 1;
	}

	@SuppressWarnings("unchecked")
	private void resize(){
		T[] newStack = (T[]) new Object[stack.length * 2];
		for(int i = 0 ; i < top ; i++) {
			newStack[i] = stack[i];
		}
		
		this.stack = newStack;
	}

}
