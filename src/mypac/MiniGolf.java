package mypac;

public class MiniGolf {
    public static void main(String[] args) {
        int golfBalls = 20;

        // Идват 2 ма играча;
        golfBalls = golfBalls - 2;
        System.out.println("Number of golf balls till now: " + golfBalls);

        // Идва група от 5 ма играча;
        golfBalls = golfBalls - 5;
        System.out.println("Number of golf balls till now: " + golfBalls);

        // Идва група от 3 ма играча;
        golfBalls = golfBalls - 3;
        System.out.println("Number of golf balls till now: " + golfBalls);

        // Първите двама приключват и връщат топчетата;
        golfBalls = golfBalls + 2;
        System.out.println("Number of golf balls till now: " + golfBalls);

        // Идва група от 4 ма играча;
        golfBalls = golfBalls - 4;
        System.out.println("Number of golf balls till now: " + golfBalls);

        // Идва група от 6 ма играча;
        golfBalls = golfBalls - 6;
        System.out.println("Number of golf balls till now: " + golfBalls);

        // Групата от 5 човека приключва играта и връща оборудването, но 2 ма от тях решават да направят и втора обиколка.
        golfBalls = golfBalls + 5 - 2;
        System.out.println("Number of golf balls till now: " + golfBalls);
    }
}
