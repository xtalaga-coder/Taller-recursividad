import java.util.Scanner;

public class Ejercicio9 {
    static int cociente (int a, int b){
if (a<b){
    return 0;
}
return 1 + cociente(a- b, b);

}
public static void main (String []args ){
    Scanner sc= new Scanner(System.in);
    System.out.println("Ingrese el dividendo: ");
    int a = sc.nextInt();
    System.out.println("Ingrese un divisor: ");
    int b=sc.nextInt();
    if (b<=0 & a>0){
        System.out.println("ingrese un dividendo mayor o igual a cero y un divisor mayor a cero");
    }else {
        System.out.println(a+ " / " +b+ " = "+ cociente(a, b));
    }
}
}
