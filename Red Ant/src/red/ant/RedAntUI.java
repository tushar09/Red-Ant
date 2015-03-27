/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools  Templates
 * and open the template in the editor.
 */
package red.ant;

import Calculation.Calculation;
import Extra_Look.Shuffle;
import Hard_Util.DriveLetter;
import Internal_Execution.Execution;
import edu.cmu.sphinx.frontend.util.Microphone;
import edu.cmu.sphinx.recognizer.Recognizer;
import edu.cmu.sphinx.result.Result;
import edu.cmu.sphinx.util.props.ConfigurationManager;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author Shockwave
 */
public class RedAntUI extends javax.swing.JFrame {   
    static String number = "and zero one two three four five six seven eight nine ten eleven twelve thirteen fourteen fifteen sixteen seventeen eighteen nineteen twenty thirty forty fifty sixty seventy eighty ninety hundred plus minus divide into hundred thousand million billion trillion";
    int xM;
    int yM;
    DriveLetter dl = new DriveLetter();
    ArrayList al = new ArrayList();
    static Execution exe;
    static Runnable r;
    static Runnable mouse;
    static Thread t;
    /**
     * Creates new form RedAntUI
     */
    public RedAntUI() {
        setUndecorated(true);
        al = dl.getDriveLetter();
        exe = new Execution(al);
        UIManager.put("InternalFrame.activeTitleBackground", new ColorUIResource(Color.black ));
        initComponents();
        jLabel11.setVisible(false);
        jProgressBar1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Red Ant");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(802, 602));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 51, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel11.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 470, 310));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red/ant/Corner Logo3.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red/ant/label9.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 803, 2));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red/ant/label7.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 10, 600));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red/ant/label7.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 470, 27));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red/ant/download.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 300, 70));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red/ant/Min.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 40, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red/ant/Cross.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 40, 20));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red/ant/TitleBar.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 20));
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, 5));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red/ant/background.jpg"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(640, 80));
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();       
        setLocation(x - xM, y - yM);        
    }//GEN-LAST:event_jLabel2MouseDragged

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        xM = evt.getX();
        yM = evt.getY();
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red/ant/Cross_Hover.png")));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red/ant/Cross.png")));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red/ant/Min_Hover.png")));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red/ant/Min.png")));
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_jLabel6MouseClicked

    /**
     * @param s
     * @param args the command line arguments
     */
    public static void setLabel(String s) {
        jLabel1.setText(s);
    }
  
    
    public static void reconize() {
        r = new Runnable() {
            public void run() {
                ConfigurationManager cm;
                cm = new ConfigurationManager(RedAnt.class.getResource("helloworld.config.xml"));
                Recognizer recognizer = (Recognizer) cm.lookup("recognizer");
                recognizer.allocate();
                Microphone microphone = (Microphone) cm.lookup("microphone");      
                if (!microphone.startRecording()) {
                    System.out.println("Cannot start microphone.");
                    recognizer.deallocate();
                    System.exit(1);
                }
                System.out.println("Say: (Good morning  Hello) ( Bhiksha  Evandro  Paul  Philip  Rita  Will )");
                AffineTransform affinetransform = new AffineTransform();
                FontRenderContext frc = new FontRenderContext(affinetransform, true, true);
                Font font = new Font("Tahoma", Font.BOLD, 24); 
                while (true) {
                    System.out.println("Start speaking. Press Ctrl-C to quit.\n");
                    Result result = recognizer.recognize();
                    if (result != null) {
                        String resultText = result.getBestFinalResultNoFiller();
                        int textwidth = (int) (font.getStringBounds(resultText, frc).getWidth());
                        jProgressBar1.setPreferredSize(new Dimension(textwidth, jProgressBar1.getHeight()));
                        if ("".equals(resultText)) {
                            System.out.println("Initializing");
                            jLabel1.setText("Initializing");
                        } else {                           
                            jProgressBar1.setVisible(true);
                            //jProgressBar1.setSize(textwidth, jProgressBar1.getHeight());
                            Shuffle sf = new Shuffle();
                            ArrayList setText = sf.main(resultText);
                            float setValue = (float) (100 / (float) setText.size());
                            float chk = 0;
                            int chk2 = 0;
                            jLabel11.setVisible(false);
                            for (int t = 0; t < setText.size(); t++) {
                                try {
                                    chk += setValue;
                                    if (chk2 < chk) {
                                        chk2 = (int) chk + 1;
                                    }
                                    jLabel1.setText((String) setText.get(t));                
                                    jProgressBar1.setValue(chk2);
                                    //jProgressBar1.setSize(textwidth, jProgressBar1.getHeight());
                                    Thread.sleep(200);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(RedAntUI.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            jProgressBar1.setVisible(false);
                            String arr[] = resultText.split(" ", 2);
                            jLabel11.setVisible(true);
                            if(number.contains(arr[0])){  
                                if(resultText.contains(" and ")){
                                    resultText = resultText.replaceAll(" and ", " ");
                                }
                                System.out.println(resultText);
                                Calculation c = new Calculation(resultText);
                                jLabel1.setText(c.labelShow);
                                jLabel11.setText(c.res);
                            }else{
                                try {
                                    jLabel11.setText("");
                                    exe.execute(resultText);
                                    if(!exe.weather.equals("")){
                                        jLabel11.setText(exe.weather);
                                    }
                                } catch (IOException ex) {
                                    Logger.getLogger(RedAntUI.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }

                        }
                    } else {
                        System.out.println("I can't hear what you said.\n");
                    }
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
    }

    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RedAntUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RedAntUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RedAntUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RedAntUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //RedAnt ra = new RedAnt();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new RedAntUI().setVisible(true);
            }
        });
        reconize();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private static javax.swing.JLabel jLabel11;
    private static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private static javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
