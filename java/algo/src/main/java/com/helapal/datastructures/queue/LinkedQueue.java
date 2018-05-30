package com.helapal.datastructures.queue;

import com.helapal.datastructures.api.Queue;

public class LinkedQueue<T> implements Queue<T> {
	private class Node {
		public T value;
		public Node next;

		public Node(T value) {
			this.value = value;
		}
	}

	private Node start;
	private Node last;
	public int size = 0;

	@Override
	public int size() {
		return size;
	}

	@Override
	public void add(T elem) {
		Node newNode = new Node(elem);

		if (start == null) {
			start = newNode;
			last = start;
		} else {
			last.next = newNode;
			last = newNode;
		}

		size++;
	}

	@Override
	public T read() {
		T result = null;
		if (start != null) {
			result = start.value;
		}
		return result;
	}

	@Override
	public T extract() {
		T result = null;
		if (start != null) {
			result = start.value;
			start = start.next;
			size--;
		}
		return result;
	}

}
