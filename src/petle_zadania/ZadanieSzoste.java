package petle_zadania;

public class ZadanieSzoste {
    public static void main(String[] args) {
        //Napisz program, który będzie obliczał silnię z nieujemnej liczby tj.
        // jeżeli podamy liczbę 5, to zostanie obliczona 5! (wykrzyknik to znak silni). Obliczamy to w następujący sposób:
        //5! = 5 * 4 * 3 * 2 * 1 = 120.
        //Uważaj, bo silnia kolejnych liczb bardzo szybko rośnie i łatwo wyjść poza rozmiar typu int.

        int liczba = 5; // podaj liczbę, dla której chcesz obliczyć silnię
        long silnia = 1; // zmienna, która będzie przechowywać wynik
        for (int i = 1; i <= liczba; i++) { // pętla, która wykonuje się od 1 do liczby
            silnia = silnia * i; // mnożymy silnię przez kolejną liczbę
        }
        System.out.println("Silnia z " + liczba + " to " + silnia); // wyświetlamy wynik
    }
}



