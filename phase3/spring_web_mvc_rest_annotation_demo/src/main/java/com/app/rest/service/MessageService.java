package com.app.rest.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.app.rest.model.Message;

public interface MessageService {

	public static Map<Integer, Message> messageMap=new HashMap<>();
	public Message addMessage(Message message);
	public Message getMessageById(int id);
	public List<Message> getAllMessages();
	public Message updateMessage(Message message);
	public void deleteMessageById(int id);
	public List<Message> getMessagesBySenderName(String sentBy);
}
