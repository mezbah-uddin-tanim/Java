
package Abstraction.Interface;


public class Dog implements Animal {
   public void eat(){
       System.out.println("Dogs can eat egg");
   }
   
   public void acor(){
       System.out.println("Dog can't give a acor");
   }
   public void run(){
       System.out.println("Dog can ran faster");
   }
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.run();
        d.acor();
        
        Cat c = new Cat();
        c.eat();
        c.acor();
        c.run();
    }
}
