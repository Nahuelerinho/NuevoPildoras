package estructurasPrincipales;

public class Manipula_Cadenas2 {
    public static void main(String[] args) {

        String frase="Hoy es un estupendo dia para aprender a programar en Java";

        String frase_resumen=frase.substring(0,28) + " irnos a la playa y olvidarnos de todo..." +" y " +frase.substring(29,57);

        System.out.println(frase_resumen);


    }
}
