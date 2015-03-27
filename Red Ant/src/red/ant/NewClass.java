/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package red.ant;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Shockwave
 */
public class NewClass {
    public static void main(String [] a) throws InterruptedException{
        Random r = new Random();
        String s = "close red ant";
        String g = "";
        ArrayList al = new ArrayList(), al2 = new ArrayList();
        
        for(int t = 0; t < s.length(); t++){
            al.add(s.charAt(t));
        }
        for(int t = al.size(); t > 0; t--){
            int y = Math.abs(r.nextInt(t));
            g += al.get(y);
            al.remove(y);
            System.out.println(g);
            Thread.sleep(80);
        }
        System.out.println(s);
    }
}
