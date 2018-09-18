docker create --name tomcat -p 8080:8080 --mount type=bind,source=/tomcat_logs,target=/usr/local/tomcat/logs -v tomcat_webapps:/usr/local/tomcat/webapps tomcat:9-jre8-alpine
