
package com.mycompany.bai1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Bai1 extends Frame implements ActionListener {

        public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(300,150);
        f.setLocationRelativeTo(null);
        Label t1 = new Label("nhap so a");
        TextField f1 = new TextField("hf");
        Label t2 = new Label("nhap so b");
        TextField f2 = new TextField("");
        Label t3 = new Label("ket qua la:");
        TextField f3 = new TextField("");
        Button b1 = new Button("cong");
        Button b2 = new Button("tru");
        
        
        
        
        f.add(t1);
        f.add(f1);
        f.add(t2);
        f.add(f2);
        f.add(t3);
        f.add(f3);
        f.add(b1);
        f.add(b2);
        
        
        
        f.setLayout(new GridLayout(5,2));
        f.setVisible(true);    
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

}
       public void actionPerformed (ActionEvent e){}
    }

