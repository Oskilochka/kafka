# Apache Kafka with Spring boot

### Apache Kafka Quickstart
1. Get Kafka - [Download](https://www.apache.org/dyn/closer.cgi?path=/kafka/3.6.0/kafka_2.13-3.6.0.tgz)
2. Start the kafka enviroment:
   - Start the ZooKeeper service - `bin/zookeeper-server-start.sh config/zookeeper.properties`
   - Start the Kafka broker service - `bin/kafka-server-start.sh config/server.properties`
   - Create a topic  `bin/kafka-topics.sh --create --topic topic-name --bootstrap-server localhost:9092`
   - Read the events `bin/kafka-console-consumer.sh --topic topic-name --from-beginning --bootstrap-server localhost:9092`
   - Write event into topic `bin/kafka-console-producer.sh --topic topic-name --bootstrap-server localhost:9092`

#### Kafka-wikimedia
* Spring Boot Reactive with Kafka for real-time data processing 
* Work with https://stream.wikimedia.org/v2
>To check how its works do this: 
 1. Start the producer app to read a streaming data and transmit messages to Kafka broker.
   2. Start the consumer app to retrieve messages from a Kafka topic
   3. Send a get request http://localhost:1010/api/v1/wikimedia via Postman
   4. Consumer will recieve all messages
  <img width="1285" alt="Screenshot 2023-12-07 at 18 59 13" src="https://github.com/Oskilochka/kafka/assets/57913900/69620574-091a-47b5-abb0-53e7a989227b">

 


#### Kafka-spring Example
- String value
<img width="705" alt="Screenshot 2023-12-07 at 13 53 24" src="https://github.com/Oskilochka/kafka-spring/assets/57913900/66212a5a-39e0-4cc6-8438-bf39643218bc">
<img width="608" alt="Screenshot 2023-12-07 at 13 53 32" src="https://github.com/Oskilochka/kafka-spring/assets/57913900/739ef0ae-573f-425a-a886-d51fed2184f8">

- Json value with KafkaListener
<img width="658" alt="New Request" src="https://github.com/Oskilochka/kafka-spring/assets/57913900/ba780506-05ef-44a2-b1b1-dc0ef30b4d96">
<img width="1090" alt="Screenshot 2023-12-07 at 14 46 21" src="https://github.com/Oskilochka/kafka-spring/assets/57913900/a43f9a76-690f-41e5-adb3-807c5448985c">




---
*based on [Bouali Ali](https://www.youtube.com/watch?v=KQDTtvZMS9c&ab_channel=BoualiAli)*
