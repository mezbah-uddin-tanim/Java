
package Collection;

import java.util.HashSet;


public class HashSetDemo {
    public static void main(String[] args) {
        
        HashSet<String> fruitsName = new HashSet<String>();
        
        
        fruitsName.add("Apple");
        fruitsName.add("Orange");
        fruitsName.add("Banana");
        fruitsName.add("Jackfruit");
        
       // System.out.println(fruitsName);
       fruitsName.remove("Apple");
        
        
        for(String f : fruitsName){
            System.out.println(f);
        }
         System.out.println(fruitsName.size());
        boolean value = fruitsName.isEmpty();
        System.out.println(value);
    }
}
