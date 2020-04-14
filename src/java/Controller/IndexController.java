package Controller;
import Util.findInfo;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


/**
 *
 * @author Bambi
 */

@Named
@SessionScoped
public class IndexController implements Serializable{
    public String getIpAdress() {
        if (this.ipAdress==null) {
            this.ipAdress=findInfo.getRemoteAddress();
            
        }
        return ipAdress;
    }

    
    private  String ipAdress,macAdress;

    public String getMacAdress() {
        if(this.macAdress==null){
           this.macAdress=findInfo.getMACAddress(this.ipAdress).toUpperCase();
            if (true) {
                
            }
        }
        return macAdress;
    }

    
}
