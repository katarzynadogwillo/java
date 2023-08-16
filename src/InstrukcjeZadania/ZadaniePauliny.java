package InstrukcjeZadania;

public class ZadaniePauliny {
    public static void main(String[] args) {
        //zadeklaruj dwie zmienne typu int. Przypisz im dowolne wartości całkowite.
        // Użyj instrukcji if do sprawdzenia, czy dzielenie modulo przez b daje w wyniku 0.
        // Wyświetl stosowny komunikat na ekranie.

        int a = 10;
        int b = 5;

        if (a % b != 0) {
            System.out.println("Ta liczba ma resztę");
        } else if (a % b == 0) {
            System.out.println("Ta liczba nie ma reszty");
        } else {
            System.out.println("Liczba jest równa zero");
        }

    }
}
