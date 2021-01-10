package com.msfathi.messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.msfathi.messenger.model.MessageModel;

public class MessageService {

	public List<MessageModel> getAllMessages() {
		MessageModel m1=new MessageModel (1L,"helloWorld", "fathi1");
		MessageModel m2=new MessageModel (2L,"hello", "fathi");
		List<MessageModel> list=new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
	}

	
}
