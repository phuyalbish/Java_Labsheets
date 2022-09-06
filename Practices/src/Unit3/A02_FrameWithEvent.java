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
public class A02_FrameWithEvent {
    A02_FrameWithEvent(){
        Frame f = new Frame("Event Handling");
    f.addWindowListener(
           new WindowAdapter(){
        
           public void windowClosing(WindowEvent we){
               System.exit(0);
           }
        
    });
    f.setSize(200,200);
    f.setLayout(null);
    f.setVisible(true);
    }
    
    public static void main(String[] args) {
        new A02_FrameWithEvent();
    }


}
