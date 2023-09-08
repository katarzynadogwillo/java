package lekcja4_operatory;

public class OperatoryRelacyjne {
    public static void main(String[] args) {
        //relational operators

        //równe ==

        boolean wynikDzialania;
        wynikDzialania = 8 == 8;

        System.out.println("czy 8 jest równe 8? " + wynikDzialania); // dla sprawdzenia podwójny znak =, pojedynczy przypisuje zmienną

        boolean drugiWynik = 3 == 8;

        System.out.println("czy 3 jest równe 8? " + drugiWynik);

        //nierówne !=

        boolean trzeciWynik;
        trzeciWynik = 3 != 8;

        System.out.println("czy 3 jest inne niż 8? " + trzeciWynik);

        boolean czwartyWynik = 3 != 3;

        System.out.println("czy 3 jest inne niż 3? " + czwartyWynik);

        boolean piatyWynik;
        piatyWynik = 3 < 8;

        System.out.println("czy 3 jest mniejsze niż 8? " + piatyWynik);

        boolean szostyWynik = 3 > 8;

        System.out.println("czy 3 jest większe niż 8? " + szostyWynik);

        //mniejsze lub równe <=, większe lub równe >=

        boolean siodmyWynik;
        siodmyWynik = 4 <= 5;

        System.out.println("czy 4 jest mniejsze lub równe 5? " + siodmyWynik);

        boolean osmyWynik = 4 >= 5;
        System.out.println("czy 4 jest większe lub równe 5? " + osmyWynik);

        int a = 45;
        int b = 54;

        wynikDzialania = a == b;
        wynikDzialania = a != b;
        wynikDzialania = a < b;
        wynikDzialania = a > b;
        wynikDzialania = a >= b;
        wynikDzialania = a <= b;

        System.out.println("czy a jest równe b? " + wynikDzialania);
        System.out.println("czy a jest inne niż b? " + wynikDzialania);
        System.out.println("czy a jest mniejsze b? " + wynikDzialania);
        System.out.println("czy a jest większe b? " + wynikDzialania);
        System.out.println("czy a jest większe lub równe b? " + wynikDzialania);
        System.out.println("czy a jest mniejsze lub równe b? " + wynikDzialania);

    }
}
