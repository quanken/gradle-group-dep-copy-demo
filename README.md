# Purpose

This project is used to demonstrate how gradle group dependencies work and how to implement group dependencies copy when you want to archive your libraries


# Environment

Gradle 3.4.1
OpenJDK 1.8.x

# How to use it

```bash
# exec in command line
$ gradle copyApache

# apache libs define in build.gradle will be copy into build/output/apache 

$ gradle copyLogs

# log libs define in build.gradle will be copy into build/output/log 
```

