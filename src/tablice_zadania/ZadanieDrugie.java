package tablice_zadania;

public class ZadanieDrugie {
    public static void main(String[] args) {
        //Utwórz tablicę dwuwymiarową typu double wymiaru 3x5 i także wypełnij dowolnymi wartościami.
        // Tym razem zsumuj elementy z każdego wiersza osobno i wypisz wynik na ekran.

        double[][] tablica = {{1.1, 1.2, 1.3, 1.4, 1.5}, {2.1, 2.2, 2.3, 2.4, 2.5}, {3.1, 3.2, 3.3, 3.4, 3.5}};

        double sumaPierwsza = tablica[0][0] + tablica[0][1] + tablica[0][2] + tablica[0][3] + tablica[0][4];
        System.out.println("Suma pierwsza = " + sumaPierwsza);

        double sumaDruga = tablica[1][0] + tablica[1][1] + tablica[1][2] + tablica[1][3] + tablica[1][4];
        System.out.println("Suma druga = " + sumaDruga);

        double sumaTrzecia = tablica[2][0] + tablica[2][1] + tablica[2][2] + tablica[2][3] + tablica[2][4];
        System.out.println("Suma trzecia = " + sumaTrzecia);
    }
}
