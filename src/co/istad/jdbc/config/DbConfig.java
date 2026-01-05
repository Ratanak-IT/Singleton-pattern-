package co.istad.jdbc.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbConfig {

    // Singleton pattern
    private static Connection conn; //need static to singleton pattern
    public static Connection getConn() {
        return conn;
    }

    // Initialize connection object
    public static void init(){
        if (conn == null) {

            // Start JDBC foundation steps
            // Step 1. Load driver
            try {
                Class.forName("org.postgresql.Driver");
            }catch (ClassNotFoundException e){
                System.out.println("driver not found"+ e.getMessage());
            }

            //step2 define connection URL
            final String DB_URL = "jdbc:postgresql://localhost:1681/a01_m1";
            Properties properties=new Properties();
            properties.put("user","postgres");
            properties.put("password","0116");

            //step 3 Establish connection
            try {
                conn = DriverManager.getConnection(DB_URL,properties);
            }catch (Exception e){
                System.out.println("error sql connecting to database"+ e.getMessage());
            }
        }
    }

}
