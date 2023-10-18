### Tomcat 8

* docker create --mount type=bind,source=./webapps,target=/usr/local/tomcat/webapps  --mount type=bind,source=./logs/tomcat8,target=/usr/local/tomcat/logs --name tomcat8 -p 9090:8080 tomcat:8

### Tomcat 7

* docker create --mount type=bind,source=./webapps,target=/usr/local/tomcat/webapps  --mount type=bind,source=./logs/tomcat7,target=/usr/local/tomcat/logs --name tomcat7 -p 9091:8080 tomcat:7
