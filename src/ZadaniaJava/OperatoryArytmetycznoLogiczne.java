package ZadaniaJava;

public class OperatoryArytmetycznoLogiczne {
    public static void main(String[] args) {
        //Napisz prosty kalkulator, w którym stworzysz 3 zmienne typu double o nazwach a, b, c.
        // Do każdej z nich przypisz dowolną wartość. Wypróbuj wszystkie operatory matematyczne obliczając wynik działań:
        //(a + b) * c
        //a - b / c
        //Następnie użyj operatorów inkrementacji i zwiększ wszystkie zmienne o 1.
        //Teraz wyświetl wynik następujących zdań logicznych:
        //czy (a + b) > c?
        //czy a jest równe b?
        //Przedstaw wyniki w konsoli.

        double a = 3.14;
        double b = 7.11;
        double c = 6.45;

        double wynik = (a + b) * c;
        System.out.println("Pierwsze działanie: " + wynik);
        double drugiWynik = a - b / c;
        System.out.println("Drugie działanie: " + drugiWynik);

        a++;
        b++;
        c++;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        boolean zadaniePierwsze = (a + b) > c;
        boolean zadanieDrugie = a == b;

        System.out.println(zadaniePierwsze);
        System.out.println(zadanieDrugie);

    }
}
