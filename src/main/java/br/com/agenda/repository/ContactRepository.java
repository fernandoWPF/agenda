package br.com.agenda.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.agenda.domain.Contact;

@Repository
public interface ContactRepository extends MongoRepository<Contact, String> {

    List<Contact> findByName(String name);

}
