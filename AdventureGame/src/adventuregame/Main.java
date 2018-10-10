package adventuregame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // System objects
        Scanner userInput = new Scanner(System.in);
        Random random = new Random();

        // General game Variables
        String[] enemies = { "Burglar", "Hijacker", "Gupta", "Unemployment"};
        int maxEnemyHealth = 65;
        int enemyAttackDamage = 25;

        // Player Variables
        int health = 100;
        int attackDamage = 50;
        int numberOfChiprolls = 3;
        int chiprollHealAmount = 30;
        int chipRollDropChance = 50; // Percentage

        boolean running = true;

        System.out.println("Welcome to Satafrika!");

        GAME:
        while(running) {
            System.out.println("------------------------------------------");

            int enemyHealth = random.nextInt(maxEnemyHealth);
            String enemy = enemies[random.nextInt(enemies.length)];
            System.out.println("\t# " + enemy + " has appeared! #\n");

            while (enemyHealth > 0) {
                System.out.println("\tYour Health: " + health);
                System.out.println("\t" + enemy + "'s Health: " + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Vedala");
                System.out.println("\t2. Eat a chiproll");
                System.out.println("\t3. Spat!");

                String input = userInput.nextLine();

                if (input.equals("1")) {
                    int damageDealt = random.nextInt(attackDamage);
                    int damageTaken = random.nextInt(enemyAttackDamage);

                    enemyHealth -= damageDealt;
                    health -= damageTaken;

                    System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage.");
                    System.out.println("\t> You receive " + damageTaken + " damage in retaliation!");

                    if (health < 1) {
                        System.out.println("You are in your cone!");
                        break;
                    }
                } else if (input.equals("2")) {
                    if (numberOfChiprolls > 0) {
                        health += chiprollHealAmount;
                        numberOfChiprolls--;
                        System.out.println("\t> You eat a chiproll, healing yourself for " + chiprollHealAmount + ". "
                                + "\n\t> You now have " + health + " Health."
                                + "\n\t> You have " + numberOfChiprolls + "chiprolls left. \n");
                    } else {
                        System.out.println("\t> You have no chiprolls left! Defeat enemies for a chance to get one.");
                    }
                } else if (input.equals("3")) {
                    System.out.println("\t> You gave krag weg from the " + enemy + "!");
                    continue GAME;
                } else {
                    System.out.println("\tInvalid command");
                }
            }

            if (health < 1) {
                System.out.println("You are in your moer, on a train out of Satafrika");
                break;
            }

            System.out.println("----------------------------------------------");
            System.out.println(" # " + enemy + " was defeated! # ");
            System.out.println(" # You have " + health + " Health left. #");
            if (random.nextInt(100) < chipRollDropChance) {
                numberOfChiprolls++;
                System.out.println(" # The " + enemy + " dropped a chiproll! #");
                System.out.println(" # You have " + numberOfChiprolls + " chiproll(s). #");
            }
            System.out.println("----------------------------------------------");
            System.out.println("What would you like to do now?");
            System.out.println("1. Continue fighting");
            System.out.println("2. Leave Satafrika");

            String input = userInput.nextLine();

            while (!input.equals("1") && !input.equals("2")) {
                System.out.println("Invalid command!");
                input = userInput.nextLine();
            }

            if (input.equals("1")) {
                System.out.println("The struggle continues!");
            } else if (input.equals("2")) {
                System.out.println("You are leaving Satafrika, not too bad my ma se kin, jy's gehard!");
                break;
            }
        }
                System.out.println("####################");
                System.out.println("THANKS FOR TRYING MY MA SE KIN!");
                System.out.println("####################");
    }
}
