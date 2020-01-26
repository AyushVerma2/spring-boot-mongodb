### spring-boot+spring-data+mongodb

#### this is an example project , how to use spring boot ,with spring data and mongo db.
1. you need to install and run the mongo db
2. create a spring boot applicaiton to coneect. 
    
### This has sample esample to insert a record and use rest service to view.

###### To view the record: http://localhost:8096/rest/users/all

#### To insert a record,I have used commandListner .
eg:
```xml
'@Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return strings -> {
            userRepository.save(new Users(1, "Ayush", "Development", 33L));
            userRepository.save(new Users(2, "Verma", "Manager", 20L));
        };
    }
```
    
POM:
```xml
<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-mongodb</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
        ```


   
