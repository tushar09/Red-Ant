/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hard_Util;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Tushar
 */
public class DriveLetter {
    ArrayList al = new ArrayList();
    public ArrayList getDriveLetter(){
        File[] roots = File.listRoots();
        for (int i = 0; i < roots.length; i++){   
            if(("" + roots[i]).endsWith(":\\")){
                al.add(("" + roots[i]).replaceAll(":\\\\", ""));
            }    
        }
        return al;
    }
}
