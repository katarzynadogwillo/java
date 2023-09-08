package lekcja6_tablice;

public class TabliceWielowymiarowe {
    public static void main(String[] args) {
        //wiersze, kolumny itd., najbardziej popularne są dwuwymiarowe

        //dla tablicy jednowymiarowej jeden [], dla dwuwymiarowej dwa [][] itd.
        int[][] tablicaDwuwymiarowa = new int[10][10]; //po 10 indeksów
        tablicaDwuwymiarowa[0][1] = 123;//najpierw wiersz = 0, później kolumna = 1
        tablicaDwuwymiarowa[4][8] = 190;
        System.out.println(tablicaDwuwymiarowa[4][8]);

        int[][] tablicaDwuwymiarowaDwa = {{1, 2, 3}, {4, 5, 6}}; //pierwsze {} - jeden wiersz, trzy kolumny; drugie {} - drugi wiersz, trzy kolumny

        System.out.println("pierwszy wiersz [0][0]: " + tablicaDwuwymiarowaDwa[0][0]);
        System.out.println("drugi wiersz [0][1]: " + tablicaDwuwymiarowaDwa[0][1]);
        System.out.println("trzeci wiersz [1][2]: " + tablicaDwuwymiarowaDwa[1][2]);

        //sprawdzenie rozmiaru tablicy

        System.out.println(tablicaDwuwymiarowaDwa.length); // 2 - bo tablica ma tyle wierszy
        System.out.println(tablicaDwuwymiarowaDwa[1].length); // po dodaniu [] sprawdza wielkość kolumny

        System.out.println(tablicaDwuwymiarowa.length); // 10 - bo tablica ma tyle wierszy
        System.out.println(tablicaDwuwymiarowa[9].length); // po dodaniu [] sprawdza wielkość kolumny

        //tablice trójwymiarowe

        int [][][] tablicaTrojwymiarowa = new int[15][20][25];

    }
}
