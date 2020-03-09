package in.nit.service;

import in.nit.model.AddresModel;
import in.nit.model.PersonInfoModel;

public interface PersonService {
	public boolean savePersonDetails(PersonInfoModel personInfoModel);
	public boolean savePersonAddrdet(AddresModel addresModel);


}
