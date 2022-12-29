package javaInterview;

public class test4 {

	public static void main(String[] args) {
		String name = "My name is manvir singh";
		
		String[] arrayList = name.split(" ");
		
		
		for (int i = 0; i < arrayList.length; i++) {
			System.out.print(arrayList[i].substring(0,arrayList[i].length()-1)+" ");
			
		}

	}

}
