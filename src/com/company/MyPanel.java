package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class MyPanel extends JPanel {

    JButton runButton, closeButton;


    public MyPanel() {

        this.setFocusable(true);

        this.setLocation(0, 0);
        this.setSize(1000, 350);
        this.setLayout(null);
        this.setBackground(Color.RED);
        runButton = new JButton("RUN");
        final int runBurronX = 0;
        final int runBurronY = 0;
        runButton.setSize(150, 75);
        runButton.setLocation(0, 0);
        runButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

                //KWADRAT PO LEWEJ SRTRONIE UMOZLIWIA NAJCHANIE NA PRZYCISK BEZ JEGO PRZMEISZCZANIA
                this.newRunButtonLocation(runButton, e);
            }

            private void newRunButtonLocation(JButton runButton, MouseEvent e) {
                if ((e.getX() > 10)) {

                    Random random = new Random();
                    int x = random.nextInt(850);
                    int y = random.nextInt(725);
                    runButton.setLocation(x, y);
                }
            }
        });
        runButton.setVisible(true);


        closeButton = new JButton("Close");
        closeButton.setSize(150, 75);
        closeButton.setLocation(300, 0);
        closeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //PRZYWRACA RUNBUTTON PODSTAWOWA POZYCJE
                runButton.setLocation(runBurronX, runBurronY);
            }
        });
        closeButton.setVisible(true);

        this.add(runButton);
        this.add(closeButton);
        this.setVisible(true);
    }
}