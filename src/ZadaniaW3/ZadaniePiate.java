package ZadaniaW3;

public class ZadaniePiate {
    public static void main(String[] args) {
        //Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.
        //
        //        Test Data
        //    Input number: 3
        //    Expected Output :
        //    Wednesday

        int number = 3;

        switch(number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }



    }
}
