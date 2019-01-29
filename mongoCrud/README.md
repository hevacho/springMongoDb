##Basic mongoDB with spring-data

Basic example of using spring-data with a mongoDB

###Getting started
To run the project you need to configure the properties of mongo in application.properties

```
spring.data.mongodb.host=127.0.0.1
spring.data.mongodb.port=37017
spring.data.mongodb.database=springMongoTutorial

```

Then you can run as spring boot application or use

```
mvn spring-boot:run

```

Finally you can do the appropiate request to your localhost.

```
http://localhost:8080/persona/all

```

####Json Sample

```
{
"id": "5c4b3ebcb95ce90bd73fe45c",
"nombre": "miNombre",
"apellido": "miApellido"
}
```
