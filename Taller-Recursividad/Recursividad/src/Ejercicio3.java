import java.util.Scanner;

public class Ejercicio3 {
    static double sumatoria (int n){
    if (n==1){
        return 1;

    }
    return 1.0/n + sumatoria(n-1);

   }
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("ingrese un numero");
       int n=sc.nextInt();
       System.out.println("la sumatoria es: " + sumatoria(n));

   }
    
}


