* docker create --name work alpine
* docker cp hello work:/
* docker commit -c 'CMD ["/hello"]' work javacream/alpine-hello
* docker run --rm javacream/alpine-hello
  * Ausgabe des bekannten hello-world-Textes
* docker rm work
* docker run --rm javacream/alpine-hello ls
  * Auflisten der Dateien, hier ist nun ja die Alpine-Distribution verfügbar
* docker run --rm -it javacream/alpine-hello sh
  * das übliche...
  * 
