package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame buttonFrame = new JFrame();
        MyPanel myPanel = new MyPanel();
        buttonFrame.add(myPanel);
        buttonFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        buttonFrame.setResizable(false);
        buttonFrame.pack();
        buttonFrame.setSize(1000,800);
        buttonFrame.setLocation(500,0);

        Kanwa kanwa = new Kanwa();
        JFrame kanwaFrame = new JFrame();
        kanwaFrame.add(kanwa);
        kanwaFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        kanwaFrame.pack();
        kanwaFrame.setSize(500,800);
        kanwaFrame.setLocation(0,0);
        kanwaFrame.add(kanwa);


        kanwaFrame.setVisible(true);
        buttonFrame.setVisible(true);

    }
}
