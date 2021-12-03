/*
The author of this code is Soham Dey Sarkar.

It is a fun game made by me, to have a brief understanding od the logic of making a basic game in Java
which can later on be used to build a game in Android Studio.

JDK used: 17
IDE: IntelliJ
 */

package co.sohamds.guessGame;

import java.util.Random;
import java.util.Scanner;

public class game {
    int max;
    int rand_num;
    int guess;
    Random random = new Random();
    game(){
    }
    game(int maximum){
        max = maximum;
        rand_num = random.nextInt(max)+1;
    }

    protected boolean inputAndCheck(int n) {
        Scanner in = new Scanner(System.in);
        guess = n;

        return Math.abs((rand_num - guess)) <= 100;
    }

    protected void wrongGuess(){
        if(guess - rand_num < 0){
            System.out.println("The guess should be upper bound");
        }
        else{
            System.out.println("The guess should be lower bound");
        }
    }
}
