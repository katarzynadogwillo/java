package zmienne_operatory_zadania;

public class ZadanieSzoste {
    public static void main(String[] args) {
        //Przypisz wartość przekraczającą poza rozmiar zmiennej typu int.
        //Zobacz co się stanie i zastanów dlaczego. Spróbuj oszukać środowisko, aby nie wytykało Ci błędów :)

        int zmiennaInt = 1000000000;
        int wiekszyInt = zmiennaInt + zmiennaInt + zmiennaInt + zmiennaInt + zmiennaInt;
        int zaDuzyInt = wiekszyInt;

        System.out.println("Za duży int to: " + zaDuzyInt);
    }
}
