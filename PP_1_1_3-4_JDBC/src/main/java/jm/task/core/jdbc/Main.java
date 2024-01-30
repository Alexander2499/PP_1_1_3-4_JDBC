package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Main {
//    private static  final String URL = "jdbc:mysql://localhost:3306/user";
//    private static final String USERNAME = "root";
//    private static final String PASSWORD = "root";
//    private static Connection connection;

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.dropUsersTable();
        userService.createUsersTable();
        userService.saveUser("Саня","Коротков", (byte) 29);
        userService.saveUser("Евгений","Молочников", (byte) 28);
        userService.saveUser("Эдуард","Климов", (byte) 25);
        userService.removeUserById(3);
        List<User> listUsers = userService.getAllUsers();
        for (User i : listUsers) {
            System.out.println(i);
        }



        //Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//        String customerTableQuery = "CREATE TABLE users " +
//                "(id Long, name String , lastName String, age Byte)";
//        String customerEntryQuery = "INSERT INTO customers " +
//                "VALUES (1, 'Борис', 'Вельдинский', 26)";
//        executeUpdate(customerTableQuery);
//        executeUpdate(customerEntryQuery);
//        connection.createStatement().execute("SELECT * FROM users");

//        Connection connection;
//        try {
//            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//            Statement statement = connection.createStatement();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
        // реализуйте алгоритм здесь
    }
//    private static int executeUpdate(String query) throws SQLException {
//        Statement statement = connection.createStatement();
//        // Для Insert, Update, Delete
//        int result = statement.executeUpdate(query);
//        return result;
//    }
//    private Connection getNewConnection() throws SQLException {
//        String url = "jdbc:mysql://localhost:3306/user";
//        String user = "root";
//        String passwd = "root";
//        return DriverManager.getConnection(url, user, passwd);
//    }
//    @Test
//    public void shouldGetJdbcConnection() throws SQLException {
//        try(Connection connection = getNewConnection()) {
//            assertTrue(connection.isValid(1));
//            assertFalse(connection.isClosed());
//        }
//    }


}
