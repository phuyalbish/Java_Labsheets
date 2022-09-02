/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit3;

/**
 *
 * @author phuya
 */
import java.awt.*;
import java.awt.event.*;
public class C01_Panels extends Frame{
    
    C01_Panels(){
            Panel p = new Panel();
            p.setBounds(30,100,80,30);
            setSize(400,400);
            add(p);
            
            addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent we){
                    System.exit(0);
                }
            });
            setLayout(null);
            setVisible(true);
    }
    public static void main(String[] args) {
        new C01_Panels();
    }
    
}
