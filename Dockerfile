FROM maven:3.9.6-eclipse-temurin-21

WORKDIR /app
# Copy pom.xml and download dependencies
COPY pom.xml .
#RUN mvn dependency:go-offline

# Copy the entire source code
COPY src ./src

RUN mvn clean package -DskipTests -U

RUN ls -ltr target
RUN mv target/app-store-vale-core.jar ./app.jar

ENV SPRING_PROFILES_ACTIVE=prod

CMD exec java -jar -Dspring.profiles.active=prod app.jar -XX:NativeMemoryTracking=summary -XX:+UnlockDiagnosticVMOptions -XX:+PrintNMTStatistics