package com.example.demo.controller;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatWebSocketController {
	@MessageMapping("/request/{seq}")
	@SendTo("/chatResponse/{seq}")
	public String chatResponse(String message, @DestinationVariable long seq) {
		return message;
	}
}
