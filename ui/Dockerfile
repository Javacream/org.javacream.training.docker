FROM ubuntu
RUN apt-get update && apt-get install -y firefox
RUN apt install -y xauth
COPY startup.sh /
RUN touch /root/.Xauthority
RUN chmod 777 /startup.sh
CMD ["/startup.sh"]