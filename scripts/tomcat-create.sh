docker create --name tomcat -p 8080:8080 --mount type=bind,source=/tomcat8_logs,target=/usr/local/tomcat/logs -v tomcat_webapps:/usr/local/tomcat/webapps tomcat:8.5-slim

docker create --name tomcat -p 9090:8080 --mount type=bind,source=/tomcat9_logs,target=/usr/local/tomcat/logs -v tomcat_webapps:/usr/local/tomcat/webapps tomcat:9.0-slim
