package com.app.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.rest.model.Message;
import com.app.rest.service.MessageService;

@RestController
public class MessageController  {

	@Autowired
	private MessageService service;
	
	@PostMapping("/message")
	public Message addMessage(@RequestBody Message message) {
		
		return service.addMessage(message);
	}

	@GetMapping("/message/{id}")
	public Message getMessageById(@PathVariable int id) {
	
		return service.getMessageById(id);
	}

	@GetMapping("/messages")
	public List<Message> getAllMessages() {
		
		return service.getAllMessages();
	}

	@PutMapping("/message")
	public Message updateMessage(@RequestBody Message message) {
		
		return service.updateMessage(message);
	}

	@DeleteMapping("/message/{id}")
	public void deleteMessageById(@PathVariable int id) {
		service.deleteMessageById(id);
		
	}

	@GetMapping("/messages/{sentBy}")
	public List<Message> getMessagesBySenderName(@PathVariable String sentBy) {
		
		return service.getMessagesBySenderName(sentBy);
	}

}
