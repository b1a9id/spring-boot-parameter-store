# Spring Boot with AWS System Manager Parameter Store
<a href="https://trackgit.com">
<img src="https://sfy.cx/u/xdg" alt="trackgit-views" />
</a>

## Requires
- .aws/credentials
- .aws/config

## Try it
Create DB
```
$ docker-compose up --build
```

Run App(spring.profiles.active=default)
```
$ ./gradlew clean bootRun
```

Run App(spring.profiles.active=test)
```
$ ./gradlew clean -Dspring.profiles.active=test bootRun
```
