package com.helapal.datastructures.stack;

import com.helapal.datastructures.api.Stack;

public class LinkedStack<T> implements Stack<T> {
	private class Node {
		public T value;
		public Node previous;

		public Node(T value) {
			this.value = value;
		}
	}

	private Node last;
	public int size = 0;

	@Override
	public int size() {
		return size;
	}

	@Override
	public void push(T elem) {
		Node newNode = new Node(elem);

		if (last == null) {
			last = newNode;
		} else {
			newNode.previous = last;
			last = newNode;
		}

		size++;
	}

	@Override
	public T peak() {
		T result = null;
		if (last != null) {
			result = last.value;
		}
		return result;
	}

	@Override
	public T pop() {
		T result = null;
		if (last != null) {
			result = last.value;
			last = last.previous;
			size--;
		}
		return result;
	}

}
