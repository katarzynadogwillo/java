package ZadaniaW3;

public class ZadanieTrzecie {
    public static void main(String[] args) {
//        Write a Java program that takes three numbers from the user and prints the greatest number.
//
//        Test Data
//        Input the 1st number: 25
//        Input the 2nd number: 78
//        Input the 3rd number: 87
//        Expected Output :
//        The greatest: 87

        int num1 = 25;
        int num2 = 78;
        int num3 = 87;

        if (num1 > num2)
            if (num1 > num3)
        System.out.println("The greatest: " + num1);

        if (num2 > num1)
            if (num2 > num3)
        System.out.println("The greatest: " + num2);

        if (num3 > num1)
            if (num3 > num2)
        System.out.println("The greatest: " + num3);
    }
}
