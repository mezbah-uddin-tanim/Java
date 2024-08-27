
package Collection;

import java.util.HashMap;


public class HashMapDemo {
    public static void main(String[] args) {
        
        //put.get
        HashMap<Integer,String> customer = new HashMap<Integer,String>();
        
        customer.put(101,"Mezbah" );
        customer.put(102,"Charu" );
        customer.put(103,"Emon" );
       customer.put(104,"Rifat");
       customer.put(105, "Sajjad");
        
        System.out.println(customer.get(102));
        System.out.println(customer.get(101));
        System.out.println(customer.get(103));
        System.out.println(customer.get(104));
        System.out.println(customer.get(105));
    }
}
