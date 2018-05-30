package com.helapal.datastructures.api;

public interface Queue<T> {
	public void add(T element);
	public T read();
	public T extract();
	public int size();
}
