package datastructure;    // ..............................done

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> citOFBD = new ArrayList<>();
		citOFBD.add("Germany");
		citOFBD.add("France");
		citOFBD.add("Spain");
		citOFBD.add("Itly");

		List<String> stateOfUSA = new ArrayList<>();
		stateOfUSA.add("New York");
		stateOfUSA.add("Texas");
		stateOfUSA.add("Marryland");
		stateOfUSA.add("Florida");

		List<String>cityofUK = new ArrayList<>();
		cityofUK.add("London");
		cityofUK.add("Manchaster");
		cityofUK.add("Liverpool");

		Map<String, List<String>> list = new HashMap<>();
		list.put("BD", citOFBD);
		list.put("UK", cityofUK);
		list.put("USA",stateOfUSA);


		System.out.println("");
		System.out.println("Printout the values using for each loop.....");
		for(Map.Entry<String,List<String>> st : list.entrySet()) {
			System.out.println(st.getKey()+ " ........>" +st.getValue());;
		}

		System.out.println("");
		System.out.println("Printout the values iterator.......");
// Use the set method

		Set set = list.entrySet();

		Iterator it = set.iterator();

		// using the while


		while (it.hasNext()) {
			System.out.println(it.next());
		}


	}

}
