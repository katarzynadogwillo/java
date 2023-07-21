package Lekcja4_Operatory;

public class OperatoryLogiczne {
    public static void main(String[] args) {
        //logical operators - AND i OR + negacja !

        //koniunkcje - AND - muszą być spełnione dwa warunki
        //operator logiczny AND = &&
        int wiek = 20;
        System.out.println(wiek >= 18 && wiek < 30); //dana osoba znajduje się w tym zakresie wiekowym

        //alternatywy - OR - musi być spełniony jeden warunek
        //operator logiczny OR = ||
        System.out.println(wiek < 18 || wiek > 65); //wiek nie jest poniżej 18 i powyżej 65 lat, nie otrzyma rabatu dla młodzieży lub osób starszych

        //negacje - ! - zaprzeczanie wartości
        //operator logiczny !
        boolean prawda = true;
        System.out.println("!prawda: " + !prawda); //wykrzyknik stawiamy przed wartością, której chcemy zaprzeczyć

        //prawda = true, z ! = false
    }
}
