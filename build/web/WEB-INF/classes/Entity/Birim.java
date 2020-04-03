
package Entity;

import Dao.BirimDAO;


public class Birim {
    private int id;
    private String birim_adi;
    private String birim_kodu;

    public Birim() {
    }

    public Birim(int id, String birim_adi, String birim_kodu) {
        this.id = id;
        this.birim_adi = birim_adi;
        this.birim_kodu = birim_kodu;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBirim_adi() {
        return birim_adi;
    }

    public void setBirim_adi(String birim_adi) {
        this.birim_adi = birim_adi;
    }

    public String getBirim_kodu() {
        return birim_kodu;
    }

    public void setBirim_kodu(String birim_kodu) {
        this.birim_kodu = birim_kodu;
    }

    @Override
    public String toString() {
        return "Birim{" + "id=" + id + ", birim_adi=" + birim_adi + ", birim_kodu=" + birim_kodu + '}';
    }

 
    
}
