package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static javax.swing.text.StyleConstants.setBackground;

public class PruebaEventos {

    public static void main(String[] args) {

        MarcoBotones mimarco=new MarcoBotones();

        mimarco.setVisible(true);

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoBotones extends JFrame {

    public MarcoBotones() {

        setTitle("Botones y eventos");

        setBounds (700, 300, 500, 300);

        LaminaBotones milamina=new LaminaBotones();

        add(milamina);
    }
}

class LaminaBotones extends JPanel {

    JButton botonAzul = new JButton("Azul");

    JButton botonAmarillo = new JButton("Amarillo");

    JButton botonRojo = new JButton("Rojo");

    public LaminaBotones() {

        add(botonAzul);

        add(botonAmarillo);

        add(botonRojo);

        ColorFondo Amarillo = new ColorFondo(Color.yellow);
        ColorFondo Rojo = new ColorFondo(Color.red);
        ColorFondo Azul = new ColorFondo(Color.blue);

        botonAzul.addActionListener(Azul);

        botonAmarillo.addActionListener(Rojo);

        botonRojo.addActionListener(Amarillo);
    }

    private class ColorFondo implements ActionListener {

        public ColorFondo(Color c){

            colorDeFondo=c;
        }

        public void actionPerformed(ActionEvent e) {

            setBackground(colorDeFondo);
        }

        private Color colorDeFondo;

    }

}

