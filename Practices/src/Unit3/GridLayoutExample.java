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

public class GridLayoutExample {
        GridLayoutExample(){
                Frame f = new Frame("Grid Example");
                Button b1 = new Button("Button1");
                Button b2 = new Button("Button2");
                Button b3 = new Button("Button3");
                Button b4 = new Button("Button4");
                
                f.add(b1);
                f.add(b2);
                f.add(b3);
                f.add(b4);
                f.addWindowListener(new WindowAdapter(){
                
                    public void windowClosing(WindowEvent we){
                        System.exit(0);
                    }
                });
                f.setLayout(new GridLayout(2,2));
                f.setSize(400,400);
                f.setVisible(true);
       
        }
        public static void main(String[] args) {
        new GridLayoutExample();
    }
}
