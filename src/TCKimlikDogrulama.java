
import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class TCKimlikDogrulama {
	
	String TC;
	String firstName;
	String lastName;
	int yearOfBirth;
	
	KPSPublicSoapProxy tcDog=new KPSPublicSoapProxy();

	public TCKimlikDogrulama(String TC, String firstName, String lastName, int yearOfBirth) throws RemoteException{
		boolean result = tcDog.TCKimlikNoDogrula(TC, firstName, lastName, yearOfBirth);
		System.out.println("Döðrulama: "+(result ? "Baþarýlý" : "Baþarýsýz"));
	}
		

}
