package Entity;

import java.sql.Date;

public class MonitorKayit {

    private int id;    
    private int kod;
    private int ekleyenkullanici_id;
    private String adsoyad;
    private int birim_id;
    private int bolum_id;
    private int marka_id;
    private int model_id;
    private String serino;
    private String aciklama;
    
    private Date kayittarihi;

    public MonitorKayit() {
    }

    public MonitorKayit(int id, int kod, int ekleyenkullanici_id, String adsoyad, int birim_id, int bolum_id, int marka_id, int model_id, String serino, String aciklama, Date kayittarihi) {
        this.id = id;
        this.kod = kod;
        this.ekleyenkullanici_id = ekleyenkullanici_id;
        this.adsoyad = adsoyad;
        this.birim_id = birim_id;
        this.bolum_id = bolum_id;
        this.marka_id = marka_id;
        this.model_id = model_id;
        this.serino = serino;
        this.aciklama = aciklama;
        this.kayittarihi = kayittarihi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public int getEkleyenkullanici_id() {
        return ekleyenkullanici_id;
    }

    public void setEkleyenkullanici_id(int ekleyenkullanici_id) {
        this.ekleyenkullanici_id = ekleyenkullanici_id;
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
        return "MonitorKayit{" + "id=" + id + ", kod=" + kod + ", ekleyenkullanici_id=" + ekleyenkullanici_id + ", adsoyad=" + adsoyad + ", birim_id=" + birim_id + ", bolum_id=" + bolum_id + ", marka_id=" + marka_id + ", model_id=" + model_id + ", serino=" + serino + ", aciklama=" + aciklama + ", kayittarihi=" + kayittarihi + '}';
    }
    
    
    
    



  

  

   
    

}
