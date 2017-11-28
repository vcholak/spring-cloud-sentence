### Microservices with Spring Cloud

Application assemles a sentence from words provided by word services.

Config server provides the location of the Eureka server and 'words' property for each word service.

1. Building

If Gradle is installed, use it to build: gradle build
If Gradle is not installed, use the wrapper to build: gradlew build

First build Eureka server and Config server.

To build word services, Config server must be running otherwise integration tests fail.

2. Running

Start the Eureka server. Start the Config server. 

Start all of the word services and sentence service. 
Since each service uses a separate port, they should be able to run side-by-side on the same computer. 

Open [http://localhost:8020/sentence](http://localhost:8020/sentence) to see the completed sentence. 

Refresh the URL and watch the sentence change.


