FROM maven:3.6.3-jdk-11

WORKDIR /app

ADD . /app
RUN mvn clean package -DskipTests=true -Ddir=app
RUN mv target/elk-order-service-1.0.0.jar elk-order-service-1.0.0.jar

ENTRYPOINT ["sh","-c","java $JAVA_OPTS -Djava.security.egd=file:/dev/.urandom -jar elk-order-service-1.0.0.jar"]
