
package Entity;


public class BilgisayarTuru {
    private int id;
    private String bilgisayar_turu_adi;

    public BilgisayarTuru() {
    }

    public BilgisayarTuru(int id, String bilgisayar_turu_adi) {
        this.id = id;
        this.bilgisayar_turu_adi = bilgisayar_turu_adi;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBilgisayar_turu_adi() {
        return bilgisayar_turu_adi;
    }

    public void setBilgisayar_turu_adi(String bilgisayar_turu_adi) {
        this.bilgisayar_turu_adi = bilgisayar_turu_adi;
    }

    @Override
    public String toString() {
        return "BilgisayarTuru{" + "id=" + id + ", bilgisayar_turu_adi=" + bilgisayar_turu_adi + '}';
    }
    
    
    
    
}
