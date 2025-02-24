# Java-Spring-Boot-Socket.IO-Client
## create a Spring Boot application that connects to the Socket.IO server and logs the received messages.
## Steps:
    Create a Spring Boot project using Spring Initializr.
        Add dependencies: Spring Web, Lombok (optional, for logging).
    Add the socket.io-client dependency to your pom.xml.
    Create a service to handle Socket.IO communication.
## Run the Client:
    Run the Client:
        Run the following command to download dependencies:
            mvn clean install
        Use the following command to run the Spring Boot application:
            mvn spring-boot:run
        The application will start, and you should see logs in the terminal indicating that the client is connected to the Socket.IO server.
        
        The Node.js server sends messages every 5 seconds.
        The Java Spring Boot client logs the messages.
        Optionally, you can view the messages via the REST API.
        (http://localhost:8080/api/messages)
## NOTE:
    Install Java Development Kit (JDK) from https://adoptium.net/.
    Install Maven from https://maven.apache.org/.
    Also,Created a Spring Boot Project
    