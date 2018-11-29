package eu.dreamix.ms.repository;

import org.springframework.data.repository.CrudRepository;

import eu.dreamix.ms.entity.Mail;

public interface MailRepository extends CrudRepository<Mail, Long> {

}