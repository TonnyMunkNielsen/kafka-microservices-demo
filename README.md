# User guide

1. Install Docker Desktop (for non-commercial use, it can be used without license)
2. In cmd run:
   - *cd docker*
   - *docker compose up -d*
3. Make sure you have the following (VSCode) extensions installed:
   - Java
   - Git Extension Pack
   - Lombok Annotations Support for VS Code
   - Spring Boot Extension Pack
   - Gradle for Java
   - Markdown All in One
4. Build the gradle applications (refreshing dependencies)
   - *cd consumer-service*
   - *gradlew build*
   - *cd ..*
   - *cd producer-service*
   - *gradlew build*
   - *cd ..
5. Deploy both applications from the (VCS) Project Explorer
   - Right click KafkaConsumerApplication and choose "Run Java"
   - Right click KafkaProducerApplication and choose "Run Java"
6. Test the Kafka communication:
   - *curl -X POST "http://localhost:8082/api/kafka/publish?message=hello"*
   - Response is "Consumed message: hello"