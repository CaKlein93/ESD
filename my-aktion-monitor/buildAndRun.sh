#!/bin/sh
mvn clean package && docker build -t de.dpunkt/my-aktion-monitor .
docker rm -f my-aktion-monitor || true && docker run -d -p 8080:8080 -p 4848:4848 --name my-aktion-monitor de.dpunkt/my-aktion-monitor 
