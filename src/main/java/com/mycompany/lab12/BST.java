
package com.mycompany.lab12;

import java.util.Iterator;


public class BST {
    
    
    public void add (Integer value) {
        insert(value);
    }
    
    public Iterator<Integer> iterator() {
        return new Interator();
    }
    
    class Node
    {
        int key;
        Node left, right, parent;
 
        public Node(int item, Node parent)
        {
            key = item;
            left = right = null;
            this.parent = parent;
        }
    }
 
    Node root;
 
    BST()
    {
         root = null;
    }
 
    void insert(int key)
    {
         root = insertRec(root, key);
    }
 
    Node insertRec(Node root, int key)
    {
        if (root == null)
        {
            root = new Node(key, null);
            return root;
        }
        if (key < root.key){
            root.left = insertRec(root.left, key);
            root.left.parent = root;
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
            root.right.parent = root;
        }
        return root;
    }
   
    public class Interator implements Iterator<Integer> {
        
        Node next = root;     
        Interator(){
            next = root;
            while (next.left != null){
                next = next.left;
            }         
        }
        
        @Override
        public Integer next() {
            Integer key = next.key;
            if (next.right != null) {
                next = next.right;
                while (next.left != null) {
                    next = next.left;
                }
                return key;
            }
            Node r = next;
            next = next.parent;
            while (next != null && r == next.right) {
                r = next;
                next = next.parent;
            }
            return key;
        }
        
        @Override
        public boolean hasNext() {
            return (next != null);
        }
    }
}
