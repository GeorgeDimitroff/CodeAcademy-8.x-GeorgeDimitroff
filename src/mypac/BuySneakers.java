package mypac;

import java.util.Scanner;

public class BuySneakers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Price: ");
        double price = scan.nextDouble();
        System.out.print("Size: ");
        int size = scan.nextInt();
        Boolean isNotBlack = true;
        Boolean canReturn = true;

        if((price > 0 && price <= 150) && (size == 44 || size == 45) && isNotBlack && canReturn)
            System.out.println("Finally, you found the right sneakers based on your needs.");
        else
            System.out.println("Sneaker requirements were not met.");
    }
}
