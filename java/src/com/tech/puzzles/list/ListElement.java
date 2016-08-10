package com.tech.puzzles.list;

public class ListElement<T> {
	private ListElement<T> next;
	private T data;
	
	public ListElement(T data){
		this.data = data;
	}

	public ListElement<T> getNext() {
		return next;
	}

	public void setNext(ListElement<T> next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}
