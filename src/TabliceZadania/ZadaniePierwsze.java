package TabliceZadania;

public class ZadaniePierwsze {
    public static void main(String[] args) {
        //Uzupełnij tablicę typu int rozmiaru 5 dowolnymi wartościami.
        // Następnie zsumuj wszystkie elementy tej tablicy i wynik wypisz na ekran.
        // Sumowania dokonaj poprzez dodawanie elementów odwołując się do indeksów tablicy.

//        int[] tablica = new int[5];
//        tablica[0] = 11;
//        tablica[1] = 22;
//        tablica[2] = 33;
//        tablica[3] = 44;
//        tablica[4] = 55;

        //inaczej:
        int[] tablica = {5, 10, 15, 20, 25};
        int suma = tablica[0] + tablica[1] + tablica [2] + tablica[3] + tablica[4];

        System.out.println(suma);




    }
}
