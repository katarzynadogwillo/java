package Lekcja10_Petle;

public class PetlaFor {
    public static void main(String[] args) {
        //loops
        //kod wykonuje się linijka po linijce, pętla pozwala na wykonywanie kodu kilkukrotnie do pożądanego wyniku

        int liczenie;
        for (liczenie = 1; liczenie <= 10; liczenie = liczenie++ ) {
            //for składa się z trzech elementów: zmiennej z wartością początkową,
            //warunku, jak długo pętla ma się wykonywać
            //modyfikacji po każdym wykonaniu pętli - co ma się stać ze zmienną/wartością po każdym wykonaniu pętli

            //w tym przypadku zmienna liczenie ma się zwiększyć o 1
            System.out.println("Sprawdzam test " + liczenie++);
        }
        System.out.println("Poza pętlą " + liczenie); // wartość = to co w pętli + 1
    }
}
