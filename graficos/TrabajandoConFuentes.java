package graficos;

import java.awt.*;
import javax.swing.*;

public class TrabajandoConFuentes {

    public static void main(String[] args) {

        MarcoConFuentes mimarco = new MarcoConFuentes();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mimarco.setVisible(true);
    }


}

class MarcoConFuentes extends JFrame {

    public MarcoConFuentes() {

        setTitle("Prueba con Fuentes");

        setSize(400, 400);

        LaminaConFuentes milamina = new LaminaConFuentes();

        add(milamina);

        milamina.setForeground(Color.RED);
    }

    class LaminaConFuentes extends JPanel {

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2=(Graphics2D) g;

            Font mifuente = new Font("Courier", Font.BOLD, 26);

            g2.setFont(mifuente);

            g2.drawString("Juan", 100, 100);

            g2.setFont(new Font("Arial", Font.ITALIC, 14));

            g2.drawString("Curso de Java", 100, 200);
        }
    }
}
