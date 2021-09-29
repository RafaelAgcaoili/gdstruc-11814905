package com.gdsturc.module2;



public class PlayerLinkedList {

    private PlayerNode head;


    public void addToFront(Player player){
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);

        head = playerNode;
    }

    //removes first element
    public void removeFromFront(){
        if(head !=null)
           head = head.getNextPlayer();


    }


    //gets the size of the linked list
    public void getSize(){
        int counter = 0;
        PlayerNode current = head;
        while (current != null) {
            counter++;
            current = current.getNextPlayer();
        }

        System.out.println(counter);
    }
    //contains function
    public void contains(int id, String name, int level){
        PlayerNode current = head;
        while (current != null) {
            if (current.getPlayer().getId() == id){

                System.out.println("true");
                break;


            }
            else if (current.getPlayer().getName() == name){

                System.out.println("true");
                break;



            }
            else if (current.getPlayer().getLevel() == level) {

                System.out.println("true");
                break;



            }



            current = current.getNextPlayer();


        }
        if (current == null){
            System.out.println("false");
        }


    }


    //indexOf function
    public void indexOF(int id, String name, int level){
        int i = 0;
        PlayerNode current = head;
        while (current != null) {
            if (current.getPlayer().getId() == id){

                System.out.println(i);
                break;

            }
            else if (current.getPlayer().getName() == name){

                System.out.println(i);
                break;

            }
            else if (current.getPlayer().getLevel() == level){

                System.out.println(i);
                break;

            }


            i++;
            current = current.getNextPlayer();

        }
        if (current == null){
            i = -1;
            System.out.println(i);
        }


    }




    public void printList(){
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }
}
