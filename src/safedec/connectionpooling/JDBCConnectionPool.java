/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safedec.connectionpooling;

/**
 *
 * @author Prashul Singh
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class JDBCConnectionPool extends ObjectPool<Connection> {
 
    private String url, usr, pwd;
 
    public JDBCConnectionPool(String driver, String url, String usr, String pwd) {
        super();
        try {
            Class.forName(driver).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.url = url;
        this.usr = usr;
        this.pwd = pwd;
    }
 
    @Override
    protected Connection create() {
        try {
            return (DriverManager.getConnection(url, usr, pwd));
        } catch (SQLException e) {
            e.printStackTrace();
            return (null);
        }
    }
 
    @Override
    public void expire(Connection o) {
        try {
            ((Connection) o).close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 
    @Override
    public boolean validate(Connection o) {
        try {
            return (!((Connection) o).isClosed());
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
}
