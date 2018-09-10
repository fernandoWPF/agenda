package br.com.agenda.service;

import java.util.List;

import br.com.agenda.dto.ContactRequestDTO;
import br.com.agenda.dto.ContactResponseDTO;

public interface ContactService {

    List<ContactResponseDTO> findByName(ContactRequestDTO request);

}
