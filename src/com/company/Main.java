package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BestCollection<Integer> bestCollection = new BestCollection<>();
        bestCollection.addLast(5);
        // bestCollection.removeWithIndex(4);
        // bestCollection.removeFirst();
        bestCollection.add(-4);
        bestCollection.remove(8);

        bestCollection.getMyContainer();
        System.out.println();
        for (int i :
                bestCollection) {
            System.out.print(i);
        }
    }
}
