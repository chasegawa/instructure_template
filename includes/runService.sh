#!/bin/bash

COM_STRING="-Dspring.config.location=classpath:application.properties,/opt/instructure/config/creds.properties -jar /opt/instructure/app.jar"

COM_STRING="$JAVA_OPTS $COM_STRING"

echo "Using $COM_STRING"

# Launch the service
java $COM_STRING

