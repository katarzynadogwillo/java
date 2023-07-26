package ZadaniaJava;

public class DefiniowanieZmiennych {
    public static void main(String[] args) {
        //Napisz program, w którym zadeklarujesz kilka zmiennych finalnych,
        // lub zmiennych różnych typów o dowolnych nazwach, a następnie wyświetlisz je w kolejnych wierszach.
        //W tym samym programie zadeklaruj cztery zmienne typu String.
        // Trzy z nich zainicjuj jakimiś wyrazami, a czwartemu przypisz ciąg znaków utworzony
        // z połączenia trzech wcześniejszych zmiennych. Następnie wyświetl czwartą zmienną na ekranie.
        //Przy użyciu metody substring wyświetl na ekranie dwa pierwsze wyrazy wykorzystując
        // odwołując się wyłącznie do czwartej zmiennej typu String.

        int finalnyInt = 5;
        double finalnyDouble = 3.14;
        final char finalnyChar = 'a';
        final byte finalnyByte = 24;
        long finalnyLong = 23456789098765l;
        final float finalnyFloat = -23456789f;

        System.out.println(finalnyInt);
        System.out.println(finalnyDouble);
        System.out.println(finalnyChar);
        System.out.println(finalnyByte);
        System.out.println(finalnyLong);
        System.out.println(finalnyFloat);


        String przedstawienie = "Gacek";
        String gatunek = " pies";
        String rasa = " mieszaniec";
        String GacekLiczbowo = przedstawienie + gatunek + rasa;

        System.out.println("Oto Gacek w liczbach - wiek, ilość karmy i to, ile naprawdę chciałby karmy: " + GacekLiczbowo);

        String mojSubstring = GacekLiczbowo.substring(1,5);
        System.out.println(mojSubstring);

    }
}
