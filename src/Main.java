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
            opcion = teclado.nextInt();
        }


    }
}