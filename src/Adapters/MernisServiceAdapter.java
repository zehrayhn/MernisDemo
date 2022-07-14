package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException,Exception {
		// TODO Auto-generated method stub
	KPSPublicSoapProxy client=new KPSPublicSoapProxy();
	return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirtsName().toUpperCase(), customer.getLastName().toUpperCase(), Integer.parseInt(customer.getDateOfBirth()));
	}

}
