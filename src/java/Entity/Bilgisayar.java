package Entity;

import java.sql.Date;

public class Bilgisayar {

    private int id;    
    private int ekleyenkullanici_id;
    private int bilgisayar_turu_id;
    private String adsoyad;
    private int birim_id;
    private int bolum_id;
    private int marka_id;
    private int model_id;
    private String serino;
    private String mac_adresi;
    private String cpu;
    private String harddisk;
    private String ram;
    private String ekrankarti;
    private String aciklama;
    private Date kayittarihi;

    public Bilgisayar() {
    }
    
    
    
    public Bilgisayar(int id, int ekleyenkullanici_id, int bilgisayar_turu_id, String adsoyad, int birim_id, int bolum_id, int marka_id, int model_id, String serino, String mac_adresi, String cpu, String harddisk, String ram, String ekrankarti, String aciklama, Date kayittarihi) {
        this.id = id;
        
        this.ekleyenkullanici_id = ekleyenkullanici_id;
        this.bilgisayar_turu_id = bilgisayar_turu_id;
        this.adsoyad = adsoyad;
        this.birim_id = birim_id;
        this.bolum_id = bolum_id;
        this.marka_id = marka_id;
        this.model_id = model_id;
        this.serino = serino;
        this.mac_adresi = mac_adresi;
        this.cpu = cpu;
        this.harddisk = harddisk;
        this.ram = ram;
        this.ekrankarti = ekrankarti;
        this.aciklama = aciklama;
        this.kayittarihi = kayittarihi;

    }



  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEkleyenkullanici_id() {
        return ekleyenkullanici_id;
    }

    public void setEkleyenkullanici_id(int ekleyenkullanici_id) {
        this.ekleyenkullanici_id = ekleyenkullanici_id;
    }

    public int getBilgisayar_turu_id() {
        return bilgisayar_turu_id;
    }

    public void setBilgisayar_turu_id(int bilgisayar_turu_id) {
        this.bilgisayar_turu_id = bilgisayar_turu_id;
    }

    public String getAdsoyad() {
        return adsoyad;
    }

    public void setAdsoyad(String adsoyad) {
        this.adsoyad = adsoyad;
    }

    public int getBirim_id() {
        return birim_id;
    }

    public void setBirim_id(int birim_id) {
        this.birim_id = birim_id;
    }

    public int getBolum_id() {
        return bolum_id;
    }

    public void setBolum_id(int bolum_id) {
        this.bolum_id = bolum_id;
    }

    public int getMarka_id() {
        return marka_id;
    }

    public void setMarka_id(int marka_id) {
        this.marka_id = marka_id;
    }

    public int getModel_id() {
        return model_id;
    }

    public void setModel_id(int model_id) {
        this.model_id = model_id;
    }

    public String getSerino() {
        return serino;
    }

    public void setSerino(String serino) {
        this.serino = serino;
    }

    public String getMac_adresi() {
        return mac_adresi;
    }

    public void setMac_adresi(String mac_adresi) {
        this.mac_adresi = mac_adresi;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getHarddisk() {
        return harddisk;
    }

    public void setHarddisk(String harddisk) {
        this.harddisk = harddisk;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getEkrankarti() {
        return ekrankarti;
    }

    public void setEkrankarti(String ekrankarti) {
        this.ekrankarti = ekrankarti;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public Date getKayittarihi() {
        return kayittarihi;
    }

    public void setKayittarihi(Date kayittarihi) {
        this.kayittarihi = kayittarihi;
    }

    @Override
    public String toString() {
        return "Bilgisayar{" + "id=" + id + ", ekleyenkullanici_id=" + ekleyenkullanici_id + ", bilgisayar_turu_id=" + bilgisayar_turu_id + ", adsoyad=" + adsoyad + ", birim_id=" + birim_id + ", bolum_id=" + bolum_id + ", marka_id=" + marka_id + ", model_id=" + model_id + ", serino=" + serino + ", mac_adresi=" + mac_adresi + ", cpu=" + cpu + ", harddisk=" + harddisk + ", ram=" + ram + ", ekrankarti=" + ekrankarti + ", aciklama=" + aciklama + ", kayittarihi=" + kayittarihi + '}';
    }

}
