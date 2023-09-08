package lekcja3_zmienne;

public class KonwertowanieTypowProstych {
    public static void main(String[] args) {
        //konwertowanie - przełożenie jednego typu zmiennej na drugi, np. inta na doubla

        int i = 60;
        double d = 34;

        System.out.println(i / d); // zostało przekonwertowane, wynik będzie w doublu - za mało bytów

        double d2 = i;
//        int i2 = d; //i został skonwertowany na doubla, ale i2 nie może być skonwertowany na d

        //przy liczbach zmiennoprzecinkowych można konwertować tylko floaty na double

        byte Byte = 100;
        int i2 = Byte; //rzutowanie niejawne
//        Byte = i2; // nie zadziała, bo int jest szerszy niż byte

        float Float = 123.45f;
        d2 = (double) Float; //rzutowanie jawne
//        Float = d2; // nie zadziała, bo float jest szerszy od doubla


        //int automatycznie konwertuje się na doubla - konwertowanie rozszerzające, np. 2 na 2.0
        //typy muszą być kompatybilne ze sobą
        //konwertujemy gdy chcemy zmienić rodzaj zmiennej, np. inta na longa, floata na doubla

        //konwertowanie jawne - rzutowanie - należy napisać w nawiasie co na co chcemy zmienić
        //konwertowanie niejawne - nie trzeba pisać co na co chcemy zmienić

        //int -> double
        //byte -> int
        //double -> float

        //W drugą stronę - używamy konwestowania jawnego - rzutowania
        //zamieszczamy typ zmiennej, na którą chcemy przekonwertować przed nazwą drugiej zmiennej
        int drugaZmiennaInt = 456;
        byte drugaZmiennaByte = (byte) drugaZmiennaInt;

        long zmiennaLong = 123l;
        int zmiennaInt = (int) zmiennaLong;

        long drugaZmiennaLong = 123456789045l;



    }
}
