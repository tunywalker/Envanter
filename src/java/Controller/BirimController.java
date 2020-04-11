package Controller;

import Dao.BirimDAO;
import Entity.Birim;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List; 
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped

public class BirimController implements Serializable {

    private List<Birim> blist;
    private BirimDAO bdao;
    private Birim birim;

    public void silOnayla(Birim brm) {
        this.birim = brm;

    }

    public void sil() {
        this.getBdao().sil(this.birim);
        this.birim = new Birim();

    }

    public void temizleForm() {
        this.birim = new Birim();
    }

    public void guncelleForm(Birim brm) {
        this.birim = brm;
    }

    public void guncelle() {
        this.getBdao().update(this.birim);
        this.birim = new Birim();

    }

    public void create() {
        this.getBdao().insert(this.birim);
        this.birim = new Birim();

    }

    public List<Birim> getBlist() {
        if (blist == null) {
            this.blist = new ArrayList<>();
        }
        this.blist = this.getBdao().getBirim();
        return this.blist;
    }

    public void setBlist(List<Birim> blist) {
        this.blist = blist;
    }

    public BirimDAO getBdao() {
        if (bdao == null) {
            this.bdao = new BirimDAO();
        }
        return bdao;
    }

    public void setBdao(BirimDAO bdao) {
        this.bdao = bdao;
    }

    public Birim getBirim() {
        if (this.birim == null) {
            this.birim = new Birim();
        }
        return birim;
    }

    public void setBirim(Birim birim) {
        this.birim = birim;
    }

}
