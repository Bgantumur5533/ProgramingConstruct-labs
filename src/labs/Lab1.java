/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
/**
 *
 * @author gantumur
 */
class Person{
    public String name;
    public Person(String name){
        this.name = name;
    }
    public String toString(){return name;}
    public Object clone()throws CloneNotSupportedException{return super.clone();}  
}
public class Lab1 {
    
    public static void main (String[] args){

       //Lab1.simpleQueue();
       Lab1.simpleList();
       //Lab1.simpleSet();
    }
    
    /**
     * Queue ni elementiig zuvhun lsitiin ehlelees oruulah bolomjtoi
     * first input ni pirst out put boldog 
     * zuvhun urd baigaa elementtei haritsaj boldog listiin turul yum.
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
     * list ni dotorh elemntuudruugee handaj hevlej 
     * uurchilj boldog orj bui element uud index daraalaltai
     * olon turliin method toi listiin neg turul yum.
     */
    public static void simpleList(){
        
        List<Integer> l1 = new ArrayList<Integer>();
        List<Person> l2 = new ArrayList<Person>();
        //add elements to list  
        for(int i=0; i<10; i++){
            l1.add(i);
            l2.add(new Person("person"+i));
        }
        // lets remove element
        l1.remove(9);
         System.out.println("it removes 9th element="+l1);
         
        //it`ll clear all element in list
        //l1.clear();
        //System.out.println("ir removes all element="+l1);
        //checks list has givet int or String 
        l1.contains(0);
        System.out.println("checks list contain element you want to check="+l1.contains(0));
        //gets element that you type from list
        System.out.println("gets the element you want="+l1.get(3));
        //show you size of list
        l1.size();
        System.out.println("tell the size of list"+l1.size());
        //l1.set();
       
        Person p = l2.get(0); 
        
            
        
        checkPerson(p);
        System.out.println(l2);
        
         
        
    }
    public static boolean checkPerson(Person person){
        person.name="dandar";
        return false;
    }
    
    /**
     * Set ni zuvhun element oruulj hadgalah zoriolalttai orj
     * bui element uud index utggagui uchir daraalliig ni todorhoilj
     * hevleh handah bolomgui yum
     * harin Set ruu orj baigaa element uud hezeech davtagdahgui 
     * listiin neg turul yum.
     */
    
    public static void simpleSet(){
        
        Set<Integer> s1 ;
        s1 = new HashSet<Integer>();
        //adds element to set
        for(int i=0; i<10; i++){
            s1.add(i);
        }
        System.out.println(s1.add(11));
        //clear all element from set
        //s1.clear();
        
        //it compares specific object with set
        //s1.equals(object);
        
        //check that if this set have element or not and return boolean 
        System.out.println("check if this set has a element or not "+s1.isEmpty());
        
        //iterator hij ugsunuur set d baiga element ig hevlej bolno
        Iterator<Integer> it = s1.iterator();
        while(it.hasNext()){ 
            System.out.println(it.next());
        }
    }
   
        

    
}   

