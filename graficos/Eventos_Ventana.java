package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLOutput;

public class Eventos_Ventana {

    public static void main(String[] args) {

        MarcoVentana mimarco = new MarcoVentana();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MarcoVentana mimarco2 = new MarcoVentana();

        mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        mimarco.setTitle("Ventana 1");
        mimarco2.setTitle("Ventana 2");

        mimarco.setBounds(300,300,500,350);
        mimarco2.setBounds(900,300,500,350);

    }
}

class MarcoVentana extends JFrame {

    public MarcoVentana() {

        //setTitle("Respondiendo");

        //setBounds(300, 300, 500, 350);

        setVisible(true);

        //M_Ventana oyente_ventana = new M_Ventana();

        //addWindowListener(oyente_ventana);

        addWindowListener(new M_Ventana());
    }
}

class M_Ventana extends WindowAdapter {

    public void windowIconified(WindowEvent e) {

        System.out.println("Ventana Minimizada");
    }

}