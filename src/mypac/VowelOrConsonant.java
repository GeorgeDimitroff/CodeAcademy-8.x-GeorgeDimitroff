package mypac;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String letter = scan.nextLine();

        while(!letter.matches("[a-zA-Z]")) {
            System.out.println("Please enter a valid letter: ");
            letter = scan.nextLine();
        }

        if(letter.matches("[aeiouAEIOU]"))
            System.out.println("Entered letter is vowel");
        else
            System.out.println("Entered letter is consonant");
    }
}
