import java.util.Scanner;

//Refaktorering af ShowCurrentTime

public class VisNuTid {
    public static void main(String[] args) {
        //Få tiden i millisekunder fra d. 1. januar 1970
        long millisekunderAlt = System.currentTimeMillis();
        long sekunderAlt = millisekunderAlt/1000;
        long nuvaerendeSekunder = sekunderAlt%60;
        long minutterAlt = sekunderAlt/60;
        long nuvaerendeMinutter = minutterAlt%60;
        long timerAlt = minutterAlt/60;
        long nuvaerendeTimer = timerAlt%24;
        System.out.println("Nuværende tid er: " + nuvaerendeTimer + ":" + nuvaerendeMinutter + ":" + nuvaerendeSekunder + " GMT");
    }
}
