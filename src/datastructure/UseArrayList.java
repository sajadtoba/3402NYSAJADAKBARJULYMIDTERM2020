package datastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) throws SQLException {
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

		// Removed the data

		if(movieArrayList.size() > 4 ){
			movieArrayList.remove(4);
			System.out.println("One element was removed");
		}
		//Display available movies using for loop
		System.out.println(" list of available movies");
		movieArrayList.forEach((m) -> System.out.println("Available: " +m));

		// for loop
		for(String exyz: movieArrayList) {
			System.out.println(exyz);
		}
		System.out.println("                 for while loop");

		int i = 0;
		while (movieArrayList.size() > i) {
			System.out.println(movieArrayList.get(i));
			i++;
		}

		System.out.println("Used the Iterator Method                               ");
//		Iterator it = movieArrayList.iterator();
//		while (it.hasNext()) {
//			System.out.println(movieArrayList.get(i));
//		}


		String url = "jdbc:mysql://localhost:3306/UseArrayList?Timezone=UTC";
		String userID = "root";
		String password ="cAt@123";
		//Connection connection = DriverManager.getConnection(url,userID,password);
		Connection connection = null;
		Statement statement =null;


		try{
			connection = DriverManager.getConnection(url,userID,password);
			statement = connection.createStatement();
			String query1 = "insert into arraylist(id, club)values('9','Great love too');";
			String query2 = "insert into arraylist(id, club)values('7','SpidermanII');";
			String query3 = "insert into arraylist(id, club)values('8','Lovly Boy');";
			statement.execute(query2);
			//statement.execute(query1, "" +query2+,""+query3);
			System.out.println("extra movie added");
		}catch(SQLException ex){
			ex.printStackTrace();
			System.out.println("Something might not ");
		}

		finally {
			statement.close();
			connection.close();
		}



	}

}
