package ramosfonbon.hilos.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ramosfonbon.hilos.model.Proceso;
import ramosfonbon.hilos.model.SimpleResponse;
import ramosfonbon.hilos.service.ProcesoService;

import java.util.concurrent.CompletableFuture;

/**
 * @author Victor Ramos ramosfonbon@gmail.com
 */

@RestController
public class hilosController {
    private int localId = 1;

    private static final Logger LOGGER = LoggerFactory.getLogger(hilosController.class);

    @Autowired
    private ThreadPoolTaskExecutor procesoExecutor;

    @Autowired
    ProcesoService procesoService;

    @PostMapping(value = "/proceso/new")
    public Proceso newProceso(@RequestBody Proceso proceso){
        Proceso p = new Proceso();
        p.setId(localId++);
        p.setNombre("Proceso: " + proceso.getNombre());
        p.setEspera(proceso.getEspera());
        LOGGER.info("Proceso {} creado.", p.getId());
        CompletableFuture<SimpleResponse> completableFuture = procesoService.newProceso(p);
        LOGGER.info("ProcessId {} enviado a creación. Regresando del controller", p.getId());
        return p;
    }
}
