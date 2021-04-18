/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylist;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author StanislovsMacijausks
 */
public class MyListTest {
    
    public MyListTest() {
    }
    
 @Test
 public void testAddOneItem() {
 MyList list = new MyList();
 list.add(3);
 assertEquals(3, list.get(0));
 }

 @Test
 public void testAddSecondItem() {
 MyList list = new MyList();
 list.add(3);
 list.add(5);
 assertEquals(5, list.get(1));
 }

 @Test
 public void testFirstItemRemainsAfterAddingSecond() {
 MyList list = new MyList();
 list.add(3);
 list.add(5);
 assertEquals(3, list.get(0));
 }

    
}
