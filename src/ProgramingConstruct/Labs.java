
package ProgramingConstruct;

import java.util.*;

class Node<Object> {
    Object data;
    Node prev;
    Node next;
    
    Node (Object data) {
    this.data= data;
    }
   
    public String toString(){        
        return ""+data;
    }
}

class DoublyLinkedList{

    private int  size;
    private Node head;
    private Node current;
    private Node tail;


    DoublyLinkedList(){
        size = 0;
    }

    public void addElement(Object data){
        Node dt = new Node(data);

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

    public Node getElement(int i){
        this.toHead();
        for (int j=0 ; j<i; j++)
            this.next();
        return current;
    }
    

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
    

    public void toHead(){
        current = head;
    }
    

    public void toTail(){
        current = tail;
    }
    

    public int getSize(){
        return size;
    }
    

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


public class Labs {
    public static void main(String[] args){
        DoublyLinkedList dll;
        dll = new DoublyLinkedList();
        boolean bool=true;
          
        while (bool) {
            System.out.println("1: add elements");
            System.out.println("2- get element");
            System.out.println("3- del element");
            System.out.println("4- get size");
            System.out.println("5- print");
            System.out.println("6- exit");
            Scanner obj = new Scanner(System.in);
            int cmmnd = obj.nextInt();
            switch (cmmnd) {
                case 1:
                    {
                        System.out.println("enter Element:");
                        Scanner elm = new Scanner(System.in);
                        int asd = elm.nextInt();
                        dll.addElement(asd);
                        break;
                    }
                case 2:
                    {
                        System.out.println("element index:");
                        Scanner elm = new Scanner(System.in);
                        int get = elm.nextInt();
                        dll.getElement(get);
                        break;
                    }
                case 3:
                    {
                        System.out.println("del element:");
                        Scanner elm = new Scanner(System.in);
                        int del = elm.nextInt();
                        dll.delElement(del);
                        break;
                    }
                case 4:
                    dll.getSize();
                    break;
                case 5:
                    System.out.println(dll);
                    break;
                case 6:
                    break ;
                default:
                    break;
            }
        }

                
            
        }
        
        
        
        
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        boolean bln = true;
        
            
        System.out.println("1- insert element");
        System.out.println("2- get element");
        System.out.println("3- remove element");
        System.out.println("4- print");
        System.out.println("5- listin hemjee");
        System.out.println("6- exit");
        
        while(bln){
            
            
            
            
        }

        
        dll.addElement("asdaf");
        dll.addElement(12314);
        dll.addElement("aerte");
        dll.addElement("rewrewrt");
        System.out.println(dll);
    }    
}
