package mypac;

import java.util.Scanner;
import static java.lang.Math.*;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("a = ");
        double a = scan.nextDouble();
        System.out.print("b = ");
        double b = scan.nextDouble();
        System.out.print("c = ");
        double c = scan.nextDouble();
        double D = b*b - 4*a*c;

        if(D > 0){
            System.out.println("X1 = " + (-b + sqrt(D))/(2*a));
            System.out.println("X2 = " + (-b - sqrt(D))/(2*a));
        }
        else if(D <0){
            System.out.println("There are no real roots");
        }
        else{
            System.out.println("X1 = X2 = " + (-b)/(2*a));
        }
    }
}
