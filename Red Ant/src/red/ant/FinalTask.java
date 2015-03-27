/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package red.ant;

import java.util.ArrayList;

/**
 *
 * @author Tushar
 */
public class FinalTask {
  
    public void Engine(String h, String t, ArrayList alv) {
            ArrayList al2 = new ArrayList();
            ArrayList fal = new ArrayList();
            
            for (int c = 0; c < h.length(); c++) {
                al2.add(h.charAt(c));
            }

            for (int c = 0; c <= h.length(); c++) {
                al2.add(c, t);
                String f = "";
                for (int x = 0; x < al2.size(); x++) {
                    f += al2.get(x);
                }
                fal.add(f);
                if(!alv.contains(f)){
                    alv.add(f);
                }
                
                al2.remove(c);
            }
    }
}
