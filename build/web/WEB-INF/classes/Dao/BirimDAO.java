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

    public List<Birim> getBirim() {
        List<Birim> clist = new ArrayList<>();

        DBConnection db = new DBConnection();
        Connection c = db.connect();
        try {

            Statement st = c.createStatement();
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
        DBConnection db = new DBConnection();
        Connection c = db.connect();
        try {
            Statement st = c.createStatement();
            st.executeUpdate("insert into birim (birim_adi,birim_kodu) values ('" + birim.getBirim_adi() + "','" + birim.getBirim_kodu() + "')");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void sil(Birim brm) {
        DBConnection db = new DBConnection();
        Connection c = db.connect();
        try {
            Statement st = c.createStatement();
            st.executeUpdate("DELETE FROM birim WHERE id="+brm.getId());

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
