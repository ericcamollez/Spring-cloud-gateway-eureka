Start the Following services in order:

1. DISCOVERY
2. GATEWAY
3. APPLICATIONS

*************
Discovery
*************

mvn spring-boot:run
  http://localhost:8083/
  
*************
Gateway
*************
mvn spring-boot:run
  http://localhost:8080/

*************
APLICAÇÕES
*************

  http://localhost:8081/employee/message
  http://localhost:8082/consumer/message
