package PetleZadania;

public class ZadaniePiate {
    public static void main(String[] args) {
        //Wykorzystując tablicę z poprzedniego zadania, oblicz sumę wszystkich jej elementów.

        int[] tablica = {11, 54, 432, 65, 5, 3, 654, 8, 656, 100};
        int suma = 0;

        for (int i = 0; i < tablica.length; i++) {
            suma = suma + tablica[i];
        }
        System.out.println(suma);
    }
}
