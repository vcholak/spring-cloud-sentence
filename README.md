### Microservices with Spring Cloud Netflix

Application assemles a sentence from words provided by word services.

Config server provides the location of the Eureka server and 'words' property for each word service.

1. Building

If Gradle is installed, use it to build: gradle build.

If Gradle is not installed, use the wrapper to build: gradlew build.

First build Eureka server and Config server.

To build word services, Config server must be running otherwise integration tests fail.

2. Running

Start the Eureka server. Start the Config server. 

Start all of the word services and sentence service. 

Since each service uses a separate port, they should be able to run side-by-side on the same computer. 

Open [http://localhost:8020/sentence](http://localhost:8020/sentence) to see the completed sentence. 

Refresh the URL and watch the sentence change.

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

4. TODO list

WARN: spring-cloud-starter-eureka is deprecated as of Spring Cloud Netflix 1.4.0, please migrate to spring-cloud-starter-netflix-eureka

WARN: spring-cloud-starter-eureka-server is deprecated as of Spring Cloud Netflix 1.4.0, please migrate to spring-cloud-starter-netflix-eureka-server



