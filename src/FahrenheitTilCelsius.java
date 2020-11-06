import java.util.Scanner;

//Refaktorering af FahrenheitToCelsius

public class FahrenheitTilCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Skriv grader i Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " er " + celsius + "i Celsius.");
    }
}
