package com.company;

import javax.swing.*;
import java.awt.*;

public class EjemploGrid extends JFrame{
    private JButton b1, b2, b3, b4, b5;

    public EjemploGrid(){
        super("Ejemplo de GridLayout");
        setSize(500,600);

        b1 = new JButton("Boton 1");
        b2 = new JButton("Boton 2");
        b3 = new JButton("Boton 3");
        b4 = new JButton("Boton 4");
        b5 = new JButton("Boton 5");

        setLayout(new GridLayout(2,2));
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
    }
}
