package lekcja3_zmienne;

public class TypyProste {
    public static void main(String[] args) {
        //primitive types

        //liczby całkowite -

        byte zmiennaByte;
        zmiennaByte = 10;

        byte drugaZmiennaByte = 20;

        System.out.println(zmiennaByte + drugaZmiennaByte);
        System.out.println("Byte: " + zmiennaByte);
        System.out.println("Byte: " + drugaZmiennaByte);
        System.out.println("Byte zakres od " + Byte.MIN_VALUE + " " + "do " + Byte.MAX_VALUE);

        short zmiennaShort;
        zmiennaShort = 200;

        short drugaZmiennaShort = 220;

        System.out.println("Short: " + zmiennaShort);
        System.out.println("Short: " + drugaZmiennaShort);
        System.out.println("Short zakres od " + Short.MIN_VALUE + " " + "do " + Short.MAX_VALUE);

        int zmiennaInt;
        zmiennaInt = 1000000;

        int drugaZmiennaInt = 2000000;

        System.out.println("Int: " + zmiennaInt);
        System.out.println("Int: " + drugaZmiennaInt);
        System.out.println("Int zakres od " + Integer.MIN_VALUE + " " + "do " + Integer.MAX_VALUE);

        //long - największa zmienna

        long zmiennaLong;
        zmiennaLong = 100000000000000000L; //trzeba dopisać L na końcu

        long drugaZmiennaLong = 2000000000000000000L;

        System.out.println("Long: " + zmiennaLong);
        System.out.println("Long: " + drugaZmiennaLong);
        System.out.println("Long zakres od " + Long.MIN_VALUE + " " + "do " + Long.MAX_VALUE);

        //liczby zmiennoprzecinkowe

        float zmiennaFloat;
        zmiennaFloat = 15.55F; //trzeba dopisać F na końcu

        float drugaZmiennaFloat = 25.55F;

        System.out.println("Float: " + zmiennaFloat);
        System.out.println("Float: " + drugaZmiennaFloat);
        System.out.println("Float zakres od " + Float.MIN_VALUE + " " + "do " + Float.MAX_VALUE);

        double zmiennaDouble;
        zmiennaDouble = 12.34;

        double drugaZmiennaDouble = 56.78;

        System.out.println("Double: " + zmiennaDouble);
        System.out.println("Double: " + drugaZmiennaDouble);
        System.out.println("Double zakres od " + Double.MIN_VALUE + " " + "do " + Double.MAX_VALUE);

        //w doublu mieści się więcej miejsc po przecinku

        //pojedyncze znaki - char

        char zmiennaChar;
        zmiennaChar = 'A';

        char drugaZmiennaChar = '!'; //mogą być dowolne znaki, litery, cyfry
        System.out.println("Char: " + zmiennaChar);
        System.out.println("Char: " + drugaZmiennaChar);

        //wartości logiczne

        boolean zmiennaBoolean;
        zmiennaBoolean = true;

        boolean drugaZmiennaBoolean = false;

        System.out.println("Boolean: " + zmiennaBoolean);
        System.out.println("Boolean: " + drugaZmiennaBoolean);

        int zmiennaPierwsza = 78, zmiennaDruga, zmiennaTrzecia = 10; // nieczytelny zapis
    }
}

