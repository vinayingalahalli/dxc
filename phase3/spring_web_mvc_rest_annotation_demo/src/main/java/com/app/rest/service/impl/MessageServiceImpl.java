package com.app.rest.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.app.rest.model.Message;
import com.app.rest.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {

	private static int count;
	@Override
	public Message addMessage(Message message) {
		message.setId(++count);
		messageMap.put(count, message);
		return message;
	}

	@Override
	public Message getMessageById(int id) {
		
		return messageMap.get(id);
	}

	@Override
	public List<Message> getAllMessages() {
		List<Message> messageList=new ArrayList<>(messageMap.values());
		return messageList;
	}

	@Override
	public Message updateMessage(Message message) {
		messageMap.put(message.getId(), message);
		return message;
	}

	@Override
	public void deleteMessageById(int id) {
		messageMap.remove(id);
		
	}

	@Override
	public List<Message> getMessagesBySenderName(String sentBy) {
		List<Message> messageList=new ArrayList<>();
		for(Map.Entry<Integer, Message> e:messageMap.entrySet()) {
			if(e.getValue().getSentBy().equalsIgnoreCase(sentBy)) {
				messageList.add(e.getValue());
			}
		}
		return messageList;
	}

}
