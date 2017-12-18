# introsde 2017 assignment 3 client
Marco Michelotti (marco.michelotti-1@studenti.unitn.it) 

## Project

### Code analysis

- **PeopleClient**: the Java class that performs the requests to the server and checks whethere the operations are actually executed


### Code tasks

**ivy.xml**

Contains the dependencies to download for the correct execution of the client

**build.xml**

The file build.xml contains the functions to perform with Ant.
	
### Execution

Go to the src folder of the project and run ```wsimport -keep http://sde3usa.herokuapp.com/people?wsdl``` to generate the classes to use in PersonClient.

Now go to the main folder of the project and run: ```ant execute.client```  

### Additional Notes
A huge problem has been found and resolved when trying to comunicate between client and server. Strange errors about ```multiple library definition``` and ```database access permissions```
appeared and avoid the server to response to the client correctly.
The solution was to restart multiple times the server where the WAR file was deployed until no errors appeared in Heroku application log.
