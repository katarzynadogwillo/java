package Lekcja4_Operatory;

public class OperatoryArytmetyczne {
    public static void main(String[] args) {
        //arithmetic operators
        //dodawanie, odejmowanie, mnożenie, dzielenie, reszta

        //dodawanie = znak +
        System.out.println(2+2);

        //odejmowanie = znak -
        System.out.println(3-2);

        //mnożenie - znak *

        System.out.println(3*3);

        //dzielenie - znak /
        System.out.println(6/3);

        //sprawdzenie reszty z dzielenia - znak % - ile zostanie
        System.out.println(10%3);

        //korzystanie za pomocą zmiennych

        int a = 10;
        int b = 2;

        int dodawanie = a+b;
        System.out.println("Dodawanie: " + dodawanie);

        int odejmowanie = a-b;
        System.out.println("Odejmowanie: " + odejmowanie);

        int mnozenie = a*b;
        System.out.println("Mnożenie: " + mnozenie);

        int dzielenie = a/b;

        System.out.println("Dzielenie: " + dzielenie);

        int reszta = a%b;
        System.out.println("Reszta: " + reszta);

        //można aktualizować wartość zmiennych

        a+=b;  //to samo co a = a+b; //od teraz a wynosi 11
        System.out.println("Zaktualizowane dodawanie a : " + a);
        a-=b;
        System.out.println("Zaktualizowane odejmowanie a: " + a);
        a*=b;
        System.out.println("Zaktualizowane mnożenie a: " + a);
        a/=b;
        System.out.println("Zaktualizowane dzielenie a: " + a);
        a%=b;
        System.out.println("Zaktualizowana reszta a: " + a);

        //zwiększanie i zmniejszanie wartości zmiennej o 1
        //a = a+1;
        //a +=1;
        a++; //inkrementacja
        System.out.println("a++: " + a);

        //zmniejszanie wartości o 1
        //a = a-1;
        //a -=1;
        a--; //dekrementacja
        System.out.println("a--: " + a);

        //też ++a i --a, ale jest różnica






    }
}
