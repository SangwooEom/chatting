package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ChattingRoom;
import com.example.demo.service.ChatService;

@RestController
public class ChatRestController {
	@Autowired
	private ChatService chatService;
	
	@RequestMapping(value="/chattingRoom/list", method=RequestMethod.GET)
	public List<ChattingRoom> getChattingRoomList() {
		return this.chatService.getChattingRoomList();
	}
	
	@RequestMapping(value="/chattingRoom/add", method=RequestMethod.POST)
	public int addChattingRoom(@RequestBody ChattingRoom chattingRoom) {
		return this.chatService.addChattingRoom(chattingRoom);
	}
	
	@RequestMapping(value="/chattingRoom/detail/{seq}", method=RequestMethod.GET)
	public ChattingRoom getChattingRoom(@PathVariable("seq") long seq) {
		return this.chatService.getChattingRoom(seq);
	}
}
