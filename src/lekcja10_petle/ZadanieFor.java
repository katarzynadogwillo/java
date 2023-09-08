package lekcja10_petle;

public class ZadanieFor {
    public static void main(String[] args) {
        //Napisz pętlę for, która wypisze na ekranie wszystkie liczby nieparzyste od -10 do 40.

        int zmienna;
        for (zmienna = -10; zmienna <= 40; zmienna++) {
            if (zmienna % 2 != 0)
            System.out.println("Zmienna for dla liczb: " + zmienna++);
        }
    }
}
