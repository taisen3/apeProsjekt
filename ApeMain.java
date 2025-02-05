import java.util.Scanner;
public class ApeMain {
    public static void main(String[] args) {
        Ape ape1 = new Ape();
        Scanner scanner = new Scanner(System.in); // nytt scanner objekt

        System.out.println("Skriv inn onsket streng: ");
        String minStreng = scanner.nextLine().toLowerCase(); // henter inn streng og setter til lower case

        String apeStreng = "";
        String besteStreng = "";
        long antBokstaver = 0L;

        long maxAntall = 1000000000000L; // 1 000 000 000 000
        // Satt til 2 147 483 647 forsøk (høyest antall int tall lovlig)
        // Kan endre fra int til Long for å øke taller (32bit til 64bit)


        System.out.println("Apekatt skriver, vennligst vent :)");
        int indeks = 0;
        int bTeller = 0;
        while (indeks < minStreng.length() && antBokstaver < maxAntall) {
            String bokstav = ape1.skriv();
            
            if (bokstav.equals(String.valueOf(minStreng.charAt(indeks)))) { // Ikke oversatt selv lol. Trengte chatGPT for denne :))
                apeStreng += bokstav;
                indeks++;
            }
            else {
                if (apeStreng.length() > (besteStreng.length())) {
                    besteStreng = apeStreng;
                }
            apeStreng = ""; // Restartert apeStreng
            indeks = 0;
            } 
            
            antBokstaver++; //Øker antall bokstaver skrevet (Simulerer totale streng)
            bTeller++;

            // Skriver ut en melding per 1 000 000 000 tastetrykk
            if (bTeller == 2000000000) {
                System.out.println("\n\n");
                System.out.println("Apekatt skriver fortsatt, takk for tålmodigheten :)");
                System.out.println("Nærmeste forsøk til nå: " + besteStreng);
                System.out.println("Antall tastetrykk: " + antBokstaver);

                bTeller = 0;
            }

        } // end of while lokke

        System.out.println(""); //linjeskift

        if (antBokstaver != maxAntall) {
            System.out.println("Apekatt fullførte oppdraget");
            System.out.println("Streng: " + apeStreng);
        }
        else {
            System.out.println("Apekatt fikk ikke til oppdraget :(");
            System.out.println("Beste streng: " + besteStreng);
        }
        System.out.println("Antall tastetrykk: " + antBokstaver);
    }
}
