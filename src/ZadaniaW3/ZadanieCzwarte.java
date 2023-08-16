package ZadaniaW3;

public class ZadanieCzwarte {
    public static void main(String[] args) {
        //Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
        // Otherwise, print "positive" or "negative".
        // Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
//        Test Data
//        Input a number: 25
//        Expected Output :
//        Input value: 25
//        Positive number

        long number = 25l;

        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0) {
        System.out.println("Negative number");
        } else {
            System.out.println("This is zero");
        }






    }
}
