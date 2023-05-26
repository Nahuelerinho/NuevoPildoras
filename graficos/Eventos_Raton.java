package graficos;

import javax.swing.*;
import java.awt.event.*;

public class Eventos_Raton {

    public static void main(String[] args) {

        MarcoRaton mimarco = new MarcoRaton();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoRaton extends JFrame{

    public MarcoRaton() {

        setVisible(true);

        setBounds(700,300,600,450);

        EventosDeRaton  EventoRaton = new EventosDeRaton();

        addMouseMotionListener(EventoRaton);
    }
}

class EventosDeRaton implements MouseMotionListener{

    public void mouseDragged(MouseEvent e) {
        System.out.println("Estas arrastrando el mouse");
    }
    public void mouseMoved(MouseEvent e) {
        System.out.println("Estas moviendo el mouse");
    }
}