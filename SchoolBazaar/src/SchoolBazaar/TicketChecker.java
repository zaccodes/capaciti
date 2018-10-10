package SchoolBazaar;

import java.util.Scanner;

public class TicketChecker {
    public static void main(String[] args) {
        int DIVIDERONE = 100, DIVIDERTWO = 7, DIVIDERTHREE = 6;
        int ticketNumber, age;
        double thePrize;
        char gender;

        //Creating an instance of the Scanner Vibe and the other class
        DeterminePrize determinePrize = new DeterminePrize();
        Scanner input = new Scanner(System.in);

        // Prompting User to input Ticket Number and storing value in `tickerNumber`
        System.out.println("Enter your ticket number:");
        ticketNumber = input.nextInt();

        if((ticketNumber % DIVIDERONE) == 0){
            System.out.println("Please specify whether you are male or female");
            gender = input.next().charAt(0);
            // call getPrize and assign the regte price
            thePrize = determinePrize.getPrize(ticketNumber, gender);
            publicServiceAnnouncement(thePrize);
        } else if((ticketNumber%DIVIDERTWO) == 0 && (ticketNumber%DIVIDERTHREE) == 0){
            System.out.println("Please enter your age:");
            age = input.nextInt();
            thePrize = determinePrize.getPrize(ticketNumber,age);
            publicServiceAnnouncement(thePrize);
        } else {
            publicServiceAnnouncement(0);;
        }
        // closing the scanner
        input.close();
    }

    public static void publicServiceAnnouncement(double thePrize){
        if(thePrize <= 0){
            System.out.println("Better luck next time buddy!!!");
        }else{
            System.out.println("Here is your prize R" + thePrize);
        }

    }
}
