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
//what the heck
import java.awt.*;
import java.awt.event.*;
public class A03_FrameWithInheritence extends Frame{
        A03_FrameWithInheritence(){
            setSize(400,400);
            addWindowListener(
                    new WindowAdapter(){
                        public void windowClosing(WindowEvent we){
                            System.exit(0);
                        }
            });
            setLayout(null);
            setVisible(true);
        }
       public static void main(String[] args){
            new A03_FrameWithInheritence();
       }
}
