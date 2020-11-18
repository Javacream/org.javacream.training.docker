# Erzeugen der polymorphic Tomcat Container mit mounts für webapps und log

docker create --name tomcat8 -p 10080:8080 -v /web/apps:/usr/local/tomcat/webapps -v /web/logs/tomcat8:/usr/local/tomcat/logs tomcat:8
docker create --name tomcat9 -p 10081:8080 -v /web/apps:/usr/local/tomcat/webapps -v /web/logs/tomcat9:/usr/local/tomcat/logs tomcat:9

docker create --name tomcat8 -p 10080:8080 --mount type=bind,source=/web/apps,target=/usr/local/tomcat/webapps --mount type=bind,source=/web/logs/tomcat8,target=/usr/local/tomcat/logs -v tomcat8_conf:/usr/local/tomcat/conf tomcat:8
docker create --name tomcat9 -p 10081:8080 --mount type=bind,source=/web/apps,target=/usr/local/tomcat/webapps --mount type=bind,source=/web/logs/tomcat9,target=/usr/local/tomcat/logs -v tomcat9_conf:/usr/local/tomcat/conf tomcat:9

