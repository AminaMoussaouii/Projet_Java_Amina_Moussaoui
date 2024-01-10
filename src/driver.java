import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class driver {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/systemeducatif";
        String user = "root";
        String pwd = "";
        try {
            Connection con = DriverManager.getConnection(url, user, pwd);
            System.out.println("Meielleur connection");
        } catch (SQLException e) {
            System.out.println("Mauvaise connection");
            e.printStackTrace();
        }
    }
}
