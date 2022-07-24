DROP TABLE IF EXISTS CHATTING_ROOM;

CREATE TABLE CHATTING_ROOM (
	SEQ INT8 NOT NULL AUTO_INCREMENT,
	TITLE VARCHAR(300) NOT NULL,
	ADMIN VARCHAR(30) NOT NULL,
	CREATE_DATE DATETIME NOT NULL,
	CONSTRAINT CHATTIMG_ROOM_PK PRIMARY KEY(SEQ)
);