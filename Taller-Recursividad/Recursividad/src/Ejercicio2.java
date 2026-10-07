import java.util.Scanner;

public class Ejercicio2 {
    static int  Invertido (int n, int inv){
        if (n ==0){
            return inv;

        }
        return Invertido(n/10, inv * 10 + n%10);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int n= sc.nextInt();
        System.out.println("el numero invertido es: "+Invertido(n, 0));
    }
}


