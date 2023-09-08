package zmienne_operatory_zadania;

public class ZadanieDrugie {
    public static void main(String[] args) {
        //Na podstawie danych z poprzedniego zadania oblicz Twoje BMI (Body Mass Index).
        // Wzór to masa / wzrost^2 (masa w kilogramach, wzrost w metrach).


        int wiek = 35;
        double wzrost = 1.68;
        double waga = 56.7;


        //double BodyMassIndex = waga/(wzrost*wzrost);
        double BodyMassIndex = waga/Math.pow(wzrost,2); //biblioteka Math służy do potęgowania, pietwiastkowania itp.

        System.out.println(BodyMassIndex);


    }
}
