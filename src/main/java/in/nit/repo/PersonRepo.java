package in.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nit.entity.PersonInfoEntity;

public interface PersonRepo extends JpaRepository<PersonInfoEntity, Integer> {

}
