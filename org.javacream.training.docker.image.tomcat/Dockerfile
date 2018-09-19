FROM tomcat:8.5.32-slim
RUN rm -r webapps
RUN mkdir webapps
RUN mkdir webapps/ROOT
EXPOSE 8080
ADD hello.html /usr/local/tomcat/webapps/ROOT/hello.html