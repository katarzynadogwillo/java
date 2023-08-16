package TestelkaZadania;

public class ZadanieCzwarte {
    public static void main(String[] args) {
        int zmienna = 6;


        if (zmienna >=2 && zmienna <= 8) {
            switch(zmienna) {
                case 1:
                    System.out.println("Jeden");
                    break;
                case 2:
                    System.out.println("Dwa");
                    break;
                case 3:
                    System.out.println("Trzy");
                    break;
                case 4:
                    System.out.println("Cztery");
                    break;
                case 5:
                    System.out.println("Pięć");
                    break;
                case 6:
                    System.out.println("Sześć");
                    break;
                case 7:
                    System.out.println("Siedem");
                    break;
                case 8:
                    System.out.println("Osiem");
                    break;
                case 9:
                    System.out.println("Dziewięć");
                    break;

        }

    } else {
            System.out.println("To jest liczba dwucyfrowa lub ujemna");
        }
    //Napisz program, który podaną jednocyfrową nieujemną liczbę całkowitą zapisze słownie.
    // Przykład: jeżeli program otrzyma liczbę 2, powinien na konsoli wyświetlić “dwa”.
    // Program powinien także upewnić się, że liczba jest jednocyfrowa i nieujemna. Zakładamy, że liczba zawsze będzie całkowita.



    }
}

//najlepiej tablica
//public class Main {
//    public static void main(String[] args) {
//        int number = 8;
//
//        String[] words = {"zero", "jeden", "dwa", "trzy", "cztery",
//                "pięć", "sześć", "siedem", "osiem", "dziewięć"};
//
//        if (number >= 0 && number < 10) {
//            String numberInWords = words[number];
//            System.out.println("Podana liczba to " + numberInWords);
//        } else {
//            System.out.println("Wprowadzona liczba jest nieprawidłowa.");
//        }
//    }
//}
