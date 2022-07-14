//import java.sql.Date;
//import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args)    {

         
         try {
        	 BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
             Customer customer=new Customer();
              customer.setId(1);
             customer.setFirtsName("Zehra");
             
             customer.setLastName("Ayhan");
            // customer.setDateOfBirth(new LocalDate.of(2000,2,2));
            // LocalDate date=LocalDate.of(2000, 10, 10);
            // customer.setDateOfBirth(date);
             customer.setDateOfBirth("2022");
             customer.setNationalityId("12345678");
              customerManager.Save(customer);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}

}
