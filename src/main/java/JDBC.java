import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {
    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ksiegarnia?user=root");
            Class.forName("com.mysql.cj.jdbc.Driver");

            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO klienci (imie, nazwisko, miejscowosc) VALUES (?, ?, ?)");
            preparedStatement.setString(1, "Tomker");
            preparedStatement.setString(2, "W");
            preparedStatement.setString(3, "Gre");

            preparedStatement.execute();
            conn.close();
        }
        catch (Exception ex){}
    }
}