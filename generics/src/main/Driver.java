package main;

import com.ericsson.MyArrayList;

public class Driver {

	public static void main(String[] args) {
		MyArrayList<String> list = new MyArrayList<String>();
		
		for(int i=0; i < MyArrayList.MAX_ELEMENTS*2; i++){
			list.add("String "+ i);
		}
		
		for(int i=0; i < MyArrayList.MAX_ELEMENTS; i++){
			System.out.println(list.getItem(i));
		}
	
		
		list.remove(5);
		
		System.out.println("Iterating using for each loop");
		
		for(String s : list){
			System.out.println(s);
		}
		
	}

}
