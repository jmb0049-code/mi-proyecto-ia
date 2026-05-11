import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- CONVERSOR ACTUALIZADO POR JOSE LUIS ---");
        System.out.print("Ingresa grados Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15; 
        System.out.println("Fahrenheit: " + fahrenheit + " | Kelvin: " + kelvin);
        sc.close();
    }
}