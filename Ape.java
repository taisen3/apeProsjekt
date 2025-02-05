import java.util.Random;

public class Ape {
    private String[] tastatur;
    private Random random;

    // konstruktør:
    public Ape() {
        this.tastatur = new String[]{" ", "q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m"};
        this.random = new Random(); // Seed for tilfeldige tall
    }

    // Gir oss et tastetrykk
    public String skriv() {
        int muligeBokstaver = this.tastatur.length;
        int tilfeldigTall = random.nextInt(muligeBokstaver);
        String tastetrykk = this.tastatur[tilfeldigTall];
        return tastetrykk;
    }
}
