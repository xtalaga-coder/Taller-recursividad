import java.util.Scanner;

public class Ejercicio1{
    static long numeroEnteroFactorial(int n){
        if (n<=1){
            return 1;
        }
        return n*numeroEnteroFactorial(n-1);


    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        int n= sc.nextInt();
        if (n<0){
            System.out.println("El numero debe ser positivo");
        }else{
            System.out.println("El factorial de " + n + " es: "+numeroEnteroFactorial(n));
        }
        sc.close();
    }
    
}
