* docker pull tomcat:8
* docker create --name tomcat8 tomcat:8
* docker inspect tomcat8 
  * CHECK: [catalina.sh, run]
* docker export -o tomcat8.tar tomcat8
  * CHECK /usr/local/tomcat/logs ist leer
* docker start tomcat8
* Log-Dateien über export
  * docker export -o tomcat8.tar tomcat8
    * CHECK /usr/local/tomcat/logs enthält Dateien
* Log-Dateien über Kopieren des logs-Verzeichnisses auf den Host
  * docker cp tomcat8:/usr/local/tomcat/logs .
