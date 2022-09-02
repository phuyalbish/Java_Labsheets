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
public class B01_Buttons extends Frame{
    public B01_Buttons(){
        Button b = new Button("Button 1");
        b.setBounds(150,150,70,70);
        add(b);
        setSize(400,400);
        
        addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent we){
                    System.exit(0);
                }
        });
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new B01_Buttons();
    }
}
