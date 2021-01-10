package com.msfathi.messenger.resources;

import java.util.List;


import com.msfathi.messenger.model.MessageModel;
import com.msfathi.messenger.service.MessageService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/messages")
public class MessageResource {
	
	MessageService messageService=new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<MessageModel> getMessage(){
		
		System.out.println("messageresource is called");
		return messageService.getAllMessages();
		
	}

}
