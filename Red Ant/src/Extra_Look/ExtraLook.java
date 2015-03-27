/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Extra_Look;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import red.ant.RedAntUI;

/**
 *
 * @author Shockwave
 */
public class ExtraLook {
    
    ArrayList al = new ArrayList();
    String s;
    String g = "";
    Random r = new Random();
    RedAntUI rau = new RedAntUI();
    ExtraLook(String v) {
        s = v;
        work();
    }

    public void work() {
        
        for(int t = 0; t < s.length(); t++){
            al.add(s.charAt(t));
        }
        
        for(int t = al.size(); t > 0; t--){
            int y = Math.abs(r.nextInt(t));
            g += al.get(y);
            al.remove(y);
            try {
                //rau.setLabel(g);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ExtraLook.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
