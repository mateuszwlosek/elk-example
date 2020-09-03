# ELK (Elasticsearch - Logstash - Kibana) Example

Example of [Elasticsearch](https://www.elastic.co/), [Logstash](https://www.elastic.co/logstash), [Kibana](https://www.elastic.co/kibana) with [Zipkin](https://zipkin.io/), [Sleuth](https://spring.io/projects/spring-cloud-sleuth) and [Spring Boot](https://projects.spring.io/spring-boot/)  
 
Used [Docker](https://www.docker.com/) to containerize environment.  
[MongoDB](https://www.mongodb.com/) was used to store some example data.

## ELK
![ELK](https://user-images.githubusercontent.com/15820051/87459833-877a5700-c5d1-11ea-97e8-a917ed89e5de.png)

## Books service and orders service
* Two example services to test ELK.
* Books service requests orders-service so two logs are generated in a matter of one request. Two of them have the same `traceId`.

## How to run the environment?

### Before you start
* Make sure you have `Docker` and `docker-compose` installed.

[Docker CE INSTALLATION](https://docs.docker.com/install/linux/docker-ce/ubuntu/)  
[Docker Compose INSTALLATION](https://docs.docker.com/compose/install/#prerequisites)

### Start the environment
1. Build services:
    `docker-compose build`
2. Run services:
    `docker-compose up`
3. Request books-sevice to generate logs:
    `curl -X POST -I "localhost:8484/book/buy/The%20Great%20Gatsby?userName=testUserName"`

### Important endpoints:
* http://localhost:5601 - Kibana (At first launch it will ask for an index -> Type `log*` and select `@timestamp` for `time filter field name`)
* http://localhost:9411 - Zipkin

![Kibana](https://user-images.githubusercontent.com/15820051/87460821-150a7680-c5d3-11ea-9cbc-e14dc5c50f2a.png)
![Zipkin](https://user-images.githubusercontent.com/15820051/87460883-2fdceb00-c5d3-11ea-9edd-2ab18c3af88b.png)
