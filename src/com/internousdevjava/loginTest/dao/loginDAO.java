package com.internousdevjava.loginTest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdevjava.loginTest.util.DBConnector;

/**
 * データベースから値のやりとりをするクラス
 * @author yurina sato
 * @version 1.0
 * @since1.0
 *
 */



public class loginDAO {
    private boolean res;
    private Connection con;
    private String sql;
    private PreparedStatement ps;
    private ResultSet rs;

    public boolean select(String id, String password){
        res = false;


        /**
         * 入力した値がデータベースにあれば値を返します。
         * @return res 値を返します。
         */
        try{
            con = (Connection)DBConnector.getConnection();
            sql = "SELECT * FROM login_table WHERE";
            sql+= " id = ? AND password = ? ";

            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, password);

            rs = ps.executeQuery();

            if(rs.next()){
                res = true;
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return res;
    }
}