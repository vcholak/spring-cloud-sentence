### Microservices with Spring Cloud Netflix

Application assemles a sentence from words provided by word services.

Config server provides the location of the Eureka server and 'words' property for each word service.

1. Building

If Gradle is installed, use it to build: gradle build.

If Gradle is not installed, use the wrapper to build: gradlew build.

First build Eureka server and Config server.

To build word services, Config server must be running otherwise integration tests fail.

2. Running

Start the Config server. Start the Eureka server.

Start all of the word services and the sentence service. 

Since each service uses a separate port, they should be able to run side-by-side on the same computer.

Check the Eureka server running at [http://localhost:8010](http://localhost:8010). Ensure that all of the word services and the sentence service are eventually listed in the Application section.

Open [http://localhost:8020/sentence](http://localhost:8020/sentence) to see the completed sentence. 

Refresh the sentence service URL and watch the sentence change.

3. Using multiple Eureka Servers

Edit your computer's /etc/hosts file. Add the following lines and save your work:

  ```
  # START section for Microservices with Spring Course
  127.0.0.1       eureka-primary
  127.0.0.1       eureka-secondary
  127.0.0.1       eureka-tertiary
  # END section for Microservices with Spring Course
  ```

Start 3 Eureka servers:

  ```
  java -jar -Dspring.profiles.active=primary eureka-server-1.0.0.jar
  java -jar -Dspring.profiles.active=secondary eureka-server-1.0.0.jar
  java -jar -Dspring.profiles.active=tertiary eureka-server-1.0.0.jar
  ```

4. Dynamic Configuration Changes

We want to change an app configuration without restarting the app.

With all servers and apps running, update one of the words properties of application.yml in the config-data directory, and push the change to the GitHub repository.

Then issue the following POST request to the config server:

  ```
  curl -X POST http://localhost:8001/bus/refresh
  ```

Refresh the sentence service URL and watch the sentence change.


5. TODO list

Enable security management for Config server

WARN: spring-cloud-starter-eureka is deprecated as of Spring Cloud Netflix 1.4.0, please migrate to spring-cloud-starter-netflix-eureka

WARN: spring-cloud-starter-eureka-server is deprecated as of Spring Cloud Netflix 1.4.0, please migrate to spring-cloud-starter-netflix-eureka-server



