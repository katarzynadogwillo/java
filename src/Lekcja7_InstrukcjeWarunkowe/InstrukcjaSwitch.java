package Lekcja7_InstrukcjeWarunkowe;

public class InstrukcjaSwitch {
    public static void main(String[] args) {
        //instrukcja wielokrotnego wyboru

        //działa trochę jak if, ale jest kompletnie inna

        //w zależności od tego, czy dany przypadek jest spełniony, instrukcja jest wykonana lub nie


        int zmienna = 1;
        switch(zmienna) { //w przypadku instrukcji w {} znajdują się przypadki do rozważenia
            case 1: //słowo kluczowe case + wartość zmiennej (1) + : + dalsze instrukcje
                System.out.println("Jeden"); //jeśli zmienna = 1, wyświetli się na ekranie
            case 2:
                System.out.println("Dwa");
            case 3:
                System.out.println("Trzy"); //wyświetlą się wszystkie instrukcje

        }

        //wyświetlanie tylko jednego casea na ekran
        int zmiennaDruga = 1;
        switch(zmiennaDruga) {
            case 1:
                System.out.println("Jedynka");
            case 2:
                System.out.println("Dwójka");
                break;//przerywa działanie switcha, żaden pozostały element nie zostanie wykonany - wyświetli się tylko Jedynka i Dwójka
            case 3:
                System.out.println("Trójka");
        }

        //wyświetlanie tylko jednego casea na ekran
        int zmiennaTrzecia = 5;
        switch(zmiennaTrzecia) {
            case 1:
                System.out.println("Jedyneczka");
            case 2:
                System.out.println("Dwójeczka");
            case 3:
                System.out.println("Trójeczka");
                break;
            default: //odpowiednik if-else
                System.out.println("Nie spełniono żadnego przypadku");//domyślnie na końcu nie piszemy breaka, ale jaky był np. przed case 3,
                // wyświetliłby się inaczej - wtedy trzeba dopisać

            //typ zmiennej musi pasować do typu w casie, np. int = 6, case 1:, char = 'a', case 'a'

                char zmiennaChar = 'b';
                switch (zmiennaChar) {
                    case 'a':
                        System.out.println("to jest a");
                        break;
                    case 'b':
                        System.out.println("to jest b");
                        break;
                    default:
                        System.out.println("to jest inna litera");
                }


        }


    }
}
