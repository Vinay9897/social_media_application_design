package com.social.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.model.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {
	
	public List<Message> findByChatId(Integer chatId);
	
}