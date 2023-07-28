package InstrukcjeZadania;

public class ZadaniePierwsze {
    public static void main(String[] args) {
        //Sprawdź czy wpisana liczba jest parzysta czy nieparzysta. Wypisz odpowiedni komunikat na ekran.
        //(podpowiedź: jeżeli reszta z dzielenia przez 2 jest równa 0 to znaczy, że liczba jest parzysta).

        int liczba = 55;

        if (liczba % 2 == 0) {
            System.out.println("ta liczba jest parzysta");
        } else {
            System.out.println("ta liczba jest nieparzysta");
        }
    }
}


