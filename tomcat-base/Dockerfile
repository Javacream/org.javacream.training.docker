FROM tomcat:8-alpine
RUN rm -rf /usr/local/tomcat/webapps/*
RUN adduser --disabled-password --gecos "" tomcat
VOLUME /usr/local/tomcat/webapps
VOLUME /usr/local/tomcat/logs
USER tomcat

