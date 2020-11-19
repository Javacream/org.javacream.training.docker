# create a new custom tomcat with index.html

docker run --name tomcat8_work -it tomcat:8 /bin/bash
  root@6c8301263e6d:/usr/local/tomcat# cd webapps
  root@6c8301263e6d:/usr/local/tomcat/webapps# mkdir ROOT
  root@6c8301263e6d:/usr/local/tomcat/webapps# echo JAVACREAM > ROOT/index.html
  root@6c8301263e6d:/usr/local/tomcat/webapps# exit
docker commit tomcat8_work javacream/tomcat:1.0
docker run --rm -p 10082:8080 javacream/tomcat:1.0  /usr/local/tomcat/bin/catalina.sh run

