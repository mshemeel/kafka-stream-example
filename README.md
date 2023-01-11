# kafka-stream-example
Kafka consumer


# commands 
1. docker-compose file in src/main/resources
2. docker-compose -f <file-name>.yml up
3. create a topic 
4. cd /usr/bin
   kafka-topics --bootstrap-server kafka:9092 \--create \--topic quickstart
6. add message to topic
   kafka-console-producer --bootstrap-server kafka:9092 \--topic quickstart
