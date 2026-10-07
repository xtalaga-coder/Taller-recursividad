import java.util.Scanner;

public class Ejercicio5 {
    static int numeroLeido(int n){
        if (n<1){
            return n;
        }
        return n + numeroLeido(n-1);
    }
    public static void main (String []args ){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese un numero mayor a cero");
        int n=sc.nextInt();
        if (n<0){
            System.out.println ("ingrese un numero positivo");
        }
        System.out.println("la sumatoria hasta " + n + "es: " +numeroLeido(n));
    }
}


