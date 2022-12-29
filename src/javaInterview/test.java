package javaInterview;

import java.util.ArrayList;

public class test {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> stringList = new ArrayList<>();
		ArrayList<String> newList = new ArrayList<>();
		stringList.add("ram");
		stringList.add("shyam");
		stringList.add("tom");
		stringList.add("peter");
		stringList.add("mani");
		
		for (int i = 0; i < stringList.size(); i++) {
			
			if(stringList.get(i).contains("a")) {
				continue;
			}else {
				newList.add(stringList.get(i));
			}
		}
		
		System.out.println(newList);

	}

}
