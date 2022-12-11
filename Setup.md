# General info
This Project is used for Creating Rest API using Sprint Boot and HashMap. All the the data is stored and retrieved from Hashmap.

**How to run the given application through IDE :**

1.To Execute run SdetSpringApplication.java file. 

2.To test APIs navigate to localhost:8080/swagger-ui.html.

3.Exposed Endpoints are also tested using MockMVC. MockMVC does not require Spring Boot to be started for testing the endpoints.

4.Swagger is configured with the help of SpringDoc-OpenAPI-UI Java library.

**How to run the application using docker file**

The projects docker file has been pushed to docker hub(https://hub.docker.com/repository/docker/visheshdocker/sdetspringprojects). One can pull and run the project usind docker image **visheshdocker/sdetspringprojects** from docker hub using below command

**To Pull Docker Image**

```js
docker pull visheshdocker/sdetspringprojects
```

**To Run Docker Image**

```js
docker run -p 9090:8080 visheshdocker/sdetspringprojects
```

In the above command port 9090 is the local machine port mapped to container port 8080.

Once the above commands are executed, then we can test the API created using the given project on swagger url localhost:9090/swagger-ui.html


