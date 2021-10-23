### Creating threads in SpringBoot using CompletableFuture()

- Maven project tested with java 11
- Run the app
- Send POST request
  
POST http://localhost:8080/proceso/new

Content-Type: application/json

{"nombre": "Proceso: 5","espera": 3000}

**nombre** is the name of the thread being created

**espera** is the delay inside the thread (simulates process time)

Create different processes assigning different _**espera**_ times (millis), 
you won't have to wait an answer to the POST request because of the async call; 
check the log for processes completion.