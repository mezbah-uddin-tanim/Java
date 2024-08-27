package Collection;

import java.util.LinkedList;

/**
 *
 * @author Mezbah Uddin
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        
        LinkedList<String> countryName = new LinkedList<String>();
        
        
        countryName.add("Äfganistaan");
        countryName.add("Bangladesh");
        countryName.add("India");
        countryName.add("Pakistan");
        countryName.add(4, "Brazil");
        countryName.addFirst("Ärgentina");
        countryName.addLast("Nepal");
        //countryName.remove("India");
        //countryName.remove(3);
        //countryName.removeFirst();
       // countryName.removeLast();
        
       // countryName.g
        
        
        
        
        
        
        for(String country : countryName){
            System.out.println(country);
        }
        
        System.out.println("Size of the linkedlist : "+countryName.size());
        System.out.println("First element : "+countryName.getFirst());
        System.out.println("Last element : "+countryName.getLast());
        
        countryName.clear();
        System.out.println(countryName);
        
    }   
}
