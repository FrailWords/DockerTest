# DockerTest

## Command Line

### Running the application

``./gradlew clean bootRun``

The application would come up on port `8080`.

E.g.

``curl http://localhost:8080/date`` to get the current date-time.

### Running the tests

``./gradlew clean test``

### Build JAR file and run

You can create a JAR file for this application using -

``./gradlew clean build jar``

The JAR file would be created in the `build/libs` folder.

You can now run the application like -

``java -jar build/libs/server.jar``


## Docker

To build the docker image -

`` ./gradlew buildDocker ``



You can push the image to the registry using -

`` ./gradlew buildDocker -Ppush ``