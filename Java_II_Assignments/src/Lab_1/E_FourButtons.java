/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_1;

import java.awt.Button;
import java.awt.Frame;

/**
 *
 * @author phuya
 */
public class E_FourButtons {
    public E_FourButtons(){
        Frame f = new Frame("Hello World");
        Button b1 = new Button("One");
        b1.setBounds(20,40,100,100);
        
        Button b2 = new Button("Two");
        b2.setBounds(140,40,100,100);
        
        Button b3 = new Button("Three");
        b3.setBounds(20,160,100,100);
        
        Button b4 = new Button("Four");
        b4.setBounds(140,160,100,100);
        
        f.setSize(380,380);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new E_FourButtons();
    }
}
