package com.demoProject.rabbitmqmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = MQconfig.QUEUE)
    public void listener(CustomMessage message){
        System.out.println(message);
    }

}
