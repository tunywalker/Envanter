package Dao;

import Entity.MonitorKayit;
import Util.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MonitorKayitDAO {

    DBConnection dbconnector;
    Connection connection;

    public List<MonitorKayit> getMonitorKayit() {
        List<MonitorKayit> clist = new ArrayList<>();

     
        try {

            Statement st = this.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM monitor_kayit");
            while (rs.next()) {

                MonitorKayit temp = new MonitorKayit(rs.getInt("id"), rs.getString("kod"),  rs.getInt("ekleyenkullanici_id"),
                        rs.getString("adsoyad"),rs.getInt("birim_id"),rs.getInt("bolum_id"),
                        rs.getInt("marka_id"),rs.getInt("model_id"), rs.getString("serino"), rs.getString("aciklama"),rs.getDate("kayittarihi"));
                
       

                clist.add(temp);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return clist;

    }
/*
    public void insert(MonitorKayit Monitor) {
     
        try {
            Statement st = this.getConnection().createStatement();
            st.executeUpdate("insert into monitor_kayit (kod,adsoyad,birim,id) values ('" + birim.getBirim_adi() + "','" + birim.getBirim_kodu() + "')");

                     /*
                id int(11) AI PK 
kod varchar(255) 
ekleyenkullanici_id int(11) 
adsoyad varchar(255) 
birim_id int(11) 
bolum_id int(11) 
marka_id int(11) 
model_id int(11) 
serino varchar(255) 
aciklama text 
kayittarihi datetime
                
            
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
    }*/

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
