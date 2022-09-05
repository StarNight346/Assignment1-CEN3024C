package cop2805;

import java.util.*;

public class CollectionPractice {

	//Note: I wanted practice with each type of iteration method so I used them all in my code. The iterator, the for each loop and the for loop. Hope it is what your looking for.
	//Thank you for everything as well. The lecture really helped to explain things.
	
	//Method for outputting the ArrayList
	public static void Output(List<String> l) {
		for (Object myList : l) {
			System.out.print(myList + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> initialList = new ArrayList<String>(); //Creating the initial List for the ArrayLisy
		ArrayList<String> reverseList = new ArrayList<String>(); //Creating the reverse List to copy the initial ArrayList later
		initialList.add("A"); //Add first initial
		initialList.add("P"); //Add middle initial
		initialList.add("B"); //Add last initial

		//Creating an iterator to fill the reverse list with strings so that it is the same size as the initial list for the copying later
		/*Note: Is there an easy way to set the size of an ArrayList so you can copy them later? I found someone used something like 
		ArrayList<String> myArrList = new ArrayList<String>(Collections.nCopies(10, "J")); to fill the array. *I modified the code. The used it with integers
		Are there other methods for copying ArrayLists that are not of the same size?*/
		Iterator<String> iter = initialList.iterator();
		while(iter.hasNext()) {
			Object obj = iter.next();
			reverseList.add(obj +"0");
		}
		
		//I initially filled the reverse list using a for each loop but I wanted practice with the iterator so I wrote the above code 
		//for (Object str : initialList) {  
		//reverseList.add(str + " 0 ");
		//} 
		
		//Outputting the initial List
		System.out.println("Initial List");
		CollectionPractice.Output(initialList);
		
		//Reversing the list
		Collections.reverse(initialList);
		
		//Outputting the reverse list
		System.out.println("\nReversed List");
		CollectionPractice.Output(initialList);
		
		//Copying the initial list to the reverse list
		Collections.copy(reverseList, initialList);
		
		//outputting the copied list
		System.out.println("\nCopied List");
		CollectionPractice.Output(reverseList);

		//Filling the initial list with Rs
		System.out.println("\nR Filled List");
		for (int i = 0; i < initialList.size(); i++) {
			
			initialList.set(i, "R");
		}
		
		//outputting the R Filled list
		CollectionPractice.Output(initialList);
	}

}
