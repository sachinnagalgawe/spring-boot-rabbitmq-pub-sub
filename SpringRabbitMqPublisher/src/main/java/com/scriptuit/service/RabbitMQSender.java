package com.scriptuit.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.scriptuit.model.Employee;

@Service
public class RabbitMQSender {
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${scriptuit.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${scriptuit.rabbitmq.routingkey}")
	private String routingkey;
	
	@Value("${scriptuit.rabbitmq.msgRoutingkey}")
	private String msgRoutingkey;
	
	public void send(Employee company) {
		amqpTemplate.convertAndSend(exchange, routingkey, company);
		System.out.println("Send msg = " + company);
	    
	}
	
	public void send(String msg) {
		amqpTemplate.convertAndSend(exchange, msgRoutingkey, msg);
		System.out.println("Send msg = " + msg);
	    
	}
}