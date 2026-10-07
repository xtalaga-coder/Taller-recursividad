import java.util.Scanner;

public class Ejercicio7 {
    static int mcd (int M, int n){
        if (n==0){
            return M;
        }
        return mcd (M, n%n);
    }
    public static void main  (String []args){
        Scanner sc=new Scanner (System.in);
        System.out.println("ingrese el primer numero");
        int m =sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int n= sc.nextInt();
        System.out.println("el minimo comun multiplo entre "+m+" y "+n+ " es: "+mcd(m, n));

    } 
}

