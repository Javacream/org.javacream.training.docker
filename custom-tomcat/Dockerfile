FROM tomcat:8-alpine
RUN rm -rf /usr/local/tomcat/webapps/*
RUN mkdir /usr/local/tomcat/webapps/app
RUN adduser --disabled-password --gecos "" tomcat
COPY index.html /usr/local/tomcat/webapps/app
VOLUME /usr/local/tomcat/webapps
VOLUME /usr/local/tomcat/logs
USER tomcat

