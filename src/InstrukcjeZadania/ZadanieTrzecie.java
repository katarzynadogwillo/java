package InstrukcjeZadania;

public class ZadanieTrzecie {
    public static void main(String[] args) {
        double liczba1 = 456.87;
        double liczba2 = 56.09;

        char znak = '/';
        double wynik = 0;

        switch (znak) {
            case '+':
                wynik = liczba1 + liczba2;
                break;
            case '-':
                wynik = liczba1 - liczba2;
                break;
            case '*':
                wynik = liczba1 * liczba2;
                break;
            case '/':
                wynik = liczba1 / liczba2;
                break;
            default:
                System.out.println("działanie jest niepoprawne");
        }
        System.out.println("Wynik działania to: " + wynik);


        //Napisz bardzo prosty kalkulator. Niech potrafi dodawać, odejmować, mnożyć i dzielić. Co więcej,
        // niech będzie na tyle prostym kalkulatorem, że po podaniu  dwóch liczb, obliczy wynik i zakończy swoje działanie.
        //Dobrze jakbyś wykorzystał do tego instrukcję "switch" w celu jej przećwiczenia, chociaż na początek możesz spróbować to zrobić "if'em".
        //(podpowiedź: będziesz potrzebował co najmniej trzech zmiennych - dwie zmienne do przechowywania liczb oraz trzecia zmienna
        //jako znak operacji np. '+' dla dodawania)
        // (podpowiedź 2: znak operacji możesz przechowywać w zmiennej typu char)


    }
}



