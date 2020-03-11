package Epam;

import java.util.*;
public class ArrayListExample {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		
		//ADDING ELEMENTS IN TO THE LIST
		
		System.out.println("Enter 10 names");
		for(int i=0;i<10;i++){
			arr.add(s.next());
		}
		
		//REMOVING ELEMENTS FROM THE LIST
		//REMOVING USING INDEX
		
		System.out.println("Enter a number to remove from the list");
		int x = s.nextInt();
		arr.remove(x-1);
		for (String i : arr) {
		      System.out.println(i);
		}
		
		//REMOVING USING STRING
		
		System.out.println("Enter a name to remove from the list");
		String str = s.next();
		arr.remove(str);
		for (String i : arr) {
		      System.out.println(i);
		}
		
		//GET FUNCTION
		
		String element = arr.get(2); 
		System.out.println("the element at index 2 is " + element); 
		
		//GET SIZE FUNCTION
		
		int size = arr.size(); 
		System.out.println("Size of list = "+ size); 
		
		//CONTAINS FUNCTION
		
		System.out.println("Enter a name to check if it is present in the list");
		String str2 = s.next();
		if(arr.contains(str2)){
			System.out.println(str2+" is present in the list");
		}
		else{
			System.out.println(str2+" is not present in the list");
		}
		
		//ISEMPTY FUNCTION
		
		System.out.println("List is empty or not ? "+arr.isEmpty());
	}
	
}