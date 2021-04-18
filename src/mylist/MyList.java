/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylist;

/**
 *
 * @author StanislovsMacijausks
 */
public class MyList {

    
    public static void main(String[] args) {
        
    }    
  
    static Node first;

       static class Node {
           int data;
           Node next;

           
           Node(int a) {
               data = a;
               next = null;
           }
       }
     
       public void add(int data){

           
           Node new_node = new Node(data);
           new_node.next = null;

           if(first == null){
               first = new_node;

           }

           else{
               Node last = first;
               while(last.next != null){
                   last = last.next;
               }

               last.next = new_node;
           }
       }

    public static int get (int number){

           Node searched = first;

            for(int i = 0; i < number; i++)
            {
                searched = searched.next;
            }

        return searched.data;
    }
}


