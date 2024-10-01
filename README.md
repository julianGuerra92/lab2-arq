# Laboratorio 2 - Arquitectura de Software

[![CI/CD Pipeline](https://github.com/julianGuerra92/lab2-arq/actions/workflows/build.yml/badge.svg)](https://github.com/julianGuerra92/lab2-arq/actions/workflows/build.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=julianGuerra92_lab2-arq&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=julianGuerra92_lab2-arq)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=julianGuerra92_lab2-arq&metric=bugs)](https://sonarcloud.io/summary/new_code?id=julianGuerra92_lab2-arq)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=julianGuerra92_lab2-arq&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=julianGuerra92_lab2-arq)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=julianGuerra92_lab2-arq&metric=coverage)](https://sonarcloud.io/summary/new_code?id=julianGuerra92_lab2-arq)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=julianGuerra92_lab2-arq&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=julianGuerra92_lab2-arq)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=julianGuerra92_lab2-arq&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=julianGuerra92_lab2-arq)
[![Coverage Status](https://coveralls.io/repos/github/julianGuerra92/lab2-arq/badge.svg?branch=main)](https://coveralls.io/github/julianGuerra92/lab2-arq?branch=main)

Implementation of a Simple App with the next operations:

* Get random nations
* Get random currencies
* Get random airplanes
* Get application version
* health check

Including integration with GitHub Actions, Sonarqube (SonarCloud), Coveralls and Snyk

### Folders Structure
In the folder `src` is located the main code of the app
In the folder `test` is located the unit tests

### How to install it
Execute:
```shell
$ mvnw spring-boot:run
```

to download the node dependencies

### How to test it
Execute:
```shell
$ mvnw clean install
```

### How to get coverage test
Execute:
```shell
$ mvwn -B package -DskipTests --file pom.xml
```