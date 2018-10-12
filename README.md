# Uptime-Dashboard

Uptime Dashboard aggregates together 4 Uptime web pages into a single dashboard.

## Dependencies

jsimone/webapp-runner - webapprunner.jar
OpenMake-Software/Uptime - uptime.war
OpenMake-Software/Uptime-Dashboard - uptime-dashboard.war

## Building

Run the following from the same directory as the pom.xml

```mvn package 
```

## Running

```
java -DTCNODE="Node 1" -jar webapp-runner.jar --port 9191 uptime.war &
java -DTCNODE="Node 2" -jar webapp-runner.jar --port 9292 uptime.war &
java -DTCNODE="Node 3" -jar webapp-runner.jar --port 9393 uptime.war &
java -DTCNODE="Node 4" -jar webapp-runner.jar --port 9494 uptime.war &
java -Dhostname=localhost -jar webapp-runner.jar --port 9090 uptime-dashboard.war &
```

## Accessing the Dashboard

http://localhost:9090/InitServer

