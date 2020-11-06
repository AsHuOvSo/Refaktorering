import java.util.Scanner;

//Refaktorering af ComputeLoan

public class UdregnLaan {
    public static void main(String[] args) {
        // Lav en Scanner
        Scanner input = new Scanner(System.in);

        // indtast årlig rente
        System.out.print("indskriv årlig rente i procent, f.eks. 8.25: ");
        double paRente = input.nextDouble();

        // find månedlig rente
        double maanedligRente = paRente / 1200;

        // Indtast antallet af år
        System.out.print(
                "indtast antallet af år i hele tal, f.eks. 5: ");
        int antalAar = input.nextInt();

        // indtast lånets størrelse
        System.out.print("Eindtast lånets størrelse, f.eks. 120000.95: ");
        double laanStorrelse = input.nextDouble();

        // udregn afdrag
        double afdrag = laanStorrelse * maanedligRente / (1
                - 1 / Math.pow(1 + maanedligRente, antalAar * 12));
        double betalingIAlt = afdrag * antalAar * 12;

        // vis resultat
        System.out.println("The monthly payment is $" +
                (int)(afdrag * 100) / 100.0);
        System.out.println("The total payment is $" +
                (int)(betalingIAlt * 100) / 100.0);



    }
}
