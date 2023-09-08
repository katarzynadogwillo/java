package zadania_w3;

public class ZadaniePierwsze {
    public static void main(String[] args) {
        //Write a Java program to get a number from the user and print whether it is positive or negative.
        //
        //Test Data
        //Input number: 35
        //Expected Output :
        //Number is positive

        int number = 35;

        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }
}
