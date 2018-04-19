package MysqlCon;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MysqlCon {
    
    public static void main(String[] args){       
        connect();       
    }
    public static void connect() {
        String url = "jdbc:mysql://localhost:3306/prueba";
        String user = "root";
        String pass = "";
        System.out.println("Conectando...");
        try (Connection connection = (Connection) DriverManager.getConnection(url, user, pass)) {
            System.out.println("Conectado!!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
