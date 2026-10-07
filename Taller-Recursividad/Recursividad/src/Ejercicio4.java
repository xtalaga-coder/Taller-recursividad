import java.util.Scanner;

public class Ejercicio4 {
    static int LeerNumero(int n){
        if(n==0){
            return 0;

        }
        return (n%10)+ LeerNumero(n/10);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n=sc.nextInt();
        System.out.println("La suma de los digitos es: " + LeerNumero(Math.abs(n)));
    }
}


