### Create Commands

* docker create --name webserver1 --mount type=bind,source="$(pwd)"/logs/webserver1,target=/usr/local/tomcat/logs --mount type=bind,source="$(pwd)"/webapps,target=/usr/local/tomcat/webapps -p 9090:8080 tomcat:8
* docker create --name webserver2 --mount type=bind,source="$(pwd)"/logs/webserver2,target=/usr/local/tomcat/logs --mount type=bind,source="$(pwd)"/webapps,target=/usr/local/tomcat/webapps -p 9091:8080 tomcat:7
* docker create --name webserver1_volume --mount type=bind,source="$(pwd)"/logs/webserver2,target=/usr/local/tomcat/logs -v webapps:/usr/local/tomcat/webapps -p 9092:8080 tomcat:8
* docker create --name webserver2_volume --mount type=bind,source="$(pwd)"/logs/webserver2,target=/usr/local/tomcat/logs -v webapps:/usr/local/tomcat/webapps -p 9093:8080 tomcat:7

