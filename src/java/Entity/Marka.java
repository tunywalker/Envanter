package Entity;

public class Marka {

    private int id;
    private String marka_adi;

    public Marka() {
    }

    public Marka(int id, String marka_adi) {
        this.id = id;
        this.marka_adi = marka_adi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarka_adi() {
        return marka_adi;
    }

    public void setMarka_adi(String marka_adi) {
        this.marka_adi = marka_adi;
    }

    @Override
    public String toString() {
        return "Marka{" + "id=" + id + ", marka_adi=" + marka_adi + '}';
    }

}
