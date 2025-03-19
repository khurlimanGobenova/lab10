package category3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Service
public class DatabaseService {

    @Value("${db.url}")
    private String dbUrl;

    @Value("${db.username}")
    private String dbUsername;

    @Value("${db.password}")
    private String dbPassword;

    @Value("${db.driver}")
    private String dbDriver;

    public void printDatabaseInfo() {
        System.out.println("Database URL: " + dbUrl);
        System.out.println("Database User: " + dbUsername);
        // Don't log the password in a real application
    }

    // Method to demonstrate using these credentials
    public Connection getDatabaseConnection() throws SQLException, ClassNotFoundException {
        Class.forName(dbDriver);
        return DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
    }
}