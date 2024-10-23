/*1. Zadatak – Zamjena najmanjeg i najvećeg broja u List-i
Zadatak:
Napiši program koji od korisnika traži unos niza brojeva i sprema ih u List-u.
Pronađi najmanji i najveći broj, zamijeni ih međusobno i ispiši novu List-u.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> listaBrojeva = new ArrayList<>();

        for (int i=0; i<5; i++) {
            System.out.print("Unesite broj: ");
            listaBrojeva.add(scanner.nextInt());
        }

        int minIndex = 0;
        int maxIndex = 0;
        Integer minBroj = listaBrojeva.get(0);
        Integer maxBroj = listaBrojeva.get(0);


        for (int i=0; i<listaBrojeva.size(); i++) {
            if (listaBrojeva.get(i) < minBroj) {
                minBroj = listaBrojeva.get(i);
                minIndex = i;
            }

            if (listaBrojeva.get(i) > maxBroj) {
                maxBroj = listaBrojeva.get(i);
                maxIndex = i;
            }
        }

        listaBrojeva.set(minIndex, maxBroj);
        listaBrojeva.set(maxIndex, minBroj);

        System.out.println("Nova izmijenjena lista: " + listaBrojeva);
    }
}
