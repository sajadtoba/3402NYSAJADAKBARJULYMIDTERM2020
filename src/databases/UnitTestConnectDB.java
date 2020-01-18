package databases;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

public class UnitTestConnectDB {
    public static void main(String[] args) throws SQLException {
        //ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

        String url = "jdbc:mysql://localhost:3306/midterm?Timezone=UTC";
        String userID = "root";
        String password ="cAt@123";
        Connection connection = null;
        Statement statement = null;



        try{
            connection = DriverManager.getConnection(url,userID,password);
            statement = connection.createStatement();
            String query ="insert into pnt(id,name) values('3404_NY','Employee Clsess');";
            statement.execute(query);

        }catch(SQLException ex){
            ex.printStackTrace();
            System.out.println("Something might not ");
        }
        // Close the connection and statement
        finally {
            statement.close();
            connection.close();
        }
} }
