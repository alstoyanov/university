package com.helapal.datastructures.api;

public interface Stack<T> {
	public void push(T element);
	public T peak();
	public T pop();
	public int size();
}
