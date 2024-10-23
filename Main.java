

/*/*
2. Zadatak. Od korisnika trazite unos 10 brojeva te u listi pronadite koji broj se najvise puta ponavlja.
Za rezultat ispisite broj koji se najvise puta ponavljao u listi te koliko se puta pojavio u listi.
Treba uzeti u obriz da su svi brojevi razliciti.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> listaBrojeva = new ArrayList<>();

        int najcesciBroj = 0;
        int najvisePonavljanja = 0;

        System.out.println("Unesite 10 brojeva:");

        for (int i=0; i<10; i++) {
            System.out.print("Unesite " + (i + 1) + " broj: ");
            int broj = scanner.nextInt();


            if (!listaBrojeva.contains(broj)) {
                listaBrojeva.add(broj);
            } else {
                System.out.println("Uneseni broj već postoji. Unesite drugi broj.");
                i--;
            }
        }

        for (int i = 0; i < listaBrojeva.size(); i++) {
            int trenutniBroj = listaBrojeva.get(i);
            int brojac = 1;

            for (int j=0; j<listaBrojeva.size(); j++) {
                if (i!=j && trenutniBroj == listaBrojeva.get(j)) {
                    brojac++;

                }
            }
        }

        if (najvisePonavljanja > 1) {
            System.out.println("Broj s najviše ponavljanja: " + najcesciBroj);
            System.out.println("Broj se ponovio: " + najvisePonavljanja);

        } else {
            System.out.println("Svi uneseni brojevi su različiti.");
        }
    }
}