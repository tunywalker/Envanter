
package Entity;


public class Bolum {
    private int id;
    private int birim_id;
    private String bolum_adi;

    public Bolum() {
    }

    public Bolum(int id, int birim_id, String bolum_adi) {
        this.id = id;
        this.birim_id = birim_id;
        this.bolum_adi = bolum_adi;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBirim_id() {
        return birim_id;
    }

    public void setBirim_id(int birim_id) {
        this.birim_id = birim_id;
    }

    public String getBolum_adi() {
        return bolum_adi;
    }

    public void setBolum_adi(String bolum_adi) {
        this.bolum_adi = bolum_adi;
    }

    @Override
    public String toString() {
        return "Bolum{" + "id=" + id + ", birim_id=" + birim_id + ", bolum_adi=" + bolum_adi + '}';
    }
    
    
}
