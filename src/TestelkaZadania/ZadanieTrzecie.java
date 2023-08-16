package TestelkaZadania;

public class ZadanieTrzecie {
    public static void main(String[] args) {
        //Napisz program, który podaną liczbę zamieni na tekst i go wyświetli zgodnie z poniższym wzorem:
        //
        //1 – Dzisiaj jest poniedziałek
        //
        //2 – Dzisiaj jest wtorek
        //
        //3 – Dzisiaj jest środa
        //
        //4 – Dzisiaj jest czwartek
        //
        //5 – Dzisiaj jest piątek
        //
        //6 – Dzisiaj jest weekend
        //
        //7 – Dzisiaj jest weekend
        //
        //Upewnij się też, że podana liczba jest z przedziału <1; 7>.

        int zmienna = 1;

        switch(zmienna) {
            case 1:
                System.out.println("Dzisiaj jest poniedziałek");
            case 2:
                System.out.println("Dzisiaj jest wtorek");
            case 3:
                System.out.println("Dzisiaj jest środa");
            case 4:
                System.out.println("Dzisiaj jest czwartek");
            case 5:
                System.out.println("Dzisiaj jest piątek");
            case 6:
                System.out.println("Dzisiaj jest weekend");
            case 7:
                System.out.println("Dzisiaj jest weekend");
            break;
            default:
                System.out.println("Dzisiaj jest świątek");


        }

    }
}