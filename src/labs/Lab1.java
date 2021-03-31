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
        
        //get queue size
        System.out.println("size of elements"+q.size());
        
        System.out.println("aa Queue elements="+q);

        System.out.println("lets remove first element="+q.remove());
        System.out.println(q);

        System.out.println("lets peek at first elemet="+q.peek());

        System.out.println("poll--"+ q.poll());
        System.out.println(q);

        System.out.println("offer--"+q.offer(1111000));
        System.out.println(q);
        
    }
    
    /**
     * List tei herhen ajillah bolon methods iin tuhai
     */
    public static void simpleList(){
        
    }

    
}   
