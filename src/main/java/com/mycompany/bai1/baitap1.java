
package com.mycompany.bai1;

import javax.swing.*;
import java.awt.*;
public class baitap1 extends JFrame{
    JLabel LhoTen,Ldiachi,LnamSinh;
    JTextField THoTen,TDiaChi,TNamSinh;
    JButton BThem,BSua,BXoa;
    JPanel p1,p2;
    baitap1()
    {super("thông tin sinh viên");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
    p1=new JPanel();
    p1.setLayout(new GridLayout(3,2));
    LhoTen=new JLabel("Họ Tên:    ");
    Ldiachi=new JLabel("Địa Chỉ:  ");
    LnamSinh=new JLabel("Năm Sinh:    ");
    THoTen=new JTextField(9);
    TDiaChi=new JTextField(9);
    TNamSinh=new JTextField(9);     
    p1.add(LhoTen);
    p1.add(THoTen);
    p1.add(Ldiachi);
    p1.add(TDiaChi);
    p1.add(LnamSinh);
    p1.add(TNamSinh);
    this.add(p1,BorderLayout.NORTH);
    p2=new JPanel();
    p2.setLayout(new FlowLayout());
    BThem=new JButton("Thêm");
    BSua=new JButton("Sửa");
    BXoa=new JButton("Xóa");
    p2.add(BThem); p2.add(BSua); p2.add(BXoa);
    this.add(p2,BorderLayout.SOUTH);
    this.setSize(300,150);
    this.setVisible(true);
    }
    public static void main(String args[])
    { 
        new baitap1();
    }
}

