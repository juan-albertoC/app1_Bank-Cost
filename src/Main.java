import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //parte 1: variables para datos del cliente
        String nombre = "Juan Cuevas";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0; //Variable para opcion de menu del cliente



        System.out.println("**********************");
        System.out.println("\nNombre de cliente: " + nombre);
        System.out.println("\nTipo de cuenta: " + tipoDeCuenta);
        System.out.println("\nSaldo disponible: " + saldo + "$");
        System.out.println("\n**********************");

        //Parte 2: Menu de opciones con text block
        String menu = """
                *** Escriba el numero de la opcion deseada ***
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        //usuario digite una opcion por teclado
        Scanner teclado = new Scanner(System.in);
        //ciclo while para escoger opcion

        while(opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt(); // no proporcione un ciclo infinito, recibido por teclado

            //switch varias opciones del menu con sus metodos(Actualizar, Retirar, Consultar)
            switch(opcion){
                case 1:    //Consultar
                    System.out.println("El Saldo Actualizado es de: " + saldo + "$");
                    break;
                case 2:   //Retirar
                    System.out.println("Cual es el valor deseado a Retirar");
                    double valorARetirar = teclado.nextDouble();  //entrada de datos por teclado por el usuario
                    if (valorARetirar > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo = saldo - valorARetirar;
                        System.out.println("El saldo actualizado es: " + saldo);
                    }
                    break;
                case 3:    //Depositar
                    System.out.println("Cual es el valor deseado a Depositar");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    //saldo = saldo + valorADepositar;
                    System.out.println("El saldo actualizado es: " + saldo);
                    break;
                case 9:   //Salir
                    System.out.println("salir del programa, gracias");
                    break;
                default:
                    System.out.println("Opcion invalida, intenta de nuevo por favor!");
            }
        }


    }
}