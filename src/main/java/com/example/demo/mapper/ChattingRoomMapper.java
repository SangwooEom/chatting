package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.entity.ChattingRoom;

@Mapper
public interface ChattingRoomMapper {
	@Select("SELECT * FROM CHATTING_ROOM")
	public List<ChattingRoom> findAll();
	
	@Select("SELECT * FROM CHATTING_ROOM WHERE SEQ = #{seq}")
	public ChattingRoom findById(@Param("seq") long seq);
	
	@Insert("INSERT INTO CHATTING_ROOM(TITLE, ADMIN, CREATE_DATE) VALUES(#{title}, #{admin}, #{createDate})")
	public int insert(ChattingRoom chattingRoom);
}
