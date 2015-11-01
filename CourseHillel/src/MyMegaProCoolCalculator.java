/**
 * Created by Mi on 31.10.2015.
 */
import java.util.Scanner;

public class MyMegaProCoolCalculator {

    public static void main(String[] args) {
        boolean go = true;


        System.out.println("Hello! This is my first calculator, good luck with it!");
        System.out.println("For Addition press '+' ");
        System.out.println("For Subtraction press '-' ");
        System.out.println("For Multiplication press '*'");
        System.out.println("For Division press '/' ");


        while (go)
        {
            System.out.println("Please choose calculate method");
            Scanner scan = new Scanner(System.in);    //sets up scanners
            Scanner scan1 = new Scanner(System.in);


            String action = scan.nextLine();

            {
                System.out.println("Please enter first number.");
                double add1 = scan.nextDouble();
                System.out.println("Please enter second number.");
                double add2 = scan.nextDouble();
                double add3 = add1 + add2;
                System.out.println(add1 + " + " + add2 + " = " + add3);
            }
            if ("-".equals(action))
            {
                System.out.println("Please enter first number.");
                int sub1 = scan.nextInt();
                System.out.println("Please enter second number.");
                int sub2 = scan.nextInt();
                int sub3 = sub1 - sub2;
                System.out.println(sub1 + " - " + sub2 + " = " + sub3);
            }
            if ("*".equals(action))
            {
                System.out.println("Please enter first number.");
                int mul1 = scan.nextInt();
                System.out.println("Please enter second number.");
                int mul2 = scan.nextInt();
                int mul3 = mul1 * mul2;
                System.out.println(mul1 + " + " + mul2 + " = " + mul3);
            }
            if ("/".equals(action))
            {
                System.out.println("Please enter first number.");
                int div1 = scan.nextInt();
                System.out.println("Please enter second number.");
                int div2 = scan.nextInt();
                int div3 = div1 / div2;

                System.out.println(div1 + " /" + div2 + " = " + div3);

            }

                System.out.println("Do you want to start again? (y/n)");
                String startOver = scan1.nextLine();
                if ("y".equals(startOver)) {
                go = true;
                if ("n".equals(startOver)) {
                go = false;
                System.out.println("See ya!");
            }


            }
        }
    }

}

