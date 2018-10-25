#!/usr/bin/env bash

mvn clean compile;
mvn package;
cd target;
java -jar iri-1.5.4.jar -p 14265 --testnet;

