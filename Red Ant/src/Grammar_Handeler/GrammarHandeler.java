/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grammar_Handeler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tushar
 */
public class GrammarHandeler {

    public static void main(String[] a) throws FileNotFoundException {
        String line = null;
        BufferedReader reader = new BufferedReader(new FileReader("src/red/ant/hello.gram"));
        try {
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            Logger.getLogger(GrammarHandeler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    GrammarHandeler() throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("src/hello.gram"));
    }
}
