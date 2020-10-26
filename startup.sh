#!/bin/bash
docker build -t creditcardvalidator:1.0 .
docker run -d -p 8080:8080 --name creditcardvalidator creditcardvalidator:1.0