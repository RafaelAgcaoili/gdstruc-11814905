package com.gdsturc.module4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Random x = new Random();
        Random y = new Random();
        int count = 0;
        ArrayQueue queue = new ArrayQueue(100);


        for(int i = 0; i < 100; ++i) {
            int level;
            level = x.nextInt(100);
            queue.add(new Player(i + 1, "Player " + (i + 1), level));


        }



        queue.printQueue();


        for(int i = 0; i < 9; ++i) {
            int j;
            while(queue.size() < 5) {
                j = x.nextInt(7);
                System.out.println(j);
                System.out.println("Press Any Key To Continue...");
                (new Scanner(System.in)).nextLine();
            }

            System.out.println("Game has Queued");


            for(j = 0; j < 5; ++j) {
                queue.remove();
            }

            System.out.println("after \n");
            queue.printQueue();

            System.out.println("Press Any Key To Continue...");
            (new Scanner(System.in)).nextLine();


        }


    }


}


