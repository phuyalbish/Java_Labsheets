package Lab_3;

import java.awt.*;
import java.awt.event.*;
public class A_Counter extends Frame{
        Panel panel1;
        Label enter_a_integer;
        TextField number1;
        Button countdown;
        int numbergetnset;
    public A_Counter(){
        setTitle("AWT Counter");
        panel1 = new Panel();
        panel1.setSize(200,300);
        enter_a_integer = new Label("Enter a Integer:");
        number1 = new TextField("0",20);
        countdown = new Button("Count Down");
        panel1.add(enter_a_integer);
        panel1.add(number1);
        panel1.add(countdown);
        add(panel1);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
        countdown.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent ae){
                numbergetnset = Integer.parseInt(number1.getText());
                numbergetnset--;
                number1.setText(Integer.toString(numbergetnset));
                
            }
        });
        setSize(400,400);
        setLayout(new FlowLayout());
        setVisible(true);
    }
    public static void main(String[] args){
        new A_Counter();
    }

}