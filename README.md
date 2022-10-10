# Introduction
Blojic System backend module

# Getting Started
## Prerequisites
 - Postgres DB
 - Docker - for integration test

#Create and setup DB locally
Run postgres in a docker with a command line

    docker run --name blojic -e POSTGRES_DB=blojicDB -e POSTGRES_PASSWORD=%your_db_password% -d -p 5442:5432 postgres:11.1

You can connect to it using docker
    
    docker exec -it blojic psql -U blojicDB

# Local run
- create application-local.yaml which should be the sane as application-local-template.yaml but with the filling fields
- run as a Spring boot application with local profile (in case of Intellij Community can be set via VM option -Dspring.profiles.active=local)
- in order to run on another port to add: -Dserver.port=8090
