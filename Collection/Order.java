
package Collection;


public class Order {
   public int order_no;
   private Customer customer;
   public void placeOrder(){
       customer = new Customer();
       String info = customer.getInfo(101 ,"Mezbah");
       order_no = 101;
       
       System.out.println("Order info " +order_no );

   }
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.placeOrder();
        
    }
}
