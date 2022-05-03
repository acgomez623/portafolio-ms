package indra.makers.portafolio.service;

import indra.makers.portafolio.model.Portafolio;
import indra.makers.portafolio.repository.IPortafolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicesPortafolio {

    @Autowired
    IPortafolioRepository iPortafolioRepository;

     public void crearPortafolio(Portafolio portafolio){
         iPortafolioRepository.save(portafolio);
     }


}
