/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Calculation;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author Shockwave
 */
public class Engine {
    public String ans;
    public String calculate(String s){
        String f = "";
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        try {
            ans = "" + engine.eval(s);
            return ("" + engine.eval(s));
        } catch (ScriptException ex) {
            //Logger.getLogger(Engine.class.getName()).log(Level.SEVERE, null, ex);
            return "bad input";
        }
    }
}
