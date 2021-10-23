package ramosfonbon.hilos.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import ramosfonbon.hilos.model.Proceso;
import ramosfonbon.hilos.model.SimpleResponse;

import java.util.concurrent.CompletableFuture;

@Service
public class ProcesoService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProcesoService.class);

    @Async
    public CompletableFuture<SimpleResponse> newProceso(Proceso p) {

        int id = p.getId();
        int espera = p.getEspera();

        LOGGER.info("Recibida petición {}", id);
        try {
            LOGGER.info("RUNNING {}", id);
            p.setEstado("RUNNING");
            Thread.sleep(espera);
            procesoFalso(id);

        } catch (InterruptedException e) {
            LOGGER.error("Error creando proceso.", e);

            return null;

        } finally {
            //file.delete();
        }

        LOGGER.info("TERMINATED {}", id);
        p.setEstado("TERMINATED");


        return CompletableFuture.completedFuture(new SimpleResponse("Fin del Hilo", id));
    }

    void procesoFalso(int idFalso) throws InterruptedException {
        LOGGER.info("Proceso falso {}!!!!!", idFalso);
        Thread.sleep(2000);
        for (int i = 0; i<=1000000;i++){
            int x = i;
        };
    }
}
