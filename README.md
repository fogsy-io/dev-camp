# Prerequisites
* OS:
  * Linux 
  * OSX
	* Windows10
* Docker - Docker Compose
* Java - Maven
* IDE (IntelliJ)

# 1. Install StreamPipes
* Download the StreamPipes installer from GitHub
  * Link: https://github.com/streampipes/streampipes-installer
* Open terminal and navigate to the installer directory 
* Select the folder according to your operating system:
  * Windows: "windows10"
	* Linux / OSX: "osx_linux"
* Run command `./streampipes start`


# 2. Build your first pipeline
Create a live monitoring system for the International Space Station (ISS)

* Link für ISS Daten:
  * http://api.open-notify.org/iss-now.json
* Download ISS adapter template
* Go to StreamPipes Connect an click on "Upload Adapter Template" (Top right corner)
* Select the adapter in the UI and start it
* Navigate to the Pipeline Editor 
* The ISS data source is now listed in the Data Streams tab


# 3. Develop a new Processor 

* Create a folder and run the following command:
```
mvn archetype:generate                                           \
  -DarchetypeGroupId=org.streampipes                             \
  -DarchetypeArtifactId=streampipes-archetype-pe-processors-jvm  \
  -DarchetypeVersion=0.60.1
```
* Settings:
  * Group id: org.streampipes.example
  * Artifact id: GeoMonitoring
  * Version: Hit Enter
  * Package: Hit Enter
  * Last Step: Y

* Open new Project in IDE (IntelliJ)
