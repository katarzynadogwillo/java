package PetleZadania;

public class ZadanieCzwarte {
    public static void main(String[] args) {
        //Utwórz tablicę rozmiaru 10 elementów i uzupełnij liczbami.
        // Wypisz wszystkie liczby z tej tablicy na ekran. Następnie wypisz wszystkie liczby od tyłu.

//        int[] tablica = {11, 54, 432, 65, 5, 3, 654, 8, 656, 100};
//        int i = 0;
//
//        for(i = 0; i < tablica.length; i++) {
//            System.out.print(tablica[i] + " ");
//
//        }
//
//        System.out.println();
//
//
//
//        for (i = tablica.length-1; i >= 0; i--) {
//            System.out.print(tablica[i] + " ");
//        }
//
//        System.out.println();

//to teraz dla zabawy zmodyfikuj to tak, żeby pętla utworzyła Ci tablicę z 10 liczbami, od 10 w górę, ale co 3 liczby


        int j = 0;

        for(j = 0; j >= 10; j+=3) {
            int[] nowaTablica = new int[10];

            System.out.print(nowaTablica[j] + " ");

        }




        //int[] tablica = {11, 54, 432, 65, 5, 3, 654, 8, 656, 100};
//        int i = 0;
//
//        for(i = 0; i < tablica.length; i++) {
//            System.out.print(tablica[i] + " ");
//
//        }
    }
}




