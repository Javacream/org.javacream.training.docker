FROM jboss/wildfly:10.1.0.Final
RUN /opt/jboss/wildfly/bin/add-user.sh javacream javacream1234!
ADD jee.war wildfly/standalone/deployments/jee.war
ADD jolokia-war-1.5.0.war wildfly/standalone/deployments/jolokia.war
ADD  hawtio-default-offline-1.5.7.war wildfly/standalone/deployments/hawtio.war
EXPOSE 9990
EXPOSE 8787
ENTRYPOINT /opt/jboss/wildfly/bin/standalone.sh --debug -b 0.0.0.0 -bmanagement=0.0.0.0