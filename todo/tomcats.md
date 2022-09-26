* mkdir webapps
* mkdir webapps/ROOT
* echo Docker > webapps/ROOT/index.html
* mkdir logs
* mkdir logs/tomcat8
* mkdir logs/tomcat7
* docker create --name tomcat8 -p 9090:8080 --mount type=bind,source="$(pwd)"/webapps,target=/usr/local/tomcat/webapps --mount type=bind,source="$(pwd)"/logs/tomcat8,target=/usr/local/tomcat/logs tomcat:8
* docker create --name tomcat7 -p 9091:8080 --mount type=bind,source="$(pwd)"/webapps,target=/usr/local/tomcat/webapps --mount type=bind,source="$(pwd)"/logs/tomcat7,target=/usr/local/tomcat/logs tomcat:7

