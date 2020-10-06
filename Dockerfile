FROM openjdk:11
VOLUME /tmp
ADD build/libs/*.jar mybootdemo.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","mybootdemo.jar"]