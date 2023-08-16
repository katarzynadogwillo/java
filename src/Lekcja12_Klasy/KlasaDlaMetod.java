package Lekcja12_Klasy;

public class KlasaDlaMetod {


    //metoda void nie zwraca wyników
    //metoda musi określić, jaki typ chcemy zwracać
    //typZwracany nazwaMetody(parametry) {
    //}
    void metodaKtoraNicNieZwraca() {
        System.out.println("Wartość wypisana z metody");
    }

    void metodaKtoraPrzyjmujeArgument(int liczba) { //() - jakiego typu argumenty chcę przyjmować, np. int + nazwa = int suma
        System.out.println(liczba);
    }

    void metodaZInkrementacja(int inkrementacja) {
        inkrementacja++;
        System.out.println(inkrementacja);
    }

    //liczba, inkrementacja to parametry, bo będą gdzieś przekazywane - do metody Metoda.
    // Wtedy zostają wykorzystane i zamieniają się w argument

    void metodaZKilkomaParametrami(int jeden, char dwa) { //po przecinku, mogą być różne typy
        System.out.println("pierwszy znak: " + jeden + ", drugi znak: " + dwa);
    }

    void metodaZPetla(boolean czyPokazac, int cyfra) {
        if (czyPokazac) {
            System.out.println("Wypisz: " + cyfra);
        } else {
            System.out.println("Nie wypisuj");
        }
    }

        //stworzenie metody, która będzie zwracać wyniki!!!!!!!

        //typ zmiennej + zmienna (parametr/y)

        int dodawanie (int a, int b) { //zamiast void
        int wynik = a + b;
            //System.out.println("Wynik dodawania to: " + wynik);
            return wynik; // należy dodać return + zmienną - zwróć ten wynik
    }

    double liczbaZmiennoprzecinkowa (double przecinek, double przecinek2) {
        double liczbyDodane = przecinek + przecinek2;
        liczbyDodane++;
        return liczbyDodane;
    }

    double zmiennoprzecinkowa2 (double liczba) {
        double wynik = liczba + 2.22;
        return wynik;
    }

    //negowanie booleana - zmiana wartości (np. true na false)

    boolean bool (boolean wartosc) {
        return !wartosc;
    }

    int wartoscLogiczna (boolean czyZwrocic, int liczba) {
        if (czyZwrocic) {
            return liczba;
        } else {
            return 0; //wartość zawsze zgodna z typem zmiennej
        }


    }

}



