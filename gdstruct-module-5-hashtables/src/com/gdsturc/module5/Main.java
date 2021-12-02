package com.gdsturc.module5;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Player aceu = new Player(1, "Aceu", 100);
        Player sinatraa = new Player(2, "Sinatraa", 100);
        Player subroza = new Player(3, "Subroza", 95);
        Player ploo = new Player(4, "ploo", 90);
        Player zombs = new Player(5, "zombs", 90);


        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(aceu.getUserName(), aceu);
        hashtable.put(sinatraa.getUserName(), sinatraa);
        hashtable.put(subroza.getUserName(), subroza);
        hashtable.put(ploo.getUserName(), ploo);
        hashtable.put(zombs.getUserName(), zombs);

        hashtable.printHashtable();

        hashtable.remove("Aceu");

        hashtable.printHashtable();


    }
}
