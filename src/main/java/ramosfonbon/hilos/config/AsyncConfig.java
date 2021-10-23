package ramosfonbon.hilos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @author Victor Ramos ramosfonbon@gmail.com
 */

@Configuration
@EnableAsync
public class AsyncConfig {
    @Bean(name="procesoExecutor")
    public ThreadPoolTaskExecutor procesoExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2);
        executor.setMaxPoolSize(2);
        executor.setQueueCapacity(100);
        executor.setThreadNamePrefix("poolThread-");
        executor.initialize();
        return executor;
    }
}
