package com.gdsturc.module2;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Player asuna = new Player(1,"Asuna",100);
        Player lethalBacon = new Player(2,"LethalBacon",205);
        Player hpDeskjet = new Player(3,"HPDeskjet",34);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(hpDeskjet);




        playerLinkedList.removeFromFront();
        playerLinkedList.getSize();
        playerLinkedList.contains(2,"LethalBacon",205);
        playerLinkedList.indexOF(1,"Asuna",100);


        playerLinkedList.printList();




//        List<Player> playerList = new ArrayList<>();

//        playerList.add(new Player(1, "Asuna", 100));
//       playerList.add(new Player(2, "LethalBacon", 205));
//        playerList.add(new Player(3, "HPDeskjet", 34));

//        System.out.println(playerList.get(1));
//        System.out.print("\n");


//        playerList.add(2, new Player(553, "Arctis", 55));
//        playerList.remove(2);

//        System.out.println(playerList.indexOf(new Player(2, "LethalBacon", 205)));
//       System.out.println(playerList.contains(new Player(2,"LethalBacon", 205)));

//        for (Player p: playerList){
//           System.out.println(p);
//       }

    }
}
