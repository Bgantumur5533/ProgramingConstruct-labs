/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs;

import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author gantumur
 */
public class Lab1 {
    
    public static void main (String[] args){

       Lab1.simpleQueue();
       //Lab1.simpleList();
    }
    
    /**
     * queue tei ajillah tuhai
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
     * List tei herhen ajillah bolon methods iin tuhai
     */
    public static void simpleList(){
        
    }

    
}   
