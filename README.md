# Asynchronous communication between Microservices with RabbitMQ
This mono repo contains two microservices projects wich I used to implement Asynchronous communication between them, using RabbitMQ.

### Running the project on your machine

- clone <a href="https://github.com/pedroluiznogueira/microservices-messaging-producer">producer microservice</a>
- clone <a href="https://github.com/pedroluiznogueira/microservices-messaging-consumer">consumer microservice</a>
- both projects contain a docker-compose.yml
- use any of them to run the rabbitmq container
- under the root directory of the project you chose run
- <b>docker-compose up</b>
- go to <b>localhost:15672</b>
- log into rabbitmq using <b>guest</b> as user and password

### Producer microservice

- repository for <a href="https://github.com/pedroluiznogueira/microservices-messaging-producer">producer microservice</a>

### Consumer microservice

- repository for <a href="https://github.com/pedroluiznogueira/microservices-messaging-consumer">consumer microservice</a>

### My medium article developing this project

- <a href="https://pedroluiznogueira.medium.com/rabbitmq-with-java-and-spring-asynchronous-communication-between-microservices-c087595c500b">check it out </a>

