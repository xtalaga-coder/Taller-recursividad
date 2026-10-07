import java.util.Scanner;

public class Ejercicio14 {
   static int ackermann(int m, int n) {
        if (m == 0) {                                        
            return n + 1;
        }
        if (n == 0) {                                        
            return ackermann(m - 1, 1);
        }
        return ackermann(m - 1, ackermann(m, n - 1));        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese m: ");
        int m = sc.nextInt();
        System.out.println("Ingrese n: ");
        int n = sc.nextInt();

        if (m < 0 || n < 0) {
            System.out.println("m y n deben ser mayores o iguales a 0.");
        } else {
            System.out.println("Ackermann(" + m + ", " + n + ") = " + ackermann(m, n));
        }
    } 
}
