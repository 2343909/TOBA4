package bussines;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ekrem Mujic
 */
import bussines.DBUtill;
import bussines.User;
import java.sql.*;

public class UserDB {
    public static int insert(User user) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;

        String query
                = "INSERT INTO User (firstName, lastName, phoneNumber, address,"
                + "city, state, zipCode, email, username, password)"
                + "VALUES (?, ?, ?, ?,?, ?, ?, ?, ?, ?)";

        try {
            ps = connection.prepareStatement(query);
	    ps.setString(1, user.getfirstName());
            ps.setString(2, user.getlastName());
            ps.setString(3, User.getphoneNumber());
            ps.setString(4, user.getaddress());
            ps.setString(5, user.getcity());
            ps.setString(6, user.getstate());
            ps.setString(7, user.getzipCode());
            ps.setString(8, user.getemail());
            ps.setString(9, user.getusername());
            ps.setString(10, user.getpassword());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }

    public static int update(User user) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;

        String query = "UPDATE User SET "
                + "firstName = ?, "
                + "lastName = ?, "
                + "phoneNumber = ?, "
                + "address = ?, "
                + "city = ?, "
                + "state = ?, "
                + "zipCode = ?, "
                + "username = ?, "
                + "password = ?, "
                + "WHERE email = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user.getfirstName());
            ps.setString(2, user.getlastName());
            ps.setString(3, user.getphone());
            ps.setString(4, user.getaddress());
            ps.setString(5, user.getaddress2());
            ps.setString(6, user.getcity());
            ps.setString(7, user.getst());
            ps.setString(8, user.getzip());
            ps.setString(9, user.getemail());
            ps.setString(10, user.getusername());
            ps.setString(11, user.getpassword());

            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }

    public static int delete(User user) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;

        String query = "DELETE FROM User "
                + "WHERE username = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user.getusername());

            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }

    public static boolean usernameExists(String username) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT username FROM User "
                + "WHERE username = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }

    public static User selectUser(String username) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT * FROM User "
                + "WHERE username = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            User user = null;
            if (rs.next()) {
                user = new User();
                user.setfirstName(rs.getString("firstName"));
                user.setlastName(rs.getString("lastName"));
                user.setphoneNumber(rs.getString("phoneNumber"));
                user.setaddress(rs.getString("address"));
                user.setcity(rs.getString("city"));
                user.setstate(rs.getString("state"));
                user.setzipCode(rs.getString("zipCode"));
                user.setemail(rs.getString("email"));
                user.setusername(rs.getString("username"));
                user.setpassword(rs.getString("password"));
            }
            return user;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
}    
