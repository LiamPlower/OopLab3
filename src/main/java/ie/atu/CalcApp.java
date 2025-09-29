package ie.atu;

import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Please enter your second number: ");
        int secondNumber = scan.nextInt();


        Calculator calc = new Calculator();

        int result = calc.add(firstNumber, secondNumber);
        System.out.println(" The result is: " + result);




    }
}
