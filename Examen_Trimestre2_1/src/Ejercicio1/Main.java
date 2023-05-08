package Ejercicio1;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            Tabla matriz = new Tabla(6, 6);
            boolean continuar = false;
            int resp;

            do {
                System.out.println("Programa para simulación de sensores en malla de 6x6:");
                System.out.println("0. Salir");
                System.out.println("1. Inicializar tabla.");
                System.out.println("2. Mostrar tabla.");
                System.out.println("3. Máximo, Mínimo");
                System.out.println("4. Medias por fila");
                System.out.print("Introduzca la opción que desee ejecutar: ");

                resp = leer.nextInt();
                switch (resp) {
                    case 0:
                        System.out.println("Saliendo del programa...");
                        continuar = true;
                        break;
                    case 1:
                        matriz.inicializarTabla();
                        System.out.println("Tabla inicializada correctamente.");
                        break;
                    case 2:
                        matriz.imprimirTabla();
                        break;
                    case 3:
                        matriz.imprimirValorMaximo();
                        matriz.imprimirValorMinimo();
                        break;
                    case 4:
                        System.out.println("No se como hacerlo");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }

            } while (!continuar);
        }
    }

}