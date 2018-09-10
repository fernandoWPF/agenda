package br.com.agenda.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.agenda.domain.Contact;
import br.com.agenda.dto.ContactRequestDTO;
import br.com.agenda.dto.ContactResponseDTO;
import br.com.agenda.dto.ContactResponseDTO.ContactResponseBuilder;
import br.com.agenda.repository.ContactRepository;

@Service
public class ContactServiceBean implements ContactService{

    @Autowired
    private ContactRepository repository;
    
    @Override
    public List<ContactResponseDTO> findByName(ContactRequestDTO request) {
        List<Contact> contacts = repository.findByName(request.getName());
        
        return contacts.stream()
                       .map(contact -> new ContactResponseBuilder()
                                   .withId(contact.getId())
                                   .withName(contact.getName())
                                   .withPhoto(contact.getPhoto())
                                   .withTelephone(contact.getTelephone())
                                   .build())
                       .collect(Collectors.toList());
                       
    }

}
