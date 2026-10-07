import java.util.Scanner;

public class Ejercicio6 {
   static int potencia (int exp, int base){
        if(exp==0){
            return 1;
        }
        return base*potencia(exp-1, base);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese un numero base");
        int base=sc.nextInt();
        System.out.println("ingrese un exponente");
        int exp=sc.nextInt();
        if(exp<0){
            System.out.println("ingrese un exponente positivo o mayor a cero");

        }else {
            System.out.println(base + "elevado a la potencia " + exp + "es igual a: "+ potencia(exp, base));
        }
        sc.close();


    }
}
 

