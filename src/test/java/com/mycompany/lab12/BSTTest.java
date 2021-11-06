package com.mycompany.lab12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class BSTTest {
    
    
    @Test
    public void testIterator() {
        BST tree = new BST();
        List<Integer> expected = Arrays.asList(20,30,50);
        List<Integer> result = new ArrayList<>();
        tree.add(50);
        tree.add(30);
        tree.add(20);
        Iterator<Integer> test = tree.iterator();
        while(test.hasNext()){
            result.add(test.next());
        }
        assertEquals(result,expected);
    }
    
    @Test
    public void testIterator2() {
        BST tree = new BST();
        List<Integer> expected = Arrays.asList(15,20,36);
        List<Integer> result = new ArrayList<>();
        tree.add(20);
        tree.add(36);
        tree.add(15);
        Iterator<Integer> test = tree.iterator();
        while(test.hasNext()){
            result.add(test.next());
        }
        assertEquals(result,expected);
    }
    
    @Test
    public void testIterator3() {
        BST tree = new BST();
        List<Integer> expected = Arrays.asList(10,17,27,28,32,36);
        List<Integer> result = new ArrayList<>();
        tree.add(10);
        tree.add(28);
        tree.add(27);
        tree.add(32);
        tree.add(36);
        tree.add(17);
        Iterator<Integer> test = tree.iterator();
        while(test.hasNext()){
            result.add(test.next());
        }
        assertEquals(result,expected);
    }
    
    @Test
    public void testIterator4() {
        BST tree = new BST();
        List<Integer> expected = Arrays.asList(10,11);
        List<Integer> result = new ArrayList<>();
        tree.add(11);
        tree.add(10);
        Iterator<Integer> test = tree.iterator();
        while(test.hasNext()){
            result.add(test.next());
        }
        assertEquals(result,expected);
    }
}
