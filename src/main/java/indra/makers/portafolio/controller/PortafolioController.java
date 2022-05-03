
package indra.makers.portafolio.controller;

import indra.makers.portafolio.model.Portafolio;
import indra.makers.portafolio.service.ServicesPortafolio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/Portafolio")
public class PortafolioController {

    @Autowired
    private ServicesPortafolio servicesPortafolio;

    @PostMapping
    public void crearPortafolio(@RequestBody Portafolio portafolio){
        servicesPortafolio.crearPortafolio(portafolio);
    }


}
