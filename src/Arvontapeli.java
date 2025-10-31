import java.util.Random;

//Random - numero 

public class Arvontapeli {
    public static void main(String[] args) {
        Random rand = new Random();

        // Arvotaan kolme numeroa väliltä 1-10
        int numero1 = rand.nextInt(10) + 1;
        int numero2 = rand.nextInt(10) + 1; 
        int numero3 = rand.nextInt(10) + 1;
        //koodi toimii myös ilman +1, mutta se voi antaa numeroksi myös 0 ja sitä me ei nyt haluta kun on 1-10 (0-9 arpoo numeron ja lisää 9:n 1 lisää)

        // Tulostetaan numerot
        System.out.println("Arvotut numerot: " + numero1 + ", " + numero2 + ", " + numero3);

        // Tarkistetaan, onko joku numeroista 7
        if (numero1 == 7 || numero2 == 7 || numero3 == 7) {
            System.out.println("Voitit!");
        } else {
            System.out.println("Hävisit.");
        }

        // Ohjelma päättyy tähän
        //eli ei tarvitse mitään muuta koodia
        //The end.

    
    }
}
