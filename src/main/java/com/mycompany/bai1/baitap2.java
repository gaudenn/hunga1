
package com.mycompany.bai1;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.MessageFormat;
import java.io.*;
import java.util.Scanner;

public class baitap2 extends Frame implements ItemListener {

    Choice myChoice; 
    Label l;

    public baitap2() {
        super("mã màu");
        this.setLayout(new FlowLayout());

        myChoice = new Choice(); 
        myChoice.addItem("Red"); 
        myChoice.addItem("Blue"); 
        myChoice.addItem("Green");
        myChoice.addItem("pink"); 
        myChoice.addItem("yellow"); 
        myChoice.addItemListener(this);
        this.add(myChoice);   
        l = new Label("Ban da chon mau nen la: ...");
        this.add(l);        
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    
    public void itemStateChanged(ItemEvent ie) {
        if (ie.getStateChange() == ItemEvent.SELECTED) {
            String item = (String) ie.getItem();
            if (item.equals("Red")) 
            {
                this.setBackground(Color.red);
                l.setText("Ban da chon mau nen la red!");
            }
            if (item.equals("Blue")) 
            {
                this.setBackground(Color.blue);
                l.setText("Ban da chon mau nen la blue!");
            }
            if (item.equals("Green")) 
            {
                this.setBackground(Color.green);
                l.setText("Ban da chon mau nen la green!");
            }
            if (item.equals("pink")) 
            {
                this.setBackground(Color.pink);
                l.setText("Ban da chon mau nen la pink!");
            }
            if (item.equals("yellow")) 
            {
                this.setBackground(Color.yellow);
                l.setText("Ban da chon mau nen la yellow!");
            }
            this.repaint();
        }
    }

    public static void main(String[] args) {
        baitap2 myFrame = new baitap2();
        myFrame.setSize(300, 150); 
        myFrame.setVisible(true); 
    }
}
