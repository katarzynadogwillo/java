package lekcja8_instrukcje_warunkowe;

public class InstrukcjaIf {
    public static void main(String[] args) {
        //conditional statements
        //instrukcje sprawdzające

        //kiedy elementy mają zostać wykorzystane tylko wtedy, gdy zostanie spełniony jakiś warunek


        if (false) { //w nawiasie () true lub false - wartość logiczna
            System.out.println("Warunek został spełniony");
        } //true - warunek zostaje spełniony, więc komenda powinna zostać wyświetlona, false - nie zostanie wyświetlony

        int wiek = 15;

        if (wiek >= 18) {
            System.out.println("Pozwól na zakup alkoholu"); //nie wyświetli się, bo wiek jest za mały, watunek nie został spełniony
        }

        int wiekDrugi = 30;

        if (wiekDrugi >= 18) {
            System.out.println("Pozwól na zakup alkoholu osobom, które skończyły 18 lat"); //wyświetli, bo wiek jest odpowiedni, warunek został spełniony
        }

        int wiekTrzeci = 20;
        if (wiekTrzeci >= 18) {
            System.out.println("Pozwól na sprzedaż");
        } else { //wykonuje się, gdy if nie zostanie spełniony
            System.out.println("Wyproś"); //sprzeda, bo osoba ma 18 lat
        }

        int wiekCzwarty = 12;
        if (wiekCzwarty >= 18) {
            System.out.println("Sprzedaj alkohol");
        } else {
            System.out.println("Nie sprzedawaj");//nie sprzeda, bo osoba nie ma 18 lat
        }

        //sprawdzenie większej ilości instrukcji

        int wiekPiaty = 15;
        boolean tata = false;
        boolean mama = true;

        if(wiekPiaty >= 18) {
            System.out.println("Sprzedaj alkohol");
        } else if(tata) {
            System.out.println("Sprzedaj");
        } else if(wiekPiaty < 18 && mama) { //nie trzeba pisać == true
            System.out.println("Sprzedaj alkohol mamie");
        } else {
            System.out.println("Broń Boże nie sprzedaj alkoholu");
        }
    }
}
