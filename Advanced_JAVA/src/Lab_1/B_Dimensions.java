/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_1;

/**
 *
 * @author phuya
 */
import java.awt.*;
public class B_Dimensions {
     B_Dimensions(){
        Frame f = new Frame("Hello World");
        Dimension d = new Dimension(500,200);
        f.setSize(d);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new B_Dimensions();
    }
}
