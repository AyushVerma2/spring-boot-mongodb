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


I have used community verison of mongo db ,install on my Mac and started :
to install . >  brew install mongodb-community@4.2
to configure: 
   >the configuration file (/usr/local/etc/mongod.conf)
   > the log directory path (/usr/local/var/log/mongodb)
  > the data directory path (/usr/local/var/mongodb)
  
 To run MongoDB (i.e. the mongod process) as a macOS service, issue the following:
 brew services start mongodb-community@4.2
 
 To run MongoDB manually as a background process, issue the following:
mongod --config /usr/local/etc/mongod.conf --fork

To verify that MongoDB is running, search for mongod in your running processes:
ps aux | grep -v grep | grep mongod

To begin using MongoDB, connect a mongo shell to the running instance. From a new terminal, issue the following:
mongo

To check which db is used , open mongo terminal by typing mongo , and then 
> db  - it will show which db
> use userdb  - it will create userdb
> show dbs . > show all the db, if db is not row it will bot be displayed
> db.movie.insert({"name":"tutorials point"}) .  to insert
** In MongoDB default database is test. If you didn't create any database, then collections will be stored in test database.
db.dropDatabase() . : to drop the databse

To create collection : createCollection() Method
db.createCollection(name, options) ;// options is optinal
  options can be capped,autoindex,size,max
  
 In MongoDB, you don't need to create collection. MongoDB creates collection automatically, when you insert some document.

>db.tutorialspoint.insert({"name" : "tutorialspoint"})
>show collections
>db.COLLECTION_NAME.drop()
Read: https://www.tutorialspoint.com/mongodb/mongodb_datatype.htm


----
Link:
https://docs.mongodb.com/manual/tutorial/install-mongodb-on-os-x/



   
