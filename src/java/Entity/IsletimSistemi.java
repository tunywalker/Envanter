package Entity;

public class IsletimSistemi {

    private int id;
    private String isletim_sistemi_adi;

    public IsletimSistemi() {
    }

    public IsletimSistemi(int id, String isletim_sistemi_adi) {
        this.id = id;
        this.isletim_sistemi_adi = isletim_sistemi_adi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsletim_sistemi_adi() {
        return isletim_sistemi_adi;
    }

    public void setIsletim_sistemi_adi(String isletim_sistemi_adi) {
        this.isletim_sistemi_adi = isletim_sistemi_adi;
    }

    @Override
    public String toString() {
        return "IsletimSistemi{" + "id=" + id + ", isletim_sistemi_adi=" + isletim_sistemi_adi + '}';
    }

}
