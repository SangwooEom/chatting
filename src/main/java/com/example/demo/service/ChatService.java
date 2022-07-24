package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ChattingRoom;
import com.example.demo.mapper.ChattingRoomMapper;

@Service
public class ChatService {
	@Autowired
	private ChattingRoomMapper chattingRoomMapper;
	
	public List<ChattingRoom> getChattingRoomList() {
		return this.chattingRoomMapper.findAll();
	}
	
	public int addChattingRoom(ChattingRoom chattingRoom) {
		return this.chattingRoomMapper.insert(chattingRoom);
	}
	
	public ChattingRoom getChattingRoom(long seq) {
		return this.chattingRoomMapper.findById(seq);
	}
}
