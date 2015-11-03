/**
 * Created by Mi on 31.10.2015.
 */
import java.util.Scanner;

public class MyMegaProCoolCalculator {

    public static void main(String[] args) {
        boolean go = true;
        greetingsMessage();

        while (go) {
            System.out.println("Please choose calculate method");
            Scanner scan = new Scanner(System.in);    //sets up scanners
            Scanner scan1 = new Scanner(System.in);


            String action = scan.nextLine();

            {
                if ("+".equals(action)) {
                    numOneMsg();
                    double add1 = scan.nextDouble();
                    numTwoMsg();
                    double add2 = scan.nextDouble();
                    System.out.println(addition(add1, add2));
                }
                if ("-".equals(action)) {
                    numOneMsg();
                    double sub1 = scan.nextDouble();
                    numTwoMsg();
                    double sub2 = scan.nextDouble();
                    System.out.println(subtraction(sub1, sub2));
                }
                if ("*".equals(action)) {
                    numOneMsg();
                    double mul1 = scan.nextDouble();
                    numTwoMsg();
                    double mul2 = scan.nextDouble();
                    System.out.println(multiplication(mul1, mul2));
                }
                if ("/".equals(action)) {
                    numOneMsg();
                    double div1 = scan.nextInt();
                    numTwoMsg();
                    double div2 = scan.nextInt();
                    System.out.println(division(div1, div2));

                }

                System.out.println("Do you want to start again? (y/n)");
                String startOver = scan1.nextLine();
                if ("y".equals(startOver)) {
                    go = true;
                }
                if ("n".equals(startOver)) {
                    go = false;
                    System.out.println("See ya!");
                }

            }

        }


    }

    public static double addition(double one, double two) throws ArithmeticException {
        return one + two;
    }

    public static double subtraction(double one, double two) throws ArithmeticException {
        return one - two;
    }

    public static double multiplication(double one, double two) throws ArithmeticException {
        return one * two;
    }

    public static double division(double one, double two) throws ArithmeticException {
        return one / two;
    }

    public static void numOneMsg() {
        System.out.println("Please enter first number.");
    }

    public static void numTwoMsg() {
        System.out.println("Please enter second number.");
    }

    public static void greetingsMessage() {

        System.out.println("For Addition press '+' ");
        System.out.println("For Subtraction press '-' ");
        System.out.println("For Multiplication press '*'");
        System.out.println("For Division press '/' ");

    }
}





