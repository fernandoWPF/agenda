package br.com.agenda.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.agenda.dto.ContactRequestDTO;
import br.com.agenda.dto.ContactResponseDTO;
import br.com.agenda.service.ContactService;

@RestController
public class ContactController {

    @Autowired
    private ContactService service;
    
    @PostMapping(value = "/api/v1/find", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody List<ContactResponseDTO> findByName(@Valid @RequestBody ContactRequestDTO request){
        return service.findByName(request);
    }
    
}