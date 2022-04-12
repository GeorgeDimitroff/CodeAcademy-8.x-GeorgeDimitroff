package mypac;

import java.util.Scanner;

public class CompareFloatNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers to compare: ");
        double number1 = scan.nextDouble();
        double number2 = scan.nextDouble();
        double[] delta = {0.09, 0.009, 0.0009, 0.00009};

        for(int i = 0; i < delta.length; i++){
            if(Math.abs(number1 - number2) <= delta[i])
                System.out.println("Numbers are equal till the " + (i+1) + " decimal point.");
            else {
                System.out.println("Numbers are different from the " + (i + 1) + " decimal point. Different between both is: " + Math.abs(number1 - number2));
                break;
            }
        }
    }
}
