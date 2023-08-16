package Lekcja10_Petle;

public class PetlaWhile {
    public static void main(String[] args) {
        int liczenie = 1;
        while(liczenie <= 10) {//warunek liczenie ma się dokonać dopóki będzie <= 10 - tak długo będzie się wykonywało
            System.out.println("Tekst: " + liczenie);
            liczenie++;
        }

        //do while
        //najpierw wykonaj, później sprawdź - przynajmniej raz pętla się wykona
        liczenie = 1;
        do {
            System.out.println("Tekst dowhile: " + liczenie);
            liczenie++;
         } while(liczenie <=10);
    }
}
