package graficos;
import javax.swing.*;
import java.awt.*;

public class CreandoMarcos {
    public static void main(String[] args) {

        MarcoImagen marco1 = new MarcoImagen();

        marco1.setVisible(true);

        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class miMarco extends JFrame {

    public miMarco() {

        //setSize(500, 300);

        //setLocation(500,300);

        setBounds(500, 300, 500, 300);

        //setResizable(false);

        setExtendedState(Frame.MAXIMIZED_BOTH);

        setTitle("Mi ventana");

    }


}
