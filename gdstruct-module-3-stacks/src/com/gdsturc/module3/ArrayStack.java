package com.gdsturc.module3;

import java.util.EmptyStackException;

public class ArrayStack {
    private Player[] stack;
    private int top;




    public ArrayStack(int capacity){

        stack = new Player[capacity];
    }

    //new stack
    public void push(Player player){
        if (top == stack.length) // stack is full
        {
            Player[] newStack = new Player[2 * stack.length];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }

        //push element

        stack[top++] = player;




    }


    public Player pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        Player poppedPlayer = stack[--top];
        stack[top] = null;
        return poppedPlayer;


    }

    public Player peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }


        return stack[top - 1];

    }
    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top == 0;
    }


    public void printStack(){
        System.out.println("Printing stack: ");
        for (int i = top - 1; i >= 0; i--){
            System.out.println(stack[i]);
        }
    }

}
