package lekcja10_petle;

public class PetleTablice {
    public static void main(String[] args) {
        int[] tablica = new int [10];
        //tablica [0] = 9;

        for(int i = 0; i <= 9; i++) { //przy tablicach często zmienną w pętli jest int i
            tablica[i] = i*2;
        }
        //System.out.println(tablica[0]);

        for(int i = 0; i <= 9; i++) {
            System.out.println("tablica " + i + ": " + tablica[i]);
        }

        //sprawdzenie ilości elementów w tablicy
        for(int i = 0; i <= tablica.length -1; i++) { //i <=tablica.length -1
            System.out.println(tablica[i]);
        }
        //lub
        for(int i = 0; i < tablica.length; i++) { //i < tablica.length
            System.out.println(tablica[i]);
        }

    }
}
