package com.ericsson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyArrayList<T> implements Iterable<T>{
	private List<T> list = new ArrayList<T>();
	private int numberElements = 0;
	private int index=0;
	
	public final static int MAX_ELEMENTS = 10;

	
	public MyArrayList(){	}
	
	public boolean add(T item){
		if(list.size() < MAX_ELEMENTS){
			list.add(index++, item);
			if(index >= MAX_ELEMENTS)
				index = 0;
			numberElements++;
			return true;
		}
		return false;
	}
	
	public T getItem(int index) throws IndexOutOfBoundsException{
		if(index >= list.size() || index < 0){
			throw new IndexOutOfBoundsException("Indexed out or MyArrayList bounds");
		}
		return list.get(index);
	}
	
	public void remove(int index)throws IndexOutOfBoundsException{
		if(index >= numberElements || index < 0){
			throw new IndexOutOfBoundsException("Indexed out or MyArrayList bounds");
		}
		list.remove(index);
		numberElements--;
	}

	public Iterator<T> iterator(){
		return list.iterator();
	}

}
