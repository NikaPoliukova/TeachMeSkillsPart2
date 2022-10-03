docker run --rm  --name tomcat -p 8080:8080 --network bridge -v "C:\Users\nikan\Downloads\servlet\target\servlet-1.0-SNAPSHOT.war:/usr/local/tomcat/webapps/servlet.war"  tomcat:9.0.53-jdk11-openjdk

docker run --rm  --name custom-tomcat -p 8080:8080 --network bridge servlet:latest

docker run --network bridge --rm curlimages/curl:7.85.0 http://custom-tomcat:8080/servlet/information
