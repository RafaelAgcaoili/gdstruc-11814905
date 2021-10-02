package com.gdsturc.module3;

import java.util.Random;


public class Main {

    public static void main(String[] args) {
        // write your code here

        Random x = new Random();

        int count = 0;


        LinkedStack stack = new LinkedStack();

        for (int i = 0; i < 9; i++){

            while (stack.size() < 5){
                int temp = x.nextInt((6) + 1);
                pushSpecificPlayers(stack, temp, count);
                stack.countStack(count);




                System.out.println("Press Any Key To Continue...");
                new java.util.Scanner(System.in).nextLine();






            }
            System.out.println("Game has Queued");
            for (int j = 0; j < 5; j++) {
                stack.pop();
            }
            System.out.println("Press Any Key To Continue...");
            new java.util.Scanner(System.in).nextLine();


        }






    }

    public static void pushPlayers(LinkedStack stack){


        stack.push(new Player(1, "Aceu", 100));
        stack.push(new Player(2, "Sinatraa", 100));
        stack.push(new Player(3, "Subroza", 95));
        stack.push(new Player(4, "ploo", 90));
        stack.push(new Player(5, "zombs", 90));
        stack.push(new Player(6, "ShahZaM", 90));
        stack.push(new Player(7, "dapr", 90));

    }

    public static void pushSpecificPlayers(LinkedStack stack, int loopingAmt, int count) {

        for (int i = 0; i < loopingAmt; i++) {
            stack.push(new Player(count, "Player", 100));
            count++;

        }
    }




}
