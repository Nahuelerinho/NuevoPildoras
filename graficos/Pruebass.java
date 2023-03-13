package graficos;

import java.awt.*;
import javax.swing.*;

public class Pruebass {

    public static void main(String[] args) {

        String fuente =JOptionPane.showInputDialog("Introduce Fuente");

        boolean estalafuente = false;

        String [] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (String nombredelafuente: nombresDeFuentes) {
            if (nombredelafuente.equals(fuente)) {

                estalafuente = true;
                break;
            }
        }

        if (estalafuente) {

            System.out.println("Fuente instalada");
        }else {
            System.out.println("No esta instalada la fuente");
        }


    }

}
