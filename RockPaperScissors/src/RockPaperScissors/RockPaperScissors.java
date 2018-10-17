package RockPaperScissors;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        int playerOne, playerTwo, playerOneScore, PlayerTwoScore;
        boolean quit = false;

        //Instantiating Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Rock Paper Scissors, Get Ready.");
        System.out.println("Input 1 for Rock\nInput 2 for Paper\nInput 3 for Scissor\nInput 4 to quit");
        GAME:
        while(!quit){


            System.out.println("Player 1: Choose your weapon!");
            playerOne = input.nextInt();
            if(playerOne == 4)
                break GAME;
            System.out.println("Good choice!");
            System.out.println("Player 2: Choose your weapon!");
            playerTwo = input.nextInt();
            if(playerTwo == 4)
                break GAME;
            System.out.println("Good choice!");


            feedback(playerOne, "Player One");
            feedback(playerTwo, "Player Two");
            checkScore(playerOne, playerTwo);


        }
    }

    public static void feedback(int choice, String player){
        switch (choice){
            case 1:
                System.out.println(player + " chose: rock!");
                break;
            case 2:
                System.out.println(player + " chose: paper!");
                break;
            case 3:
                System.out.println(player + " chose: scissor!");
                break;
        }
    }

    public static void checkScore(int playerOne,int playerTwo){
        if(playerOne == playerTwo)
            System.out.println("it's a draw");

    }
}
