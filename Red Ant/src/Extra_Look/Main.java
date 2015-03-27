/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra_Look;

import java.util.ArrayList;
import red.ant.FinalTask;

/**
 *
 * @author Tushar
 */
public class Main {
    String out = "";
    FinalTask wd = new FinalTask();
    public ArrayList fal = new ArrayList();
    public void caller(String s) {
        fal.clear();
        ArrayList at = new ArrayList();
        ArrayList at2 = new ArrayList();
        
        String h = s;
        
        for (int c = 0; c < h.length(); c++) {
            at.add(h.charAt(c));
        }
        for (int c = h.length() - 1; c >= 0; c--) {
            at2.add(h.charAt(c));
        }
        for (int c = 0; c < at.size(); c++) {
            String t = "" + at.get(c);
            String f = "";
            for(int m = 0; m < at.size(); m++){
                if(c != m){
                    f += at.get(m);
                }
            }
            wd.Engine(f, t, fal);
        }
        
        for (int c = 0; c < at2.size(); c++) {
            String t = "" + at2.get(c);
            String f = "";
            for(int m = 0; m < at2.size(); m++){
                if(c != m){
                    f += at2.get(m);
                }
            }
            wd.Engine(f, t, fal);
        }
        
    }
}
