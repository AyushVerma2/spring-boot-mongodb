# spring-boot-mongodb

#### this is an example project , how to use spring boot ,with spring data and mongo db.
''' 1. you need to install and run the mongo db
2. create a spring boot applicaiton to coneect. '''
### this has sample esample to insert a record and use rest service to view.

##### To view the record: http://localhost:8096/rest/users/all

For insertion, i have used commandListner.
eg:
'@Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return strings -> {
            userRepository.save(new Users(1, "Ayush", "Development", 33L));
            userRepository.save(new Users(2, "Verma", "Manager", 20L));
        };
    }'
   
