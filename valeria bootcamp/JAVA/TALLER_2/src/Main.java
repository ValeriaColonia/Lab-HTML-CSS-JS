import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ejercicio 1
        System.out.print("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        int imcEntero = (int) imc;

        System.out.printf("IMC completo: %.2f%n", imc);
        System.out.println("IMC parte entera: " + imcEntero);

        // Ejercicio 2
        System.out.print("Pepito, ingresa tu edad: ");
        int edadPepito = scanner.nextInt();

        System.out.print("Juan, ingresa tu edad: ");
        int edadJuan = scanner.nextInt();

        System.out.println("Pepito es mayor que Juan: " + (edadPepito > edadJuan));
        System.out.println("Pepito es menor que Juan: " + (edadPepito < edadJuan));
        System.out.println("Pepito y Juan tienen la misma edad: " + (edadPepito == edadJuan));


        // Ejercicio 3
        System.out.print("Ingrese la edad de la primera persona: ");
        int edad1 = scanner.nextInt();

        System.out.print("Ingrese la edad de la segunda persona: ");
        int edad2 = scanner.nextInt();

        System.out.println("Ambas son mayores de 18 años: " + (edad1 > 18 && edad2 > 18));
        System.out.println("Ambas son menores de 30 años: " + (edad1 < 30 && edad2 < 30));
        System.out.println("Alguna es mayor de 50 años: " + (edad1 > 50 || edad2 > 50));

        scanner.close();

    }
}