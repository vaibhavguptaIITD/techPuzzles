package com.tech.puzzles.list;

public class ListClient<T> {
	
	ListElement<T> head = null;
	ListElement<T> tail = null;
	
	public void delete(ListElement<T> element){
		ListElement<T> currElement = head;
		if(element == head){
			head = element.getNext();
			if(head == null){
				tail = null;
			}
			return;
		}
		while(currElement != null){
			if(currElement.getNext() == element){
				currElement.setNext(element.getNext());
				if(currElement.getNext() == null){
					tail = currElement;
				}
				return;
			}
			currElement = currElement.getNext();
		}
	}
	
	

}
