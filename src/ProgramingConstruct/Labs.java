
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
   
    public void addAfter(Object data, int i){
        Node dt = new Node(data);
        
        this.toHead();
        for(int j=0; j<i; j++){
            this.next();
        }
        for(int j=0; j<size; j++){
            if
        }
        
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
        
        System.out.println("1. addElement");
        System.out.println("2. getElement");
        System.out.println("3. delElement");
        System.out.println("4. getSize");
        System.out.println("5. print");
        System.out.println("6. exit");
        
        while(bool){
            System.out.println("Command number:");
            Scanner obj = new Scanner(System.in);
            int cmmnd = obj.nextInt();
            
            if(cmmnd==1){
                System.out.println("type element:");
                Scanner elm = new Scanner(System.in);
                Object asd = elm.nextInt(); 
                dll.addElement(asd);
            }else if(cmmnd==2){
                System.out.println("type indexof number you wanna get:");
                Scanner elm = new Scanner(System.in);
                int index = elm.nextInt();
                dll.getElement(index);
            }else if(cmmnd==3){
                System.out.println("type indexof number you wanna del:");
                Scanner elm = new Scanner(System.in);
                int index = elm.nextInt();
                dll.delElement(index);
            }else if(cmmnd==4){
                System.out.println(dll.getSize());
            }else if(cmmnd==5){
                System.out.println(dll);
            }else if(cmmnd==6){
                break;
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
