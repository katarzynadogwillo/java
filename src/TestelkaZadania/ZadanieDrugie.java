package TestelkaZadania;

public class ZadanieDrugie {
    public static void main(String[] args) {
//Napisz program, który na podstawie boku kwadratu obliczy jego pole i obwód.
// Pole i obwód powinny zostać wyświetlone na konsoli.
// Program powinien sprawdzić, czy wprowadzona długość boku jest dodatnia. Jeżeli jest, to powinien wykonać obliczenia i pokazać wynik.
// Jeżeli długość boku jest równa 0, powinien zostać wyświetlony komunikat "Długość boku nie może być równa 0".
// Jeżeli długość boku jest ujemna, powinien zostać wyświetlony komunikat "Długość boku nie może być ujemna".
        int a = -5;
        int poleKwadratu = a * a;
        int obwodKwadratu = 4 * a;

        if (a > 0) {

            System.out.println("Pole kwadratu to " + poleKwadratu + " , a obwód kwadratu to: " + obwodKwadratu);

        } else if (a==0) {
            System.out.println("Długość boku nie może być równa 0");

        } else {
            System.out.println("Dłogość boku nie może być ujemna");
        }
    }
}
