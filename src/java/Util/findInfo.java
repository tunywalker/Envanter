/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
 
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Bambi
 */
public class findInfo {
     
//İP adresi bulma
public static String getRemoteAddress() {
   HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
String ipAddress = request.getHeader("X-FORWARDED-FOR");
if (ipAddress == null) {
ipAddress = request.getRemoteAddr();
}
return ipAddress;
}

public static String getMACAddress(String ip){
    // İşletim sistemi bulma
    Pattern macpt = null;
    String OS = System.getProperty("os.name").toLowerCase();

    String[] cmd;
    if (OS.contains("win")) {
        // Windows
        macpt = Pattern
                .compile("[0-9a-f]+-[0-9a-f]+-[0-9a-f]+-[0-9a-f]+-[0-9a-f]+-[0-9a-f]+");
        String[] a = { "arp", "-a", ip };
        cmd = a;
    } else {
        // Mac OS X, Linux
        macpt = Pattern
                .compile("[0-9a-f]+:[0-9a-f]+:[0-9a-f]+:[0-9a-f]+:[0-9a-f]+:[0-9a-f]+");
        String[] a = { "arp", ip };
        cmd = a;
    }

    try {
        // Komut çalıştır
        Process p = Runtime.getRuntime().exec(cmd);
        p.waitFor();
        // BufferedReader çıktısı oku
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                p.getInputStream()));
        String line = reader.readLine();

       
        while (line != null) {
            Matcher m = macpt.matcher(line);

            // Mac adresi bulunursa
            if (m.find()) {
                System.out.println("Found");
                System.out.println("MAC: " + m.group(0));
                return m.group(0);
            }

            line = reader.readLine();
        }

    } catch (IOException | InterruptedException e1) {
    }

    // Mac adresi bulunamadıysa x karakteri döndürür.
    return "x";
}
}
