package Dao;

import Entity.Bilgisayar;
import Util.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BilgisayarDAO {

    public List<Bilgisayar> getBilgisayar() {
        List<Bilgisayar> clist = new ArrayList<>();

        DBConnection db = new DBConnection();
        Connection c = db.connect();
        try {

            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM bilgisayar ");
            while (rs.next()) {

                Bilgisayar temp = new Bilgisayar(rs.getInt("id"), rs.getInt("ekleyenkullanici_id"), rs.getInt("bilgisayar_turu_id"), rs.getString("adsoyad"), rs.getInt("birim_id"), rs.getInt("bolum_id"), rs.getInt("marka_id"), rs.getInt("model_id"), rs.getString("serino"), rs.getString("mac_adresi"), rs.getString("cpu"), rs.getString("harddisk"), rs.getString("ram"), rs.getString("ekrankarti"), rs.getString("aciklama"), rs.getDate("kayittarihi"));

                clist.add(temp);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return clist;

    }

    public void insert(Bilgisayar bilgisayar) {
        DBConnection db = new DBConnection();
        Connection c = db.connect();
        try {
            Statement st = c.createStatement();
            st.executeUpdate("insert into bilgisayar (adsoyad) values ('" + bilgisayar.getAdsoyad() + "')");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
