package com.helapal.datastructures.api;

public interface List<T> {
	public int size();
	public void add(T elem);
	public void add(int possition, T elem);
	public T get(int possition);
	public T delete(int possition);
}
