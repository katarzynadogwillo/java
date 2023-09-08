package lekcja12_klasy;

public class Metody {
    public static void main(String[] args) { //dzięki temu tworzy się obiekt

        KlasaDlaMetod nazwaObiektu = new KlasaDlaMetod();
        nazwaObiektu.metodaKtoraNicNieZwraca();

        nazwaObiektu.metodaKtoraPrzyjmujeArgument(5); //bo int liczba w klasie KlasaDlaMetod

        nazwaObiektu.metodaZInkrementacja(7); //wyświetli się 8 przez inkrementację

        //5, 7 - argumenty; parametry liczba i inkrementacja z klasy KlasaDlaMetod,
        // które przez to, że zostały już wykorzystane zamieniły się w argumenty

        //czyli: jeśli parametry z jednej klasy zostają wykorzystane w drugiej klasie, zamieniają się w arugmenty

        nazwaObiektu.metodaZKilkomaParametrami(4, 'a');

        nazwaObiektu.metodaZPetla(true, 10);
        nazwaObiektu.metodaZPetla(false, 100);

        //zwrócenie wyniku za pomocą return

        int dodawanie = nazwaObiektu.dodawanie(5, 25);
        System.out.println("Wynik dodawania w klasie Metody: " + dodawanie);

        double liczbaZmiennoprzecinkowa = nazwaObiektu.liczbaZmiennoprzecinkowa(2.22, 2.22);
        System.out.println("Wynik dodawania liczb zmiennoprzecinkowych: " + liczbaZmiennoprzecinkowa);

        double wynik = nazwaObiektu.zmiennoprzecinkowa2(2.22);
        System.out.println(wynik);

        //negacja booleana - zmiana wartości (np. true na false)
        //nazwaObiektu.bool(false);
        System.out.println(nazwaObiektu.bool(false));
    }
}
