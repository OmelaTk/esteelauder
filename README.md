# Simple Framework
Thi is very simple testing framework to test opening 2 menu items on www.esteelauder.com landing page

## Clone repo
clone repository using
```shell
clone https://github.com/OmelaTk/esteelauder.git
```

## How to run
to run tests use Maven. (https://maven.apache.org/)
Maven should be installed on target computer and maven executable files should be added to path

### To run in Chrome Browser
Chrome should be installed
```shell
mvn clean test -Dbrowser=chrome
```

### To run in Firefox Browser
Firefox should be installed
```shell
mvn clean test -Dbrowser=firefox
```