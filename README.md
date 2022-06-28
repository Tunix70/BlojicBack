# Introduction
Blojic System backend module

# Getting Started
## Prerequisites
 - Postgres DB
 - Docker - for integration test

# Local run
 - create application-local.yaml with the following content
```
   Blojic:
      db: 
        url: jdbc:postgresql://localhost:5432/blojic
        username: postgres
        password: test
```
- run as a Spring boot application with local profile (in case of Intellij Community can be set via VM option -Dspring.profiles.active=local)
- in order to run on another port to add: -Dserver.port=8090
#Docker