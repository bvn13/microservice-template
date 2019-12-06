package preorder.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import preorder.model.PreorderEntity;

@Repository
public interface PreorderRepository extends CrudRepository<PreorderEntity, Long> {


}
