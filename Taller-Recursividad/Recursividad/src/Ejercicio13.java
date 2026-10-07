import java.util.Scanner;
public class Ejercicio13 {
    

    static int fib(int n) {
        if (n == 0) {                                
            return 0;
        }
        if (n == 1) {                                
            return 1;
        }
        return fib(n - 1) + fib(n - 2);              
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el limite de la serie: ");
        int limite = sc.nextInt();

        if (limite < 0) {
            System.out.println("Ingrese un numero mayor o igual a 0.");
        } else {
            for (int i = 0; i <= limite; i++) {
                System.out.print(fib(i) + " ");
            }
            System.out.println();
        }
    }
}

