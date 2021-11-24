package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Kanwa extends JPanel implements KeyListener, MouseListener {


    int xKształtu =0;
    int yKształtu =0;
    char kształt;               /// k lub o

    public Kanwa() {

        Label label = new Label("Naciśnij 'o' lub 'k' aby wybrac kształt do rysowania, następnie kliknij gdzieś na polu");
        label.setLocation(0,0);

        //USTAWIANIA JPANELA
        this.setLocation(0,351);
        this.setSize(300,800);
        this.setBackground(Color.WHITE);
        this.setFocusable(true);
        this.addKeyListener(this);
        this.setFocusable(true);
        this.addMouseListener(this);

        this.add(label);
    }





    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("klikniecie");

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("klikniecie");

    }

    @Override
    public void keyReleased(KeyEvent e) {

        kształt =e.getKeyChar();

    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, WIDTH, HEIGHT);
        g2d.setColor(Color.BLACK);
        drawRectangles(g2d);
    }
    private void drawRectangles(Graphics2D g2d) {

        if(!(xKształtu ==0 && yKształtu ==0)){
            if(kształt=='k'){

                g2d.fillRect(xKształtu, yKształtu,30,30);

            }
            if(kształt=='o'){
                g2d.fillOval(xKształtu, yKształtu,30,30);

            }

        }
        this.repaint();


    }


    @Override
    public void mouseClicked(MouseEvent e) {

            xKształtu =e.getX();
            yKształtu =e.getY();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
