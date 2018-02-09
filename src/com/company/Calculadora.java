package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame{
    private JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9, igual, mas, menos, por, div, punto;
    private JTextField display;
    private JPanel superior, inferior;

    private String cadena1="", cadena2="", operacion="";
    int turno =1;
    double resultado;

    public Calculadora(){
        super("Calculadora");
        setSize(300,400);
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        igual = new JButton("=");
        mas = new JButton("+");
        menos = new JButton("-");
        por = new JButton("*");
        div = new JButton("/");
        punto = new JButton(".");

        //display.setBounds(10,10,50,50);
        display = new JTextField(24);
        display.setHorizontalAlignment(JTextField.RIGHT);
        superior = new JPanel(new FlowLayout());
        inferior = new JPanel(new GridLayout(4,4));

        superior.add(display);

        inferior.add(b7);
        inferior.add(b8);
        inferior.add(b9);
        inferior.add(div);

        inferior.add(b4);
        inferior.add(b5);
        inferior.add(b6);
        inferior.add(por);

        inferior.add(b1);
        inferior.add(b2);
        inferior.add(b3);
        inferior.add(menos);

        inferior.add(b0);
        inferior.add(punto);
        inferior.add(igual);
        inferior.add(mas);

        setLayout(new BorderLayout());
        add(superior,BorderLayout.NORTH);
        add(inferior,BorderLayout.CENTER);

        b0.addActionListener(new ActionListener() { //boton del # 0
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1){ //Preguntamos en que fase de la calculadora estamos
                    cadena1 +="0"; //Agregamos el valor a la variable cadena1
                    display.setText(cadena1);//Enviamos el valor asignado al JTextField;
                }
                else{
                    cadena2 +="0";
                    display.setText(cadena1+ " "+operacion+" "+cadena2);
                }
            }
        });

        b1.addActionListener(new ActionListener() { //boton del # 1
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1){ //Preguntamos en que fase de la calculadora estamos
                    cadena1 +="1"; //Agregamos el valor a la variable cadena1
                    display.setText(cadena1);//Enviamos el valor asignado al JTextField;
                }
                else{
                    cadena2 +="1";  //en caso de estar en el turno 2 de la calculadora
                    display.setText(cadena1+ " "+operacion+" "+cadena2);
                }
            }
        });

        b2.addActionListener(new ActionListener() { //boton del # 2
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1){ //Preguntamos en que fase de la calculadora estamos
                    cadena1 +="2"; //Agregamos el valor a la variable cadena1
                    display.setText(cadena1);//Enviamos el valor asignado al JTextField;
                }
                else{
                    cadena2 +="2";
                    display.setText(cadena1+ " "+operacion+" "+cadena2);
                }
            }
        });

        b3.addActionListener(new ActionListener() { //boton del # 3
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1){ //Preguntamos en que fase de la calculadora estamos
                    cadena1 +="3"; //Agregamos el valor a la variable cadena1
                    display.setText(cadena1);//Enviamos el valor asignado al JTextField;
                }
                else{
                    cadena2 +="3";
                    display.setText(cadena1+ " "+operacion+" "+cadena2);
                }
            }
        });

        b4.addActionListener(new ActionListener() { //boton del # 4
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1){ //Preguntamos en que fase de la calculadora estamos
                    cadena1 +="4"; //Agregamos el valor a la variable cadena1
                    display.setText(cadena1);//Enviamos el valor asignado al JTextField;
                }
                else{
                    cadena2 +="4";
                    display.setText(cadena1+ " "+operacion+" "+cadena2);
                }
            }
        });

        b5.addActionListener(new ActionListener() { //boton del # 5
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1){ //Preguntamos en que fase de la calculadora estamos
                    cadena1 +="5"; //Agregamos el valor a la variable cadena1
                    display.setText(cadena1);//Enviamos el valor asignado al JTextField;
                }
                else{
                    cadena2 +="5";
                    display.setText(cadena1+ " "+operacion+" "+cadena2);
                }
            }
        });

        b6.addActionListener(new ActionListener() { //boton del # 6
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1){ //Preguntamos en que fase de la calculadora estamos
                    cadena1 +="6"; //Agregamos el valor a la variable cadena1
                    display.setText(cadena1);//Enviamos el valor asignado al JTextField;
                }
                else{
                    cadena2 +="6";
                    display.setText(cadena1+ " "+operacion+" "+cadena2);
                }
            }
        });

        b7.addActionListener(new ActionListener() { //boton del # 7
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1){ //Preguntamos en que fase de la calculadora estamos
                    cadena1 +="7"; //Agregamos el valor a la variable cadena1
                    display.setText(cadena1);//Enviamos el valor asignado al JTextField;
                }
                else{
                    cadena2 +="7";
                    display.setText(cadena1+ " "+operacion+" "+cadena2);
                }
            }
        });

        b8.addActionListener(new ActionListener() { //boton del # 8
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1){ //Preguntamos en que fase de la calculadora estamos
                    cadena1 +="8"; //Agregamos el valor a la variable cadena1
                    display.setText(cadena1);//Enviamos el valor asignado al JTextField;
                }
                else{
                    cadena2 +="8";
                    display.setText(cadena1+ " "+operacion+" "+cadena2);
                }
            }
        });

        b9.addActionListener(new ActionListener() { //boton del # 9
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1){ //Preguntamos en que fase de la calculadora estamos
                    cadena1 +="9"; //Agregamos el valor 9  a la variable cadena1
                    display.setText(cadena1);//Enviamos el valor asignado al JTextField;
                }
                else{
                    cadena2 +="9";
                    display.setText(cadena1+ " "+operacion+" "+cadena2);
                }
            }
        });

        punto.addActionListener(new ActionListener() { //boton del punto
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1){ //Preguntamos en que fase de la calculadora estamos
                    cadena1 +="."; //Agregamos el valor a la variable cadena1
                    display.setText(cadena1);//Enviamos el valor asignado al JTextField;
                }
                else{
                    cadena2 +=".";
                    display.setText(cadena1+ " "+operacion+" "+cadena2);
                }
            }
        });

        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                turno = 2;
                operacion = "/";
                display.setText(cadena1 + " "+operacion+" "+cadena2);
            }
        });

        por.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                turno = 2; //como se anadira un operador se pasa al segundo turno de la calculadora
                operacion = "*"; //se agrega el valor de * a la variable operacion
                display.setText(cadena1+ " "+operacion+" "+cadena2); //como es el segundo turno se manda a texfield toda la expresion
            }
        });

        mas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                turno = 2;
                operacion = "+";
                display.setText(cadena1+" "+operacion+" "+cadena2);
            }
        });

        menos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                turno = 2;
                operacion = "-";
                display.setText(cadena1+" "+operacion+" "+cadena2);
            }
        });

        igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double cad1, cad2, r=0;  //declaramos las variable para convertirlas a variables dobles.

                cad1 = Double.parseDouble(cadena1);
                cad2 = Double.parseDouble(cadena2);

                switch (operacion){
                    case "+" :  r= cad1 + cad2;
                                break;
                    case "-" :  r = cad1 - cad2;
                                break;
                    case "*" :  r = cad1 * cad2;
                                break;
                    case "/" :  r = cad1 / cad2;
                                break;
                }

                display.setText(cadena1+" "+operacion+" "+cadena2+" = "+r);

                // Reinicializando las variables para poder hacer mas operaciones
                turno = 1;
                cadena1 = "";
                cadena2 = "";
                operacion = "";
            }
        });
    }
}