package ZmienneOperatoryZadania;

public class ZadanieCzwarte {
    public static void main(String[] args) {
        //Podaj dowolną liczbę typu całkowitego. Następnie oblicz wynik dzielenia oraz resztę z
        // dzielenia przez liczby 2, 3 oraz 11. Zobacz czy wyniki zgadzają się z Twoimi oczekiwaniami.

        int a = 45;
        int liczba2 = 2;
        int liczba3 = 3;
        int liczba11 = 11;

        int b = a/liczba2;
        int c = a/liczba3;
        double d = a/liczba11;

        System.out.println("Wynik z dzielenia przez 2: " + b);
        System.out.println("Wynik z dzielenia przez 3: " + c);
        System.out.println("Wynik z dzielenia przez 11: " + d);

        int e = a%liczba2;
        int f = a%liczba3;
        int g = a%liczba11;

        System.out.println("Reszta z dzielenia przez 2: " + e);
        System.out.println("Reszta z dzielenia przez 3: " + f);
        System.out.println("Reszta z dzielenia przez 11: " + g);

        //lepiej:
        //int liczba = 5;
        //int wynikDzielenia;
        //int wynikReszty;
        //wynikDzielenia = liczba/2;
        //wynikReszty = liczba%2;
        //sout
    }
}
