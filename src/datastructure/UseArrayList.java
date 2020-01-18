package datastructure; // ...................done

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

		movieArrayList.add(" The beautiful and the best movie in the town");
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

		// 1st three initialized the variables
		// ...............*..................................................



		String url = "jdbc:mysql://localhost:3306/UseArrayList?Timezone=UTC";
		String userID = "root";
		String password ="cAt@123";
		//Connection connection = DriverManager.getConnection(url,userID,password);
		// Initilized the Variables and given the value null because they don't have the value

		Connection connection = null;
		Statement statement =null;

		// used the try and catch block


		try{
			 connection = DriverManager.getConnection(url,userID,password);
			 statement = connection.createStatement();

			 // Used the Getter and Setter Method

			 ArrayList2 dance = new ArrayList2("17","God is great");

			String query1 = "insert into arraylist2(id,club)"+"Values('"+dance.getId()+"','"+dance.getClub()+"');";

			// Updated the Query

			String query= "update arraylist2 set club = 'I love to dance' where id = '8'";

			// Insert the value into SQl by using JDBC connection

			String query2 = "insert into arraylist2(id, club)values('18','white Girl');";


			//String query2 = "insert into arraylist2(id, club)values('18','SpidermanIII');";
			//String query3 = "insert into arraylist(id, club)values('8','Lovly Boy');";
			//statement.execute(query1);
			statement.execute(query);
			statement.execute(query1);
			statement.execute(query2);
			//statement.execute(query1, "" +query2+, "" +query3);

			System.out.println("extra value is added");
		}catch(SQLException ex){
			ex.printStackTrace();
			System.out.println("Something might not ");
		}
		// Close the connection and statement

		finally {
			statement.close();
			connection.close();
		}



	}   // Belong to Main Method

}   // Belong to Main class
