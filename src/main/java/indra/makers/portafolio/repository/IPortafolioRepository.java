package indra.makers.portafolio.repository;

import indra.makers.portafolio.model.Portafolio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPortafolioRepository extends CrudRepository <Portafolio, Integer> {



}
