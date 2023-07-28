package InstrukcjeZadania;

public class ZadanieDrugie {
    public static void main(String[] args) {
        //Twoim zadaniem jest obliczenie podatku od dochodu. Obecnie wynosi on 17%.
        // Wiemy, także doświadczeni programiści potrafią zarabiać pokaźne sumy, a od pewnego dochodu zwiększony jest podatek do 32%.
        // Sprawdź ile podatku musiałby zapłacić początkujący programista,
        // zanim przekroczy próg wynoszący 85 528 zł, a ile już ten doświadczony.

        //Wzór:
        //dla dochodu do 85 528 zł podatek wynosi 17%,
        //dla dochodu powyżej 85 528 zł liczy się go następująco:
        //- obliczamy podatek 17% z 85 528,
        //- dodatkowo obliczamy podatek 32% od nadwyżki ponad 85 528 zł,
        //czyli dochód pomniejszony o 85 528 zł i z tego 32%.
        //(oczywiście obliczamy orientacyjnie, gdyż nie bierzemy pod uwagę np. ulgi podatkowej).
        //Uwaga: zrób dodatkowe zabezpieczenie, jeżeli ktoś miałby więcej wydatków niż przychodu, czyli podałby kwotę ujemną dochodu ;)

        double dochod = 66654.00;

        double podatekNizszy = 0.17;
        double podatekWyzszy = 0.32;

        double prog = 85528.00;

        if (dochod <= prog) {
            System.out.println("Programista jest w niższym progu i płaci: " + dochod * podatekNizszy);
        } else if (dochod > prog) {
            double podatek = prog * podatekNizszy + (dochod - prog) * podatekWyzszy;
            System.out.println("Programista jest powyżej progu i płaci: " + podatek);
        } else {
            System.out.println("Programista nie osiągnął dochodu, nie płaci podatku");
        }
    }
}
