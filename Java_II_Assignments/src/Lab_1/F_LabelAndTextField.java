/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_1;

/**
 *
 * @author phuy    
a
 */
import java.awt.*;
public class F_LabelAndTextField{
    public F_LabelAndTextField(){
        Frame f = new Frame("Label and TextFiled");
            Panel p1 = new Panel();
            Panel p2= new Panel();
            Label l1 = new Label("User ID",Label.LEFT);
            TextField t1 = new TextField();
            p1.setSize(300,300);
            p1.add(l1);
            p2.add(t1);
            f.add(p1);
            f.add(p2);
            f.setSize(300,300);
            f.setLayout(null);
            f.setVisible(true);
    }
    public static void main(String[] args) {
        new F_LabelAndTextField();
    }
    
}
