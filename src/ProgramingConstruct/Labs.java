/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramingConstruct;

import java.util.*;
/**
 * doubly linked listiin negj elementiig ilerhiileg class 
 * @author gantumur
 */
class Node{
    int data;
    Node prev;
    Node next;
    
    Node (int data) {
    this.data= data;
    }
    /***
     * Node iin urguudiig String bolgon hevleh method 
     */
    public String toString(){        
        return ""+data;
    }
}
/**
 * Douly linked list undsen class
 */
class DoublyLinkedList{
    /**
     * Protery
     */
    private int  size;
    private Node head;
    private Node current;
    private Node tail;

    
    //struct 
    DoublyLinkedList(){
        size = 0;
    }
    // Element nemeh method
    public void addElement(int data){
        Node dt = new Node(data);
        //anhnii element nemeh uyd
        if(head==null){
            head = dt;
            current = dt;
            tail = dt;
        }else{
            current.next = dt;
            dt.prev = current;
            current = dt;
        }
        size++;
    }
    //linked listees todorhoilson elemntiig avah
    public Node getElement(int i){
        this.toHead();
        for (int j=0 ; j<i; j++)
            this.next();
        return current;
    }
    
    // linked listeed zaasan elementiig hasah
    public void delElement(int i){
        if(i<size/2){
            this.toHead();
            for(int j=0; j<i ; j++){
            this.next();
        }
        }else{
            this.toTail();
            for(int j=0; j<(size-i); j++){
                this.prev();
            }
        }
        
        current.prev.next=current.next;
        current.next.prev=current.prev;
        current=null;
        
    }
    
    //linked listiin togloi ruu ochih
    public void toHead(){
        current = head;
    }
    
    //linked listiin suul ruu ochih
    public void toTail(){
        current = tail;
    }
    
    //linked listiin size
    public int getSize(){
        return size;
    }
    
    //listiin hevleh method
    public String toString(){
        String ret="";
        Node dt = head;
        while(dt!=null){
            ret+= dt.data+", ";
            dt = dt.next;
        }
        return ret;
    }
    
    public void next(){
        current = current.next;
    }
    public void prev(){
        current = current.prev;
    }
    public boolean hasNext(){
        
        if(current.next!=null){
            return true;
        }else{
            return false;
        }
    }
    public boolean hasPrev(){
        if (current.prev!=null){
            return true;
        }else{
            return false;
        }
    }
}


/**
 *
 * @author gantumur
 */
public class Labs {
    public static void main(String[] args){
        DoublyLinkedList dll;
        dll = new DoublyLinkedList();
        dll.addElement(4);
        dll.addElement(7);
        dll.addElement(8);
        dll.addElement(13);
        
        System.out.println(dll);
        Node a= dll.getElement(3);
        
        
        System.out.println(dll.getElement(3));
        dll.delElement(1);
        System.out.println(dll);
    }    
}
