package com.example.demo.topic;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TopicConsumer {

	@KafkaListener(topics ="Kafka_Example", groupId="group_id")
	public void consume(String message) {
		System.out.println("Consumed message : " + message);
	} 
	
	@KafkaListener(topics ="Kafka_Example_json", groupId="group_json",
			containerFactory="userKafkaListenerFactory")
	public void consumeJson(User user) {
		System.out.println("Consumed Json message : " + user);
	}
}