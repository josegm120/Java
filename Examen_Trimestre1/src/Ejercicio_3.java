import java.util.Scanner;

public class Ejercicio_3 {
    public static void main (String[] args){
        Scanner leer = new Scanner (System.in);

        System.out.println("Introduce un numero");
        int num = leer.nextInt();

        int j=num;
        for (int i = 1; i<=num;i++) {
            System.out.println(String.valueOf(i) + " " + String.valueOf(j));
            j--;
        }
    }
}