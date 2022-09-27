* Im aktuellen Arbeitsverzeichnis ROOT/index.html anlegen
* docker create --name tomcat_work tomcat:8
* docker cp ./ROOT tomcat_work:/usr/local/tomcat/webapps
  * Container wird nicht gestartet! Log-Dateien will ich nicht im Live-Dateisystem haben
* docker commit tomcat_work javacream/tomcat:1.0
* docker run --rm -p 9092:8080 javacream/tomcat:1.0 
  * CHECK: http://localhost:9092 zeigt die index.html an
* docker rm tomcat_work
