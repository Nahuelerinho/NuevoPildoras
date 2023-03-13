package estructurasPrincipales;

import javax.swing.*;

public class Comprueba_mail {
    public static void main(String[] args) {

        int arroba=0;
        boolean punto=false;

        String mail= JOptionPane.showInputDialog("Introduce mail");

        for (int i=0; i<mail.length(); i++) {

            if(mail.charAt(i)=='@') {
                arroba++;
            }
            if(mail.charAt(i)=='.'){
                punto=true;
            }
        }if(arroba==1) {
            System.out.println("El mail es correcto");
        }else{
            System.out.println("El mail no es correcto");
        }

    }
}
