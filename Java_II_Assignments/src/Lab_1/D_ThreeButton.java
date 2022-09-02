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
public class D_ThreeButton {
    D_ThreeButton(){
        Frame f = new Frame("Hello World");
        Button b1 = new Button("Apple");
        b1.setBounds(20,40,100,100);
        
        Button b2 = new Button("Orange");
        b2.setBounds(140,40,100,100);
        
        Button b3 = new Button("Guava");
        b3.setBounds(260,40,100,100);
        f.setSize(380,140);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new D_ThreeButton();
    }
}
