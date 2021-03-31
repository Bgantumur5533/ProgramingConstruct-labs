/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/**
 *
 * @author gantumur
 */
public class Lab1 {
    
    public static void main (String[] args){

       //Lab1.simpleQueue();
       Lab1.simpleList();
    }
    
    /**
     * queue ni first element ni first output boldog
     * haritsahdaa hamgiin ehnii elemttei haritsah bolomjtoi
     * listiin turul yum.
     */
    public static void simpleQueue(){
        Queue<Integer> q;
        q = new LinkedList<>();
        
        //init queue
        for( int i=0; i<10; i++){
            q.add(i);
        }
        //q.size() shows size of Queue
        System.out.println("size of elements"+q.size());
        System.out.println("aa Queue elements="+q);
        //q.remove() removel element from first input
        System.out.println("lets remove first element="+q.remove());
        System.out.println(q);
        //q.pee() peek first element
        System.out.println("lets peek at first elemet="+q.peek());
        //q.poll() also peek at first element but also removes them
        System.out.println("poll--"+ q.poll());
        System.out.println(q);
        //q.offer() check element that you want to add and gives back boolean
        System.out.println("offer--"+q.offer(1111000));
        System.out.println(q);
        
    }
    
    /**
     * List ni olon turliin methoduudtai
     * elementuudiinhaa ali ruu ni ch handaj boldog
     * ali ch talaas ali elementee output hiideg list yum.
     */
    public static void simpleList(){
        
         List<Integer> l1;
          l1 = new ArrayList<Integer>();
          
         for(int i=0; i<10; i++){
             l1.add(i);
         }
         
         l1.remove(9);
         System.out.println("it removes 9th element="+l1);
         
         //l1.clear();
         //System.out.println("ir removes all element="+l1);
         
         l1.contains(0);
         System.out.println("checks list contain element you want to check="+l1.contains(0));
         
         System.out.println("gets the element you want="+l1.get(3));
         
         l1.size();
         System.out.println("tell the size of list"+l1.size);
         
        
    }
    
   
        

    
}   

