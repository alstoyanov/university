package com.helapal.datastructures.list;

import com.helapal.datastructures.api.List;

public class LinkedList<T> implements List<T> {
	private class Node {
		public T value;
		public Node next;

		public Node(T value) {
			this.value = value;
		}
	}

	private Node start;
	private Node last;

	@Override
	public int size() {
		int size = 0;
		Node curr = start;
		while (curr != null) {
			size++;
			curr = curr.next;
		}
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
	}

	@Override
	public void add(int possition, T elem) {
		//TODO implement;
	}

	@Override
	public T get(int possition) {
		T result = null;

		int currSize = size();
		if (possition >= 0 && possition < currSize) {
			int currPos = 0;
			Node curr = start;
			while (currPos < possition) {
				currPos++;
				curr = curr.next;
			}
			result = curr.value;
		} else {
			throw new ArrayIndexOutOfBoundsException("Possition " + possition + " is out of rage: 0 - " + (currSize - 1));
		}

		return result;
	}

	@Override
	public T delete(int possition) {
		T toDeleteValue = null;

		int currSize = size();
		if (possition >= 0 && possition < currSize) {
			int currPos = 0;
			Node curr = start;
			while (currPos < possition - 1) {
				currPos++;
				curr = curr.next;
			}

			if (start == last) {
				toDeleteValue = start.value;
				start = null;
				last = null;
			} else if (possition == 0) {
				toDeleteValue = start.value;
				start = start.next;
			} else if (curr.next != last) {
				toDeleteValue = curr.next.value;
				curr.next = curr.next.next;
			} else {
				toDeleteValue = last.value;
				last = curr;
			}
		} else {
			throw new ArrayIndexOutOfBoundsException("Possition " + possition + " is out of rage: 0 - " + (currSize - 1));
		}

		return toDeleteValue;
	}

}
