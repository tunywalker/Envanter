package Dao;

import Entity.Birim;
import Util.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BirimDAO {

    DBConnection dbconnector;
    Connection connection;

    public List<Birim> getBirim() {
        List<Birim> clist = new ArrayList<>();

     
        try {

            Statement st = this.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM birim");
            while (rs.next()) {

                Birim temp = new Birim(rs.getInt("id"), rs.getString("birim_adi"), rs.getString("birim_kodu"));

                clist.add(temp);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return clist;

    }

    public void insert(Birim birim) {
     
        try {
            Statement st = this.getConnection().createStatement();
            st.executeUpdate("insert into birim (birim_adi,birim_kodu) values ('" + birim.getBirim_adi() + "','" + birim.getBirim_kodu() + "')");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void sil(Birim brm) {
        
        try {
            Statement st = this.getConnection().createStatement();
            st.executeUpdate("DELETE FROM birim WHERE id=" + brm.getId());

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void update(Birim birim) {
      
        try {
            Statement st = this.getConnection().createStatement();
            st.executeUpdate("UPDATE birim SET birim_adi='" + birim.getBirim_adi() + "', birim_kodu='" + birim.getBirim_kodu() + "' WHERE id=" + birim.getId());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public DBConnection getDbconnector() {
        if (this.dbconnector == null) {
            this.dbconnector = new DBConnection();
        }
        return dbconnector;
    }

    public Connection getConnection() {
        if (this.connection == null) {
            this.connection = this.getDbconnector().connect();
        }
        return connection;
    }

}
