
package com.mycompany.bai1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class test extends Frame implements ActionListener {
    public static void main ( String [] args){
        Frame my = new Frame ("");
        my.setSize(300,150);
        my.setVisible(true);
        my.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

}
       public void actionPerformed (ActionEvent e){}
    
}