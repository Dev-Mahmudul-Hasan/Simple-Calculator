package com.mycompany.calculatotr;

import java.awt.Color;
import java.awt.Container;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;

public class Calculatotr implements ActionListener {

    JTextField t1;
    JButton n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, n11, n12, n13, n14,n15,n16;
    double a = 0, result = 0, b = 0;
    int n = 0;

    Calculatotr() 
        {
        JFrame s = new JFrame("Calculator");
        s.setBackground(Color.red);
        s.getContentPane().setBackground( Color.red );
        s.getContentPane().setBackground( Color.green);
        t1 = new JTextField();
        t1.setBounds(150, 200, 190, 40);
        n1 = new JButton("1");
        n1.setBounds(150, 250, 40, 40);
        n2 = new JButton("2");
        n2.setBounds(200, 250, 40, 40);
        n3 = new JButton("3");
        n3.setBounds(250, 250, 40, 40);
        n11 = new JButton("/");
        n11.setBounds(300, 250, 40, 40);
        n4 = new JButton("4");
        n4.setBounds(150, 300, 40, 40);
        n5 = new JButton("5");
        n5.setBounds(200, 300, 40, 40);
        n6 = new JButton("6");
        n6.setBounds(250, 300, 40, 40);
        n12 = new JButton("*");
        n12.setBounds(300, 300, 40, 40);
        n7 = new JButton("7");
        n7.setBounds(150, 350, 40, 40);
        n8 = new JButton("8");
        n8.setBounds(200, 350, 40, 40);
        n9 = new JButton("9");
        n9.setBounds(250, 350, 40, 40);
        n13 = new JButton("+");
        n13.setBounds(300, 350, 40, 40);
        n0 = new JButton("0");
        n0.setBounds(150, 400, 140, 40);
        n14 = new JButton("-");
        n14.setBounds(300, 400, 40, 40);
        n15 = new JButton("ENTER");
        n15.setBounds(150, 450, 90, 40);
        n16 = new JButton("CLEAR");
        n16.setBounds(250, 450, 90, 40);

        s.add(t1);
        s.add(n1);
        s.add(n2);
        s.add(n3);
        s.add(n11);
        s.add(n4);
        s.add(n5);
        s.add(n6);
        s.add(n12);
        s.add(n7);
        s.add(n8);
        s.add(n9);
        s.add(n13);
        s.add(n0);
        s.add(n14);
        s.add(n15);
        s.add(n16);
        s.setSize(500,600);
        s.setLayout(null);
        s.setVisible(true);
        s.setBackground(Color.blue);
        n1.addActionListener(this);
        n2.addActionListener(this);
        n3.addActionListener(this);
        n4.addActionListener(this);
        n5.addActionListener(this);
        n6.addActionListener(this);
        n7.addActionListener(this);
        n8.addActionListener(this);
        n9.addActionListener(this);
        n0.addActionListener(this);
        n11.addActionListener(this);
        n12.addActionListener(this);
        n13.addActionListener(this);
        n14.addActionListener(this);
        n15.addActionListener(this);
        n16.addActionListener(this);
        
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == n1) {
            t1.setText(t1.getText().concat("1"));

        }
        if (e.getSource() == n2) {
            t1.setText(t1.getText().concat("2"));

        }
        if (e.getSource() == n3) {
            t1.setText(t1.getText().concat("3"));
        }
        if (e.getSource() == n4) {
            t1.setText(t1.getText().concat("4"));
        }
        if (e.getSource() == n5) {
            t1.setText(t1.getText().concat("5"));
        }
        if (e.getSource() == n6) {
            t1.setText(t1.getText().concat("6"));
        }
        if (e.getSource() == n7) {
            t1.setText(t1.getText().concat("7"));
        }
        if (e.getSource() == n8) {
            t1.setText(t1.getText().concat("8"));
        }
        if (e.getSource() == n9) {
            t1.setText(t1.getText().concat("9"));
        }
        if (e.getSource() == n0) {
            t1.setText(t1.getText().concat("0"));
        }

        if (e.getSource() == n11) {
            a = Double.parseDouble(t1.getText());
            n = 1;
            t1.setText("");
        }
        if (e.getSource() == n12) {
            a = Double.parseDouble(t1.getText());

            n= 2;
            t1.setText("");
        }
        if (e.getSource() == n13) {
            a = Double.parseDouble(t1.getText());
            n = 3;
            t1.setText("");
        }
        if (e.getSource() == n14) {
            a = Double.parseDouble(t1.getText());
            n = 4;
            t1.setText("");
        }
        if (e.getSource() == n15) {
            b = Double.parseDouble(t1.getText());
            switch (n) {
                case 1:
                    result = a / b;
                    break;
                case 2:
                    result = a * b;
                    break;
                case 3:
                    result = a + b;
                    break;
                case 4:
                    result = a - b;
                    break;
                default:
                    result = 0;
            }
            t1.setText("" + result);
        }
        if (e.getSource()==n16)
     t1.setText(" ");
        
    }

    public static void main(String[] args) {
        new Calculatotr();

    }
}
