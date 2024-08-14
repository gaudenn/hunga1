
package com.mycompany.bai1;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class baitap {
    public static void main(String[] args) {
        Frame my = new Frame();
        my.setSize(300, 300);
        Panel myl=new Panel();
        myl.setBackground(Color.red);
        my.add(myl);
        my.setVisible(true);
   
     my.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

 }
}
