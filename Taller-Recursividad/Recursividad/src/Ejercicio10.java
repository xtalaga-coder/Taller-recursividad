import java.util.Scanner;

public class Ejercicio10 {
    static int multiplicacion (int a, int b){
        if (b==0){
            return 0;

        }
        return a + multiplicacion(a, b-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese un numero mayor o igual a cero ");
        int a=sc.nextInt();
        System.out.println("ingrese el segundo numero, mayor o igual a cero");
        int b=sc.nextInt();
        if (b<=0){
            System.out.println("el numero de ser mayor o igual a cero");
        }else {
            System.out.println(a+ " * "+b+" = "+ multiplicacion(a, b));
        }
    }
}
