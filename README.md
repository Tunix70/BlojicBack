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

#Docker