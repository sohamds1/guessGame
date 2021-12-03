package co.sohamds.guessGame;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int maximum = 500;
        System.out.println("""
                Do you want the game to be easy or hard:\s
                Enter a value from 1 to 3 in the scale of difficulty\s
                1 being the easiest and 3 being the hardest\s
                """);
        int diff = in.nextInt();
        int tries = 0, n = 0;
        switch (diff) {
            case 1 -> {
                System.out.println("Max limit is " + maximum + " and min limit is 1");
            }
            case 2 -> {
                maximum = 2000;
                System.out.println("Max limit is " + maximum + " and min limit is 1");
            }
            case 3 -> {
                maximum = 5000;
                System.out.println("Max limit is " + maximum + " and min limit is 1");
            }
            default -> System.out.println("Wrong Input");
        }

        game ob = new game(maximum);
        if(diff==1||diff==2||diff==3){
            while(tries < 3){
                System.out.println("Enter a guess number: ");
                n = in.nextInt();
                if (ob.inputAndCheck(n)) {
                    System.out.println("Correct guess by the margin of 100");
                    System.out.println("The actual random number is: "+ob.rand_num);
                    break;
                }
                else{
                    System.out.println("Incorrect Guess");
                    ob.wrongGuess();
                }
                tries++;
                if(tries==3){
                    System.out.println("The actual random number is: "+ob.rand_num);
                }
            }
        }
    }
}
