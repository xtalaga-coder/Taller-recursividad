import java.util.Scanner;

public class Ejercicio12 {
    static int sumaMatriz(int[][] m, int i, int j) {
        if (i == m.length) {                         
            return 0;
        }
        if (j == m[0].length) {                      
            return sumaMatriz(m, i + 1, 0);
        }
        return m[i][j] + sumaMatriz(m, i, j + 1);    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de filas (m): ");
        int filas = sc.nextInt();
        System.out.println("Numero de columnas (n): ");
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("La suma de la matriz es: " + sumaMatriz(matriz, 0, 0));
    }
}
