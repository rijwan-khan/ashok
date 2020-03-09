package in.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nit.entity.AddresEntity;

public interface AddressRepo extends JpaRepository<AddresEntity, Integer>
{


}
