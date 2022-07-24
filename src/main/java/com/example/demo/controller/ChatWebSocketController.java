package com.example.demo.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatWebSocketController {
	@MessageMapping("/request")
	@SendTo("/chatResponse/{seq}")
	public String chatResponse(String message) {
		return message;
	}
}
