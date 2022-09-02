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

public class B02_FourButtons extends Frame {
    B02_FourButtons(){
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        Button b4 = new Button("Button 4");
        b1.setBounds(20,20,170,170);
        b2.setBounds(210,20,170,170);
        b3.setBounds(20,210,170,170);
        b4.setBounds(210,210,170,170);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        setSize(420,420);
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new B02_FourButtons();
    }
}
