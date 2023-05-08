import java.util.Scanner;

public class Ejercicio_2 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        int limInferior = 0;
        int limSuperior = 0;
        boolean continuar1 = true;
        boolean continuar2 = true;
        int num = 0, suma=0, fueraIntervalo = 0;
        boolean igual = false;


        do{
            System.out.println("Introduce el limite inferior");
            limInferior = leer.nextInt();
            System.out.println("Introduce el limite superior");
            limSuperior = leer.nextInt();
            if(limInferior >= limSuperior){
                System.out.println("El limite inferior no puede ser mas grande que el superior");
            }else if(limSuperior > limInferior){
                System.out.println("Numeros válidos");
                continuar1 = false;
            }
        }while(continuar1);

        do {
            System.out.println("Introduce números hasta que quieras terminar(Pulsando 0)");
            num = leer.nextInt();
            if(num<limInferior || num>limSuperior){
                fueraIntervalo++;
            }else if(num>limInferior || num<limSuperior){
                suma += num;
            }else if(num==limInferior || num==limSuperior){
                igual = true;
            }else if(num == 0){
                continuar2 = false;
            }
        }while(continuar2);

        System.out.println("La suma de los numeros dentro de los limites es"+suma+"\n" +
                "Hay numeros "+fueraIntervalo+" del intervalo" +
                "Numeros iguales a los intervalos = "+igual+"");
    }
}