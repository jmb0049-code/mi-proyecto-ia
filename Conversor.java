import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- CONVERSOR DE TEMPERATURA (Celsius a Fahrenheit) ---");
        System.out.print("Ingresa grados Celsius: ");
        
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        
        System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");
        sc.close();
    }
}