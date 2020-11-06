import java.util.Scanner;
//Refaktorering af DisplayTime

public class VisTid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Spørg brugeren om input
        System.out.print("Skriv et helt tal i sekunder: ");
        int sekunder = input.nextInt();
        int minutter = sekunder/60; //Find minutter fra sekunder
        int resterendeSekunder = sekunder % 60; //Find resterende sekunder
        System.out.println(sekunder + " sekunder er " + minutter + " minutter og " + resterendeSekunder + " sekunder.");
    }
}
