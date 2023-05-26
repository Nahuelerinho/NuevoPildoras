package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FocoEvento {

    public static void main(String[] args) {

        MarcoFoco mimarco = new MarcoFoco();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}


class MarcoFoco extends JFrame{

    public MarcoFoco() {

        setVisible(true);

        setBounds(300,300,600,450);

        add(new LaminaFoco());
    }
}
class LaminaFoco extends JPanel{

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        setLayout(null);

        cuadro1 = new JTextField();

        cuadro2 = new JTextField();

        cuadro1.setBounds(120,10,150,20);

        cuadro2.setBounds(120,50,150,20);

        add(cuadro1);

        add(cuadro2);

        LanzaFocos elfoco= new LanzaFocos();

        cuadro1.addFocusListener(elfoco);
    }


    private class LanzaFocos implements FocusListener{

        public void focusGained(FocusEvent e) {

        }
        public void focusLost(FocusEvent e) {
            String email=cuadro1.getText();

            boolean comprobacion = false;

            for(int i=0; i<email.length(); i++) {
                if(email.charAt(i) == '@'){
                    comprobacion = true;
                }
            }
            if(comprobacion){
                System.out.println("Correcto");
            }else{
                System.out.println("Incorrecto");
            }
        }
    }

    JTextField cuadro1;

    JTextField cuadro2;
}