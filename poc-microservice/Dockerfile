FROM openjdk:11-jre-slim-buster

ENV APP_FILE app.jar
ENV APP_HOME /usr/apps

EXPOSE 8080

COPY target/*.jar $APP_HOME/$APP_FILE

WORKDIR $APP_HOME

ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar -Dspring.profiles.active=mysql $APP_FILE"]