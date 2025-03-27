# Building the project
Booted up spring initializr, and chose to create a maven project in java that utilizes spring boot. 

Then I created the necessary classes ( a resource entity class for the tables, a controller class for the api calls and requests, a repository class for the interface)  and finally I included the necessary dependencies in the pom xml and the properties in the application.properties file. 

I should add that I used h2 for my nosql database of choice meaning that when the computer or program get restarted the contents of the “database” will be lost.

# How to compile the project
In order to compile the project into a jar file : simply, in the “station/net/Rest” directory execute mvn clean install and then mvn clean package in order to package the project into a jar file.

In the directory where the jar file has been saved execute it in the commandline by typing : java -jar Rest-0.0.1-SNAPSHOT.jar.(it will run on 8080 local host)

#For testing functionality

Following that, in order to create rest api requests to the crud I utilized postman in order to execute the needed requests, namely :
	
##Get http://localhost:8080/resources , in order to view the resource 	table

##Put http://localhost:8080/resources/update/id in order to update the values of a specific resource

##Post http://localhost:8080/resources/resources/save and a properly built raw text in json format contained in the body in order to save a resource 

##Delete http://localhost:8080/resources/delete/id in order to delete a resource


   
