package lekcja10_petle;

public class ZadanieForWhile {
    public static void main(String[] args) {
        //Przerób pętlę z zadania trzeciego na pętlę while.
        //Napisz pętlę for, która wypisze na ekranie wszystkie liczby nieparzyste od -10 do 40.
//        int zmienna;
//        for (zmienna = -10; zmienna <= 40; zmienna++) {
//            if (zmienna % 2 != 0)
//                System.out.println("Zmienna for dla liczb: " + zmienna++);
//        }

        int oddNumber = -9;
        while(oddNumber < 41) {
            System.out.println(oddNumber);
            oddNumber += 2;
        }
    }
}

