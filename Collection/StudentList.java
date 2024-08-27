
package Collection;

import java.util.LinkedList;


public class StudentList {
    public static void main(String[] args) {
        LinkedList<Student> list = new LinkedList<Student>();
        
        Student s1 = new Student(101,"Mezbah","Eleven");
        Student s2 = new Student(102,"Charu","Eleven");
        Student s3 = new Student(103,"Emon","Eleven");
        Student s4 = new Student(104,"Tonmoy","Eleven");
        
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        
        list.removeFirst();
        list.remove(s3);
        
        
        
        
        
        for(Student s : list){
            System.out.println(s.id+" "+s.name + " "+s.className);
            
        }
        
    }
}
