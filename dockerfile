FROM openjdk:8-jdk-alpine as buildstage
WORKDIR /app
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src
COPY start_app.sh .
RUN ./mvnw package
COPY target/*.jar app.jar

FROM openjdk:8-jdk-alpine
COPY --from=buildstage /app/app.jar .
COPY --from=buildstage /app/start_app.sh .
#ENTRYPOINT ["java","-jar","/app.jar"]
ENTRYPOINT ["./start_app.sh"]