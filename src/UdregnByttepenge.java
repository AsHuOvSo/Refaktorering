import java.util.Scanner;

//Fefaktorering af ComputeChange

public class UdregnByttepenge {
    public static void main(String[] args) {
        // Lav en Scanner
        Scanner input = new Scanner(System.in);

        // Få beløbet
        System.out.print(
                "Indtast et beløb, f.eks. 11.56: ");
        double belob = input.nextDouble();

        int resterende = (int) (belob * 100);

        // Find the number of one dollars
        int antalletAfDollars = resterende / 100;
        resterende = resterende % 100;

        // Find the number of quarters in the remaining amount
        int antalletAfQuarters = resterende / 25;
        resterende = resterende % 25;

        // Find the number of dimes in the remaining amount
        int antalletAfDimes = resterende / 10;
        resterende = resterende % 10;

        // Find the number of nickels in the remaining amount
        int antalletAfNickels = resterende / 5;
        resterende = resterende % 5;

        // Find the number of pennies in the remaining amount
        int antalletAfPennies = resterende;

        // Display results
        System.out.println("Dit beløb " + belob + " indeholder");
        System.out.println("    " + antalletAfDollars + " dollars");
        System.out.println("    " + antalletAfQuarters + " quarters ");
        System.out.println("    " + antalletAfDimes + " dimes");
        System.out.println("    " + antalletAfNickels + " nickels");
        System.out.println("    " + antalletAfPennies + " pennies");
    }
}
