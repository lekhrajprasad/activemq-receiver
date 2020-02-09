package com.lpras.jmsamq.listener;

import com.lpras.email.service.EmailService;
import com.lpras.jmsamq.model.Email;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.*;

@Component
@EnableJms
public class EmailMessageListener {
    private final Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

    @Autowired
    private Queue queue;

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private EmailService emailService;

    /*public boolean receiveEmptyMessage() throws JMSException{
        ObjectMessage message = (ObjectMessage)jmsTemplate.receive(queue);
        Email email = (Email)message.getObject();
        logger.info("Message received {} ",email);
        return true;
    }*/

    @JmsListener(destination = "email-test-queue")
    public void listener(ObjectMessage message) throws JMSException {
       // if(message instanceof ObjectMessage){
           // ObjectMessage om = (ObjectMessage)message;
            Email email = (Email)message.getObject();
            logger.info("Message received {} ",email);

        }
    //}

   // @JmsListener(destination = "email-test-queue")
    public void listener(Message message) throws JMSException {

    }
}
