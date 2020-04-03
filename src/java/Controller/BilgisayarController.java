/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.BilgisayarDAO;
import Entity.Bilgisayar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped

public class BilgisayarController implements Serializable {

    private List<Bilgisayar> blist;
    private BilgisayarDAO bdao;
    private Bilgisayar bilgisayar;

    public String create() { 
        this.getBdao().insert(this.bilgisayar);
        return "index";
    }

    public List<Bilgisayar> getBlist() {
        if (blist == null) {
            this.blist = new ArrayList<>();
        }
        this.blist = this.getBdao().getBilgisayar();
        return this.blist;
    }

    public void setBlist(List<Bilgisayar> blist) {
        this.blist = blist;
    }

    public BilgisayarDAO getBdao() {
        if (bdao == null) {
            this.bdao = new BilgisayarDAO();
        }
        return bdao;
    }

    public void setBdao(BilgisayarDAO bdao) {
        this.bdao = bdao;
    }

    public Bilgisayar getBilgisayar() {
        if (this.bilgisayar == null) {
            this.bilgisayar = new Bilgisayar();
        }
        return bilgisayar;
    }

    public void setBilgisayar(Bilgisayar bilgisayar) {
        this.bilgisayar = bilgisayar;
    }

}
