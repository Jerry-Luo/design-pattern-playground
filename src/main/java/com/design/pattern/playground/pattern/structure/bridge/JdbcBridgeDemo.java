package com.design.pattern.playground.pattern.structure.bridge;

import sun.reflect.Reflection;

import java.sql.*;

/**
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2020/8/18 12:41
 */
public class JdbcBridgeDemo {
    public void test () throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");//加载及注册JDBC驱动程序
        String url = "jdbc:mysql://localhost:3306/sample_db?user=root&password=your_password";
        Connection con = DriverManager.getConnection(url);
        Statement stmt = con.createStatement();
        String query = "select * from test";
        ResultSet rs=stmt.executeQuery(query);
        while(rs.next()) {
            rs.getString(1);
            rs.getInt(2);
        }
    }
}

// 源码之下无秘密。要弄清楚这个问题，我们先从 com.mysql.jdbc.Driver 这个类的代码看起。我摘抄了部分相关代码，放到了这里，你可以看一下。
//
//package com.mysql.jdbc;
//        import java.sql.SQLException;
//
//public class Driver extends NonRegisteringDriver implements java.sql.Driver {
//    static {
//        try {
//            java.sql.DriverManager.registerDriver(new Driver());
//        } catch (SQLException E) {
//            throw new RuntimeException("Can't register driver!");
//        }
//    }
//
//    /**
//     * Construct a new driver and register it with DriverManager
//     * @throws SQLException if a database error occurs.
//     */
//    public Driver() throws SQLException {
//        // Required for Class.forName().newInstance()
//    }
//}


//public class DriverManager {
//    private final static CopyOnWriteArrayList<DriverInfo> registeredDrivers = new CopyOnWriteArrayList<DriverInfo>();
//
//    //...
//    static {
//        loadInitialDrivers();
//        println("JDBC DriverManager initialized");
//    }
//    //...
//
//    public static synchronized void registerDriver(java.sql.Driver driver) throws SQLException {
//        if (driver != null) {
//            registeredDrivers.addIfAbsent(new DriverInfo(driver));
//        } else {
//            throw new NullPointerException();
//        }
//    }
//
//    public static Connection getConnection(String url, String user, String password) throws SQLException {
//        java.util.Properties info = new java.util.Properties();
//        if (user != null) {
//            info.put("user", user);
//        }
//        if (password != null) {
//            info.put("password", password);
//        }
//        return (getConnection(url, info, Reflection.getCallerClass()));
//    }
//    //...
//}
