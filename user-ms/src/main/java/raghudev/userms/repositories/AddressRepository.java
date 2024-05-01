package raghudev.userms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import raghudev.userms.entities.AddressEntity;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Integer> {
}
