package Concrete;

//import java.rmi.RemoteException;

//import javax.management.remote.SubjectDelegationPermission;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;
//import Abstract.CustomerService;
//import Entities.Customer;
//import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
   private CustomerCheckService customerCheckService;
	 
   
   public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
	super();
	this.customerCheckService = customerCheckService;
}

@Override
	    public void Save(Customer customer) throws Exception  {
	          if(customerCheckService.checkIfRealPerson(customer))
	          { 
	        	  super.Save(customer);  
	          } 
	          else {
	          throw new Exception("Not a valid person");
	          }
	    }

	
}
