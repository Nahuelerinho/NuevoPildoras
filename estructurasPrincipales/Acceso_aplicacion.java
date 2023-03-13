package estructurasPrincipales;

import javax.swing.*;

public class Acceso_aplicacion {
    public static void main(String[] args) {

        String clave="Nahuel";

        String pass="";

        while (clave.equals(pass)==false) {

            pass= JOptionPane.showInputDialog("Introduce la Contraseña por favor");

            if (clave.equals(pass)==false){

                System.out.println("Contraseña incorrecta");
            }

        }

        System.out.println("Contraseña correcta. Acceso permitido");
    }
}
