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
7. Type in some lines of text. Each line is a new message.
   .this is my first kafka message
   .hello world!
   .this is my third kafka message. I’m on a roll :-D

   When you’ve finished, press Ctrl-D to return to your command prompt.
   refer : https://developer.confluent.io/quickstart/kafka-docker/
   
