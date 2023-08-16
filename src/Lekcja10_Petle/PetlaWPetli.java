package Lekcja10_Petle;

public class PetlaWPetli {
    public static void main(String[] args) {
        int liczba = 0;
        int[][] tablica = new int [5][10];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                liczba++;
                tablica[i][j] = liczba;
                System.out.println("To jest druga pętla " + liczba++); //wypisze się 50 razy - druga pętla 10 pomnożona przez pierwszą pętlę 5
            }
        }

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(tablica[i][j] + " ");
            }
                System.out.println(); //zapisuje każde 10 liczb w nowych linijkach - wiersze i kolumny
        }
    }
}
