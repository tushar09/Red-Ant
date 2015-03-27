/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Internal_Execution;

import Extra_Look.Main;
import Weather.Weather;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Tushar
 */
public class Execution {

    public String weather = "";
    ArrayList driveLetter;
    ArrayList webSite = new ArrayList();
    ArrayList look;
    String siteList = "ymail | hotmail | Piazza | gmail | soundcloud | myspace | dudu | freelancer | odesk | gogoal | facebook | youtube | wikipidia | twitter | live | amazon | linkedin | yahoo | wordpress | bing | pinterest | ask | msn | microsoft | apple | imdb | stackoverflow | bbc";

    public Execution(ArrayList driveLetter) {
        String web = "y mail|hot mail|Piazza|G mail|Sound cloud|My space|du du|free lancer|o desk|go goal|face book|you tube|we key pee de|tweet are|live|amazon|linked in|e a who|word press|bing|pee interest|ask|m s n|micro soft|apple|im d b|stack over flow|b b c";
        String webAr[] = web.split("|");
        for (int t = 0; t < webAr.length; t++) {
            String insert = webAr[t];
            if (insert.contains(" ")) {
                insert = insert.replaceAll(" ", "");
            }
            webSite.add(this);
        }
        this.driveLetter = driveLetter;
    }

    public ArrayList preExecute(String userVoice) {
        Main m = new Main();
        m.caller(userVoice);
        return m.fal;
    }

    public void execute(String userVoice) throws IOException {
        weather = "";
        if (userVoice.contains("report") || userVoice.contains("weather") || userVoice.contains("outside")) {
            Weather w = new Weather();
            weather = w.getWeatherReport();
        }else if ((userVoice.contains("open") || userVoice.contains("execute")) && userVoice.contains("color setting")) {
            Process p;
            p = Runtime.getRuntime().exec("cmd /c start control color");
        }else if ((userVoice.contains("open") || userVoice.contains("execute")) && userVoice.contains("microsoft excel")) {
            Process p;
            p = Runtime.getRuntime().exec("cmd /c start excel");
        } else if ((userVoice.contains("open") || userVoice.contains("execute")) && userVoice.contains("paint")) {
            Process p;
            p = Runtime.getRuntime().exec("cmd /c start mspaint");
        } else if ((userVoice.contains("open") || userVoice.contains("execute")) && userVoice.contains("music player")) {
            Process p;
            p = Runtime.getRuntime().exec("cmd /c start mplayer");
        } else if ((userVoice.contains("open") || userVoice.contains("execute")) && userVoice.contains("note pad")) {
            Process p;
            p = Runtime.getRuntime().exec("cmd /c start notepad");
        } else if ((userVoice.contains("open") || userVoice.contains("execute")) && userVoice.contains("my computer")) {
            Process p;
            p = Runtime.getRuntime().exec("cmd /c start explorer");
        } else if ((userVoice.contains("open") || userVoice.contains("execute")) && userVoice.contains("command prompt")) {
            Process p;
            p = Runtime.getRuntime().exec("cmd /c start cmd");
        } else if ((userVoice.contains("open") || userVoice.contains("execute")) && userVoice.contains("microsoft word")) {
            Process p;
            p = Runtime.getRuntime().exec("cmd /c start winword");
        } else if ((userVoice.contains("open") || userVoice.contains("execute")) && userVoice.contains("email")) {
            Process p;
            p = Runtime.getRuntime().exec("cmd /c start outlook");
        } else if ((userVoice.contains("open") || userVoice.contains("execute")) && userVoice.contains("control panel")) {
            Process p;
            p = Runtime.getRuntime().exec("cmd /c start control panel");
        } else if ((userVoice.contains("open") || userVoice.contains("execute")) && userVoice.contains("word pad")) {
            Process p;
            p = Runtime.getRuntime().exec("cmd /c start wordpad");
        } else if ((userVoice.contains("open") || userVoice.contains("execute")) && userVoice.contains("paint")) {
            Process p;
            p = Runtime.getRuntime().exec("cmd /c start mspaint");
        } else if ((userVoice.contains("open") || userVoice.contains("execute")) && userVoice.contains("calculator")) {
            Process p;
            p = Runtime.getRuntime().exec("cmd /c start calc");
        } else if ((userVoice.contains("open") && userVoice.contains("drive"))) {
            Process p;
            p = Runtime.getRuntime().exec("cmd /c start explorer " + userVoice.substring(userVoice.lastIndexOf(" ") + 1) + ":\\");
        } else if (userVoice.contains("drive")) {
            Process p;
            p = Runtime.getRuntime().exec("cmd /c start explorer " + userVoice.substring(userVoice.lastIndexOf(" ") + 1) + ":\\");
        } else if (userVoice.contains("drive")) {
            Process p;
            p = Runtime.getRuntime().exec("cmd /c start explorer " + userVoice.substring(userVoice.lastIndexOf(" ") + 1) + ":\\");
        } else if (userVoice.contains("my computer") || userVoice.contains("explorer")) {
            Process p;
            p = Runtime.getRuntime().exec("cmd /c start explorer ");
        } else if (userVoice.contains("dot") || userVoice.contains("go to") || userVoice.contains("visit")) {
            String uv = userVoice;
            uv = uv.replaceAll("dot", ".");
            String userVoice2 = "";
            String uvar[] = uv.split(" ");
            for (int t = 0; t < uvar.length; t++) {
                if (!uvar[t].equals("go") && !uvar[t].equals("to") && !uvar[t].equals("visit") && !uvar[t].equals("open")) {
                    userVoice2 += uvar[t];
                }
            }
            Process p;
            p = Runtime.getRuntime().exec("cmd /c start chrome " + userVoice2);
            System.out.println(userVoice2);
        }//else if(){

        //}
//                        } else if (resultText.equals("close red ant") || resultText.equals("terminate red ant") || resultText.equals("distroy red ant") || resultText.equals("vanish red ant") || resultText.equals("die red ant") || resultText.equals("go away red ant")) {
////                            ExtraLook el = new ExtraLook(resultText);
////                            for(int t = el.al.size(); t > 0; t--){
////                                jLabel1.setText(jLabel1.getText() + el.al.get(t));
////                            }
//                            System.out.println("You said: " + resultText + '\n');
//                            Random r = new Random();
//                            String s = resultText;
//                            String g = "";
//                            ArrayList al = new ArrayList(), al2 = new ArrayList();
//                            for (int t = 0; t < s.length(); t++) {
//                                al.add(s.charAt(t));
//                            }
//                            for (int t = al.size(); t > 0; t--) {
//                                int y = Math.abs(r.nextInt(t));
//                                g += al.get(y);
//                                al.remove(y);
//                                jLabel1.setText(g);
//                                try {
//                                    Thread.sleep(100);
//                                } catch (InterruptedException ex) {
//                                    Logger.getLogger(RedAntUI.class.getName()).log(Level.SEVERE, null, ex);
//                                }
//                            }
//                            jLabel1.setText("Exiting");
//                            for (int t = 0; t < 3; t++) {
//
//                                jLabel1.setText(jLabel1.getText() + ". ");
//                                try {
//                                    Thread.sleep(500);
//                                } catch (InterruptedException ex) {
//                                    Logger.getLogger(RedAntUI.class.getName()).log(Level.SEVERE, null, ex);
//                                }
//                            }
//                            //System.exit(0);
//                        } else if (resultText.equals("open music player")) {
//                            System.out.println("You said: " + resultText + '\n');
//                            Random r = new Random();
//                            String s = resultText;
//                            String g = "";
//                            ArrayList al = new ArrayList(), al2 = new ArrayList();
//                            for (int t = 0; t < s.length(); t++) {
//                                al.add(s.charAt(t));
//                            }
//                            for (int t = al.size(); t > 0; t--) {
//                                int y = Math.abs(r.nextInt(t));
//                                g += al.get(y);
//                                al.remove(y);
//                                jLabel1.setText(g);
//                                try {
//                                    Thread.sleep(80);
//                                } catch (InterruptedException ex) {
//                                    Logger.getLogger(RedAntUI.class.getName()).log(Level.SEVERE, null, ex);
//                                }
//                            }
//                            jLabel1.setText(resultText);
//                            try {
//                                Process p;
//                                p = Runtime.getRuntime().exec("cmd /c start wmplayer");
//                            } catch (IOException ex) {
//                                System.out.println(ex);
//                            }
//                        } else if (resultText.equals("open calculator")) {
//                            m.caller(resultText);
//                            int t = m.fal.size();
//                            float d = (float) (1000 / (float) m.fal.size());
//                            System.out.println((long) d);
//                            for (int v = t - 1; v >= 0; v--) {
//                                jLabel1.setText("" + m.fal.get(v));
//                                try {
//                                    //jLabel1.setText("" + m.fal.get(v));
//                                    Thread.sleep((long) d);
//                                } catch (InterruptedException ex) {
//                                    Logger.getLogger(RedAntUI.class.getName()).log(Level.SEVERE, null, ex);
//                                }
//                            }
//                            System.out.println("You said: " + resultText + '\n');
//                            jLabel1.setText(resultText);
//
//                            try {
//                                Process p;
//                                p = Runtime.getRuntime().exec("cmd /c start calc");
//                            } catch (IOException ex) {
//                                System.out.println(ex);
//                            }
//
//                        } else if (resultText.equals("open win amp") || resultText.equals("execute win amp")) {
//                            m.caller(resultText);
//                            int t = m.fal.size();
//                            float d = (float) (1000 / (float) m.fal.size());
//                            System.out.println((long) d);
//                            for (int v = t - 1; v >= 0; v--) {
//                                jLabel1.setText("" + m.fal.get(v));
//                                try {
//                                    //jLabel1.setText("" + m.fal.get(v));
//                                    Thread.sleep((long) d);
//                                } catch (InterruptedException ex) {
//                                    Logger.getLogger(RedAntUI.class.getName()).log(Level.SEVERE, null, ex);
//                                }
//                            }
//                            try {
//                                Process p;
//                                p = Runtime.getRuntime().exec("cmd /c start winamp");
//                            } catch (IOException ex) {
//                                System.out.println(ex);
//                            }
//                            System.out.println(resultText);
//                        } else if (resultText.equals("open go goal") || resultText.equals("execute go goal")) {
//                            m.caller(resultText);
//                            int t = m.fal.size();
//                            float d = (float) (1000 / (float) m.fal.size());
//                            System.out.println((long) d);
//                            for (int v = t - 1; v >= 0; v--) {
//                                jLabel1.setText("" + m.fal.get(v));
//                                try {
//                                    //jLabel1.setText("" + m.fal.get(v));
//                                    Thread.sleep((long) d);
//                                } catch (InterruptedException ex) {
//                                    Logger.getLogger(RedAntUI.class.getName()).log(Level.SEVERE, null, ex);
//                                }
//                            }
//                            try {
//                                Process p;
//                                p = Runtime.getRuntime().exec("cmd /c start chrome");
//                            } catch (IOException ex) {
//                                System.out.println(ex);
//                            }
//                            System.out.println(resultText);
//                        } else if (resultText.equals("open command prompt") || resultText.equals("execute command prompt")) {
//                            m.caller(resultText);
//                            int t = m.fal.size();
//                            float d = (float) (1000 / (float) m.fal.size());
//                            System.out.println((long) d);
//                            for (int v = t - 1; v >= 0; v--) {
//                                jLabel1.setText("" + m.fal.get(v));
//                                try {
//                                    //jLabel1.setText("" + m.fal.get(v));
//                                    Thread.sleep((long) d);
//                                } catch (InterruptedException ex) {
//                                    Logger.getLogger(RedAntUI.class.getName()).log(Level.SEVERE, null, ex);
//                                }
//                            }
//                            try {
//                                Process p;
//                                p = Runtime.getRuntime().exec("cmd /c start cmd");
//                            } catch (IOException ex) {
//                                System.out.println(ex);
//                            }
//                            System.out.println(resultText);
//                        } else if (resultText.startsWith("open drive ")) {
//                            String g = resultText;
//                            String h = "";
//                            for (int t = g.length() - 1; t > 0; t--) {
//                                if (g.charAt(t) == ' ') {
//                                    //c++;
//                                    System.out.println(h);
//                                    //h = "";
//                                    break;
//                                } else {
//                                    h += "" + g.charAt(t);
//                                }
//                            }
//                            m.caller(resultText);
//                            int t = m.fal.size();
//                            float d = (float) (1000 / (float) m.fal.size());
//                            System.out.println((long) d);
//                            for (int v = t - 1; v >= 0; v--) {
//                                jLabel1.setText("" + m.fal.get(v));
//                                try {
//                                    //jLabel1.setText("" + m.fal.get(v));
//                                    Thread.sleep((long) d);
//                                } catch (InterruptedException ex) {
//                                    Logger.getLogger(RedAntUI.class.getName()).log(Level.SEVERE, null, ex);
//                                }
//                            }
//                            try {
//                                Process p;
//                                p = Runtime.getRuntime().exec("cmd /c start explorer " + h + ":\\");
//                            } catch (IOException ex) {
//                                System.out.println(ex);
//                            }
//                            System.out.println("cmd /c start explorer " + h + ":\\");
//                        } else {
//                            m.caller(resultText);
//                            int t = m.fal.size();
//                            float d = (float) (1000 / (float) m.fal.size());
//                            System.out.println((long) d);
//                            for (int v = t - 1; v >= 0; v--) {
//                                jLabel1.setText("" + m.fal.get(v));
//                                try {
//                                    //jLabel1.setText("" + m.fal.get(v));
//                                    Thread.sleep((long) d);
//                                } catch (InterruptedException ex) {
//                                    Logger.getLogger(RedAntUI.class.getName()).log(Level.SEVERE, null, ex);
//                                }
//                            }
//                            System.out.println(resultText);
        //jLabel1.setText(resultText);
    }
}
