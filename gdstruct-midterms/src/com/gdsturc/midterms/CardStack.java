package com.gdsturc.midterms;

import java.util.LinkedList;
import java.util.ListIterator;

public class CardStack {
    private LinkedList<Card> stack;




    public CardStack(){
        stack = new LinkedList<Card>();
    }

    public void push(Card card){
        stack.push(card);
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }




    public Card pop(){
        return stack.pop();
    }


    public Card peek(){
        return stack.peek();
    }

    public int size(){
        return stack.size();
    }

    public void printStack(){
        ListIterator<Card> iterator = stack.listIterator();


        System.out.println("Printing stack: ");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

    public void printHand(){
        ListIterator<Card> iterator = stack.listIterator();


        System.out.println("You are holding: ");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

    public void countStack(int counter){
        ListIterator<Card> iterator = stack.listIterator();


        System.out.println("Printing stack: ");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println("Player: " + (counter + 1));
            counter++;
        }


    }


}
