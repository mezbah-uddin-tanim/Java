
package Abstraction;

public  class Circle extends Shape{
    
    Circle(double r){
       super(r,r);
       
    }
    void area(){
        double result = 3.1416 * dim1*dim2;
        System.out.println("Cicle Area : "+result);
    } 
    
    
}
