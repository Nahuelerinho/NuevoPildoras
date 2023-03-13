package graficos;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PruebaImagenes {
    public static void main(String[] args) {

        MarcoImagen mimarco = new MarcoImagen();

        mimarco.setVisible(true);

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoImagen extends JFrame {

    public MarcoImagen() {

        setTitle("Mi ventana");

        setBounds(750, 300, 300, 200);

        LaminaConImagen milamina = new LaminaConImagen();

        add(milamina);

    }

}

class LaminaConImagen extends JPanel {

    public LaminaConImagen() {

        try {
            imagen= ImageIO.read(new File("graficos/Arquero_Tiro_Largo_Icono-DE.jpg"));
        }catch (IOException e) {
            System.out.println("La imagen no se encuentra");
        }

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int anchuraimagen = imagen.getWidth(this);
        int alturaimagen = imagen.getHeight(this);

        g.drawImage(imagen, 0, 0, null);

        for (int i=0; i<256; i++) {
            for (int j=0; j<256; j++) {

                if(i+j>0){
                    g.copyArea(0,0,anchuraimagen,alturaimagen, anchuraimagen*i, alturaimagen*j);
                }
            }
        }
    }
    private Image imagen;
}

