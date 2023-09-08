package lekcja10_petle;

public class ZadanieWhile {
    public static void main(String[] args) {
        //Napisz pętlę while, która wypisze na ekranie wszystkie liczby od 10 do 20 włącznie.

        int liczba = 10;
        while(liczba >= 10 && liczba <= 20) {
            System.out.println("Wybrane liczby to: " + liczba);
            liczba++;
        }
//może być też
       //public class Exercise2 {
        //    public static void main(String[] args) {
        //        int number = 10;
        //        while(number < 21) {
        //            System.out.println(number);
        //            number++;
        //        }
        //    }
        //}
        //}

    }
}
