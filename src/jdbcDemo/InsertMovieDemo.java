package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class InsertMovieDemo
{
        public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/netflix?serverTimezone=UTC";
        String user = "root";
        String password = "root";
        Connection connection = null;
        Statement statement = null;

        Movie titanic = new Movie(5, "Titanic", 1997,
                "Romance", "PG-13");
        Movie grudge = new Movie(6, "Grudge", 2003,
                "Horror", "PG-13");
        Movie inception = new Movie(7, "Inception", 2010,
                "Thriller", "PG-13");

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(titanic);
        movies.add(grudge);
        movies.add(inception);

        try {

            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            for (Movie mv : movies) {
                String query = "insert into movie(id, title, releaseYear, genre, mpaaRating) " +
                        "values(" + mv.getId() + ",'" + mv.getTitle() + "'," + mv.getReleaseYear()
                        + ",'" + mv.getGenre() + "','" + mv.getMpaaRating() + "')";
                statement.execute(query);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            statement.close();
            connection.close();
        }

    }

    }