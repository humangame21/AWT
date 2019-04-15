package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenster extends JFrame {

    private JTextField name;
    private JTextField frage;
    private JTextField antwort;
    private JPasswordField pwfeld1;
    private JPasswordField pwfeld2;





    public Fenster() {
        super("Fenster Titel");
        setLayout(new FlowLayout());


        name = new JTextField(15);
        add(name);


        frage = new JTextField("Was ist 3 + vier?");
        frage.setEditable(false);
        add(frage);


        antwort = new JTextField("Gib die Antwort hier ein");
        add(antwort);


        pwfeld1 = new JPasswordField(10);
        add(pwfeld1);
        pwfeld2 = new JPasswordField(10);
        add(pwfeld2);

        DerHandler handler = new DerHandler();

        name.addActionListener(handler);
        antwort.addActionListener(handler);
        pwfeld1.addActionListener(handler);
        pwfeld2.addActionListener(handler);


    }
private class DerHandler implements ActionListener {

        public void actionPerformed(ActionEvent event){
            String string = "";

            if(event.getSource() == name)
                string=String.format("Name: %s", event.getActionCommand());
            else if(event.getSource()==antwort)
                string=String.format("Antwort: %s", event.getActionCommand());
            else if(event.getSource()==pwfeld1)
                string=String.format("Passwort1: %s", event.getActionCommand());
            else if(event.getSource()==pwfeld2)
                string=String.format("Passwort2: %s", event.getActionCommand());

            JOptionPane.showMessageDialog(null, string);
        }
}



}
