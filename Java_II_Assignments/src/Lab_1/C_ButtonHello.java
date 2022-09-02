package Lab_1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phuya
 */
import java.awt.*;
public class C_ButtonHello {
    C_ButtonHello(){
        Frame f = new Frame("Hello World");
        Button b = new Button("Hello");
        b.setBounds(20,20,100,100);
        f.setSize(140,140);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new C_ButtonHello();
    }
}
