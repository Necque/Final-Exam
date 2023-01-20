public class Main {	

    public static void main(String[] args) {		
    Customer customer;		
    RegularCustomer
 
regularCustomer = new 
RegularCustomer("Necita", 700);		
SeniorCustomer
seniorCustomer = new 
SeniorCustomer("Roque", 100);
 		
   customer = regularCustomer;		
System.out.println(customer.getName()+" " +customer.calculateBill()); 
		
customer = seniorCustomer;		
System.out.println(customer.getName()+" "+customer.calculateBill());	
   }
   }
