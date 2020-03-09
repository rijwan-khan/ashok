package in.nit.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.entity.AddresEntity;
import in.nit.entity.PersonInfoEntity;
import in.nit.model.AddresModel;
import in.nit.model.PersonInfoModel;
import in.nit.repo.AddressRepo;
import in.nit.repo.PersonRepo;

@Service
public class PersonServiceimpl implements PersonService {
	@Autowired
	private PersonRepo repo;
	@Autowired
	private AddressRepo addrepo;

	@Override
	public boolean savePersonDetails(PersonInfoModel personInfoModel) {

		PersonInfoEntity entity = new PersonInfoEntity();
		BeanUtils.copyProperties(personInfoModel, entity);
		entity = repo.save(entity);
		if (entity != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean savePersonAddrdet(AddresModel addresModel) {

		AddresEntity entity = new AddresEntity();
		BeanUtils.copyProperties(addresModel, entity);
		entity = addrepo.save(entity);
		if (entity != null) {
			return true;
		}
		return false;
	}

}
