package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo
{
    public static void main(String[] args) throws SQLException
    {
        Connection connection = null;
        Statement statement = null;
        try {

            // 1. CREATE A CONNECTION
             connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/netflix?serverTimezone=UTC",
                    "root",
                    "root");

            // 2. CREATE A STATEMENT
             statement = connection.createStatement();

            // 3. EXECUTE THE SQL QUERY
            String query = "INSERT INTO movie (id, title, releaseYear, genre, mpaaRating)" +
                    "values (4, 'Godzilla: King of the Monsters', 2019, 'Fantasy', 'PG-13')";
            statement.execute(query);

            // 4. PROCESS RESULT SET (if necessary)

        }catch (Exception e)
        {
            e.printStackTrace();
        }finally {
            statement.close();
            connection.close();
        }
    }
}
