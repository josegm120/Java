import java.util.Scanner;

public class Ejercicio_1 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        boolean continuar = true;
        int negro = 0, rojo = 0, amarillo = 0, verde = 0;

        while (continuar){
            System.out.println("a. Realizar triaje\n" +
                    "b. Mostrar estadísticas\n" +
                    "c. (o cualquier otra tecla) Salir");
            String resp1 = leer.nextLine();

            switch (resp1){
                case "a":
                    System.out.println("Si quiere responder si, pulse 1.\n" +
                            "Si quiere responder no, pulse 2.");
                    System.out.println("¿Puede caminar?");
                    int resp2 = leer.nextInt();
                    if (resp2 == 1){
                        System.out.println("Prioridad 3 verde");
                        verde++;
                    }else if (resp2 == 2) {
                        System.out.println("¿Respira?");
                        resp2 = leer.nextInt();
                        if (resp2 == 1){
                            System.out.println("¿FR Mayor a 30?");
                            resp2 = leer.nextInt();
                            if(resp2 == 1){
                                System.out.println("Prioridad 1 rojo");
                                rojo++;
                            }else if(resp2 == 2){
                                System.out.println("¿Pulso radial?");
                                resp2 = leer.nextInt();
                                if(resp2 ==1){
                                    System.out.println("¿Esta orientado?");
                                    if(resp2 == 1){
                                        System.out.println("Prioridad 2 amarillo");
                                        amarillo++;
                                    }else if (resp2 == 2){
                                        System.out.println("Prioridad 1 rojo");
                                        rojo++;
                                    }
                                }else if (resp2 == 2){
                                    System.out.println("Controle hemorragia\n" +
                                            "Prioridad 1 rojo");
                                    rojo++;
                                }
                            }
                        }else if (resp2 == 2){
                            System.out.println("¿Al resposicionar respira?");
                            resp2 = leer.nextInt();
                            if(resp2 == 1){
                                System.out.println("Prioridad 1 rojo");
                                rojo++;
                            }else if(resp2 == 2){
                                System.out.println("Prioridad 0 negra");
                                negro++;
                            }
                        }
                    }
                    break;
                case "b":
                    System.out.println("- Negro: "+negro+".\n" +
                            "- Rojo: "+rojo+".\n" +
                            "- Amarillo: "+amarillo+".\n" +
                            "- Verde: "+verde+".");
                    break;
                default:
                    continuar = false;
            }
        }
    }
}