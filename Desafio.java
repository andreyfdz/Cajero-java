import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String Name = "Andrey";
        String AccountType = "Debito";
        double Balance = 1599.99;
        int opcion = 0;

        System.out.println("**************");
        System.out.println("\nNombre del cliente: " + Name);
        System.out.println("El tipo de cuenta es: " + AccountType);
        System.out.println("Su saldo disponible es: " + Balance + "$");
        System.out.println("\n**************");

        String Menu = """
                *** Escriba el numero de la opcion deseada ***
                1 - Consultar Saldo 
                2 - Retirar
                3 - Depositar 
                9 - Salir 
                """;

        Scanner teclado = new Scanner(System.in);

        while (opcion != 9 ){
            System.out.println(Menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo de su cuenta es: " + Balance + "$");
                    break;
                case 2:
                    System.out.println("Cual es el valor que desea retirar?");
                    double ValueToWithdraw = teclado.nextDouble();
                    if (ValueToWithdraw > Balance){
                        System.out.println("Saldo insuficiente ");
                    } else {
                        Balance = Balance - ValueToWithdraw;
                        System.out.println("El saldo actualizado es: " + Balance + "$");
                    }
                    break;
                case 3:
                    System.out.println("Cual es el valor que desea depositar?");
                    double ValueToDeposit = teclado.nextDouble();
                    Balance = Balance + ValueToDeposit;
                    System.out.println("El saldo actualizado es: " + Balance + "$");
                    break;
                case 9:
                    System.out.println("Gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
