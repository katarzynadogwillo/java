package lekcja10_petle;

public class BreakContinue {
    public static void main(String[] args) {
        int zmienna;
        for (zmienna = 1; zmienna <= 20; zmienna++) {
            if (zmienna >= 18) {
                //== 18 - pomija 18, bo  dodaliśmy wyjątek i instrukcji if, wykonuje warunek
                //<18 - wykonuje powyżej 18
                //>18 - wykonuje poniżej 18
                continue; //służy do pominięcia jakiegoś kroku
            }
            System.out.println("Zmienna continue: " + zmienna);
        }

        for (zmienna = 1; zmienna <= 20; zmienna++) {
            if (zmienna == 18) {
                break;
            }
            System.out.println("Zmienna break: " + zmienna);
        }
    }
}
