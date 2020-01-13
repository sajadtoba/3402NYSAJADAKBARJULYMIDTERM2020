package datastructure;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		ArrayList<String> movieArrayList = new ArrayList<>();

		// adding values in the Array list

		movieArrayList.add(" The beautiful and the best");
		movieArrayList.add("Loveforever");
		movieArrayList.add("Dance on the floor");
		movieArrayList.add("SpiderMan");
		movieArrayList.add("Mr.King");

		//how to display the movies
		// remove data from Arraylist

		if(movieArrayList.size() > 4 ){
			movieArrayList.remove(4);
			System.out.println("One element was removed");

		}
		//Display available movies using for loop
		System.out.println(" list of available movies");
		movieArrayList.forEach((m) -> System.out.println("Available: " +m));



	}

}
