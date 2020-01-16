package datastructure;         // ..................done

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool (Typing mistake)elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
// it is exact lke ArrayList

		Queue<String> queue = new LinkedList<>();
		System.out.println("Adding values using adding methods too.....");
		queue.add("Germany");
		queue.add(("France"));
		queue.add("Switzerland");
		queue.add("Spain");
		System.out.println(queue);
		System.out.println("");
		System.out.println("France");

		if(queue.peek().equals("France")) {
			System.out.println(queue.poll());
		}

		System.out.println(" ");

		// used the while loop

		System.out.println("Print  out the values using iterator..... by useing java keyword Iterator ");

		Iterator it = queue.iterator();

				while(it.hasNext()){

					System.out.println(it.next());
	}

	System.out.println(" ");

System.out.println("Removing the values Using remove methods.....");

		System.out.println(queue.remove("Germany"));
		System.out.println(queue);
		System.out.println("");


		System.out.println("Printout the values using for each loop.....");

		for(String st: queue){

			System.out.println(st);
		}


	}

}
