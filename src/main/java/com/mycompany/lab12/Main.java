
package com.mycompany.lab12;

import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.add(10);
        bst.add(88);
        bst.add(67);
        Iterator<Integer> test = bst.iterator();
        System.out.println();
        while(test.hasNext()){
            System.out.println(test.next());
        }
    }
}
