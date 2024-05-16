import java.util.Scanner;

public class Cuenta {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre = "Esteban David Salas Cortina";
        String tipoDeCuenta = "Cuenta Corriente";
        double saldoDeCuenta = 2000.0;
        int opcion = 0;

        System.out.println("*********************************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta bancaria: " + tipoDeCuenta);
        System.out.println("Saldo disponible de cuenta: " + saldoDeCuenta + "$");
        System.out.println("\n*******************************************************");

        String menu = """
                --- Escriba el numero de la opción deseada ---
                1) Consultar saldo
                2) Retirar saldo
                3) Depositar saldo
                9) Salir
                """;

        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            //MENU DE OPCIONES CON SWITCH - CASE
            switch (opcion) {
                case 1:
                    System.out.println("El saldo actualizado es: " + saldoDeCuenta + "$");
                    break;

                case 2:
                    System.out.println("Ingrese el valor que desea retirar");
                    double valorRetirar = teclado.nextDouble();

                    if (saldoDeCuenta < valorRetirar){
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldoDeCuenta -= valorRetirar;
                        System.out.println("El saldo actualizado es: " + saldoDeCuenta + "$");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el valor que desea depositar");
                    double valorDepositar = teclado.nextDouble();

                    saldoDeCuenta += valorDepositar;
                    System.out.println("El saldo actualizado es: " + saldoDeCuenta + "$");
                    break;

                case 9:
                    System.out.println("Saliendo de la cuenta bancaria...");
                    System.out.println("Gracias por utilizar nuestros servicios");
                    break;

                default:
                    System.out.println("Opción no valida");
            }
        }

    }
}
