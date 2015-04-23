JDK version: 1.8
Apllication work with PostgreSQL 9.1 database (will migrate to MySQL):
	scheme: theniversalgraph; 
	username: theniversalgraph; 
	password theniversalgraph; 
	port:3306.
Use gradle to compile sources: 
	$ gradle clean build (https://gradle.org)
Gradle command to run application:
	$ gradle bootRun
Gradle command to run tests:
	$ gradle test
Framework:
	Spring Boot 1.2.3 (http://projects.spring.io/spring-boot/)
If you want to use Swagger:
	{host}:{port}/swagger/index.html
Currently implemented REST API:
	getAllNodes (GET /api/v1/nodes)
	getNode (GET /api/v1/nodes/{id})
	deleteNode (DELETE /api/v1/nodes/{id})
	updateNode (PATCH GET /api/v1/nodes/{id})
	
	
	