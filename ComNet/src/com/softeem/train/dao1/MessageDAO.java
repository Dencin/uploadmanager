package com.softeem.train.dao1;

import java.util.List;

import com.softeem.train.dto.MessageDTO;

public interface MessageDAO {

	List<MessageDTO> allMessages(int i);

	boolean addMessage(MessageDTO mt);

	int countpage();

	List<MessageDTO> allMessages1(int parseInt);

	MessageDTO findInfoById(int parseInt);

}
