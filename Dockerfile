FROM java:8u111-jdk

ADD startup.sh /usr/bin/startup.sh
RUN chmod +x /usr/bin/startup.sh

CMD ["/usr/bin/startup.sh"]

ADD target/springboot-demo-keycloak-0.0.1-SNAPSHOT.jar /usr/share/bnp-monica/springboot-demo-keycloak.jar