package ZmienneOperatoryZadania;

public class ZadaniePiate {
    public static void main(String[] args) {
        //Odpowiedz, co ujrzymy na ekranie dla poniższego kodu?

        int x = 5;
        boolean wynikPierwszy = x < 10 || x != 0 || x > -1;
        boolean wynikDrugi =  x < 10 && x != 0 && x > -1;
        System.out.println("Wynik pierwszy: " + wynikPierwszy);
        System.out.println("Wynik drugi: " + wynikDrugi);

        //Wynik pierwszy: true
        //Wynik drugi: true
    }
}
