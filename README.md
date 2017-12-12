# spring-boot-rabbitmq-pub-sub

Following are the API details :

API - Producer Api

For msgQueue(String) uri - http://localhost:8080/scriptuit-rabbitmq/send?msg={msg}

For queue(custom object) uri - http://localhost:8080/scriptuit-rabbitmq/producer?empName={empName}&empId={empId}

Request Method - GET

Response Code - 200 Ok

Response body - Message sent to the RabbitMQ Scriptuit Successfully
