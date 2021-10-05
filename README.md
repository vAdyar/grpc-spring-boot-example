#gRPC Spring boot
<hr/>
Steps to run the project

* Build the ```greeting-common``` module using maven 
  ```mvn clean install```
* Build the ```greeting-service``` module. This has a dependency on ```greeting-common```
* Run the generated jar file with ```java -jar greeting-service/target/*jar```

Use [BloomRPC](https://github.com/uw-labs/bloomrpc) to call the APIs.