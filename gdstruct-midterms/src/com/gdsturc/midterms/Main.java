package com.gdsturc.midterms;

import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here

        Random x = new Random();


        int count = 0;


        CardStack deck = new CardStack();
        CardStack discarded = new CardStack();
        CardStack hand = new CardStack();

        pushCards(deck);


        System.out.println("Start?");
        System.out.println("Press Any Key To Continue...");
        (new Scanner(System.in)).nextLine();







        while (deck.size() > 0){
            int command = x.nextInt(3);
            if (command == 0){
                for (int i = 0; i < x.nextInt(5); i++) {
                    System.out.println("Drawing cards from deck.....");
                    if (deck.isEmpty() == false) {
                        hand.push(deck.peek());

                        deck.pop();
                    }

                }

            }
            else if (command == 1){
                for (int i = 0; i < x.nextInt(5); i++) {
                    System.out.println("Discarding cards.....");

                    if (hand.isEmpty() == false) {
                        discarded.push(hand.peek());
                        hand.pop();
                    }
                }
            }
            else if (command == 2){
                for (int i = 0; i < x.nextInt(5); i++) {
                    System.out.println("Drawing cards from discarded pile.....");

                    if (discarded.isEmpty() == false) {
                        hand.push(discarded.peek());
                        discarded.pop();
                    }
                }


            }

            System.out.println("Round is over");
            hand.printHand();
            System.out.println("remaining cards in the deck: " + deck.size());
            System.out.println("cards in the discarded pile " + discarded.size());


            System.out.println("Press Any Key To Continue...");
            (new Scanner(System.in)).nextLine();







        }










    }

    public static void pushCards(CardStack stack){

        for (int i = 0; i < 3; i++) {
            stack.push(new Card(1, "Pikachu"));
            stack.push(new Card(2, "Ash"));
            stack.push(new Card(3, "Blue Eyes White Dragon"));
            stack.push(new Card(4, "Dark Magician Girl"));
            stack.push(new Card(5, "Naruto"));
            stack.push(new Card(6, "Raf Davis"));
            stack.push(new Card(7, "Duterte"));
            stack.push(new Card(8, ":)"));
            stack.push(new Card(9, "TenZ"));
            stack.push(new Card(10, "Kyedae"));
        }









    }





    public static void pushSpecificPlayers(CardStack stack, int loopingAmt, int count) {

        for (int i = 0; i < loopingAmt; i++) {
            stack.push(new Card(count, "Player"));
            count++;

        }
    }




}
