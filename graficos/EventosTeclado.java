package graficos;
import javax.swing.*;
import java.awt.event.*;

public class EventosTeclado {

    public static void main(String[] args) {
        MarcoConTeclas mimarco = new MarcoConTeclas();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConTeclas extends JFrame {

    public MarcoConTeclas() {

        setVisible(true);

        setBounds(700,300,600,450);

        EventoDeTeclado tecla = new EventoDeTeclado();

        addKeyListener(tecla);

    }
}

class EventoDeTeclado implements KeyListener {

    public void keyTyped(KeyEvent e) {
        char letra = e.getKeyChar();
        System.out.println(letra);
    }

    public void keyPressed(KeyEvent e) {
        //int codigo = e.getKeyCode();
        //System.out.println(codigo);
    }

    public void keyReleased(KeyEvent e) {

    }
}