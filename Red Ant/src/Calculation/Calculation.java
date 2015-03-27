/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculation;

import java.util.ArrayList;

/**
 *
 * @author Tushar
 */
public class Calculation {
    
    public String res;
    public String labelShow = "";
    static ArrayList al = new ArrayList();
    String s = "ninety nine thousand nine hundred ninety nine";
    ArrayList result = new ArrayList();

    public Calculation(String s) {
        String label = "";
        this.s = s;
        for (int i = 0; i < 100; i++) {
            al.add(0);
        }
        al.add(0, "zero");
        al.add(1, "one");
        al.add(2, "two");
        al.add(3, "three");
        al.add(4, "four");
        al.add(5, "five");
        al.add(6, "six");
        al.add(7, "seven");
        al.add(8, "eight");
        al.add(9, "nine");
        al.add(10, "ten");
        al.add(11, "eleven");
        al.add(12, "twelve");
        al.add(13, "thirteen");
        al.add(14, "fourteen");
        al.add(15, "fifteen");
        al.add(16, "sixteen");
        al.add(17, "seventeen");
        al.add(18, "eighteen");
        al.add(19, "nineteen");
        al.add(20, "twenty");
        al.add(30, "thirty");
        al.add(40, "forty");
        al.add(50, "fifty");
        al.add(60, "sixty");
        al.add(70, "seventy");
        al.add(80, "eighty");
        al.add(90, "ninety");    
        
        calc(this.s);
        for (Object p : result) {
            label += "" + p;
        }
        Engine e = new Engine();
        res = e.calculate(label);
        labelShow = label;
    }

    public void calc(String s) {
        String[] words = s.split(" ");
        for (int t = 0; t < words.length; t++) {
            String word = words[t];
            if (al.contains(word)) {
                if(al.indexOf(word) > 19){
                    if(t == words.length - 1){
                        result.add(al.indexOf(word));
                    }else{
                        if(words[t + 1].equals("plus") || words[t + 1].equals("divide") || words[t + 1].equals("into") || words[t + 1].equals("minus")){
                            result.add(al.indexOf(word));
                        }else{
                            result.add(al.indexOf(word) / 10);
                        }
                    }                   
                }else{
                    result.add(al.indexOf(word));
                }
                
            } else if (word.equals("plus")) {
                result.add("+");
            } else if (word.equals("minus")) {
                result.add("-");
            } else if (word.equals("divide")) {
                result.add("/");
            } else if (word.equals("into")) {
                result.add("*");
            }else if (word.equals("hundred")) {
                if((t + 1 < words.length) && (!"plus".equals(words[t + 1]) && words[t + 1] != "divide" && words[t + 1] != "into" && words[t + 1] != "minus")){
                    if(al.indexOf(words[t + 1]) < 10){
                        String gjgkh = words[t + 1];
                        result.add("0");
                    }else{
                        //result.add("00");
                    }
                }else{
                    result.add("00");
                }
            }else if (word.equals("thousand")) {
                 if((t + 2 < words.length) && (!"plus".equals(words[t + 1]) && words[t + 1] != "divide" && words[t + 1] != "into" && words[t + 1] != "minus")){
                    if((al.indexOf(words[t + 1]) < 10)){
                        String adf = words[t + 1];
                        if((!words[t + 2].equals("hundred"))){
                            result.add("00");
                        }       
                    }else{
                        result.add("0");
                    }
                }else{
                    result.add("000");
                }       
            }                    
        }
    }
}
