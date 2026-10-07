import java.util.Scanner;

public class Ejercicio11 {
   static int sumaArreglo(int[] v, int n) {
        if (n == 0) {                                
            return 0;
        }
        return v[n - 1] + sumaArreglo(v, n - 1);    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos valores desea ingresar: ");
        int n = sc.nextInt();

        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Valor " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }

        System.out.println("La suma es: " + sumaArreglo(v, n));
    }
} 
    

