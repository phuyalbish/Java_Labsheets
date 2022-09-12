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


//WAP to make window using Frame of size (600,400) with title “My First GUI  Program” and make visible to user. 
import java.awt.*;

public class A_Frame {
    public void frameExample(){
        Frame f = new Frame();
        f.setSize(600,400);
        f.setTitle("My First GUI Program");
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        A_Frame fr = new A_Frame();
        fr.frameExample();
    }
}
