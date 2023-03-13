package estructurasPrincipales;

public class Arrays_bidimensionales {
    public static void main(String[] args) {

        int[][] matrix ={
                {10,15,18,19,21},
                {23,25,27,29,31},
                {32,33,34,35,36},
                {37,38,39,40,41},
        };

        System.out.println("Valor almacenado en la posicion 2, 3 es: " + matrix[2][3]);

        for (int[]fila:matrix) {
            System.out.println();
            for (int z: fila){
                System.out.print(z + " ");
        }
        }
    }
}
