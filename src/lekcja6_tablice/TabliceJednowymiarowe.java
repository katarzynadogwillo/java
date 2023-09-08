package lekcja6_tablice;

public class TabliceJednowymiarowe {
    public static void main(String[] args) {
        //arrays

        //na początku określamy jakiego typu ma być tablica - typ zmiennej itp.
        //[] - oznaczenie, że jest to tablica

        int[] tablica; //deklaracja tablicy
        tablica =  new int[10]; //[10] oznacza rozmiar tablicy
        //element tablicy = [indeks]
        tablica [0] = 5;
        tablica [1] = 1;
        tablica [2] = 15;
        tablica [3] = 155; //indeks w tablicy są numerowne od 0, tablica ma 11 ideksów, 155 zostało przypisane
        // do 4 ideksu

        //pobieranie wartości z tablicy
        System.out.println(tablica[3]);

        //inny sposób
        double[] tablicaDouble = new double[10];
        tablicaDouble [0] = 10.5;
        tablicaDouble [1] = 20.5;
        tablicaDouble [2] = 30.5;
        tablicaDouble [3] = 40.5;
        tablicaDouble [4] = 50.5;

        System.out.println(tablicaDouble[2]);

        //System.out.println(tablicaDouble[99]);

        char[] tablicaChar = new char[2];
        tablicaChar[0] = 8;
        tablicaChar[1] = 0;


        int[] nowaTablicaInt = {10, 20, 30, 40, 50};//zostanie utworzona tablica z 5 ideksami
        System.out.println("nowa tablica dla intów indeks 0: " + nowaTablicaInt[0]);
        System.out.println("nowa tablica dla intów indeks 1: " + nowaTablicaInt[1]);
        System.out.println("nowa tablica dla intów indeks 2: " + nowaTablicaInt[2]);
        System.out.println("nowa tablica dla intów indeks 3: " + nowaTablicaInt[3]);
        System.out.println("nowa tablica dla intów indeks 4: " + nowaTablicaInt[4]);

        //sprawdzenie rozmiaru tablicy

        System.out.println("Rozmiar tablicy to: " + nowaTablicaInt.length);









    }
}
