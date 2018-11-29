package ms.user.kafka.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import ms.user.model.User;

public class Sender {
    private static final Logger LOGGER = LoggerFactory.getLogger(Sender.class);

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    public void send(String topic, User payload) {
	LOGGER.info("sending payload='{}' to topic='{}'", payload, topic);
	kafkaTemplate.send(topic, payload);
    }
}
