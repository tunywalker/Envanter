package Controller;

import Dao.MonitorKayitDAO;
import Entity.MonitorKayit;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List; 
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped

public class MonitorKayitController implements Serializable {

    private List<MonitorKayit> mklist;
    private MonitorKayitDAO mkdao;
    private MonitorKayit mk;

    public List<MonitorKayit> getMklist() {
        
        if (mklist == null) {
            this.mklist = new ArrayList<>();
        }
        this.mklist = this.getMkdao().getMonitorKayit();
        return this.mklist;
        
    }

    public void setMklist(List<MonitorKayit> mklist) {
        this.mklist = mklist;
    }

    public MonitorKayitDAO getMkdao() {
         if (mkdao == null) {
            this.mkdao = new MonitorKayitDAO();
        }
        
        return mkdao;
    }

    public void setMkdao(MonitorKayitDAO mkdao) {
        this.mkdao = mkdao;
    }
    

   

}
