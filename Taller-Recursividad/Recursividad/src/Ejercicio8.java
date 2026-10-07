import java.util.Scanner;

public class Ejercicio8 {
    static void copiarCadena(String origen, char [] destino, int i){
        if (i==origen.length()){
            return;

        }
        destino[i]=origen.charAt(i);
        copiarCadena(origen, destino, i+1);
    }
    public static void main (String []args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Ingrese una cadena:");
        String origen= sc.nextLine();
        char [] destino=new char[origen.length()];
        copiarCadena(origen, destino, 0);
        System.out.println("la copia: "+ new String (destino));
    }
}
