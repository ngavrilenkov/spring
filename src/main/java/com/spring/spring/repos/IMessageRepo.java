package com.spring.spring.repos;

import com.spring.spring.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IMessageRepo extends CrudRepository<Message, Integer> {

    List<Message> findByTag(String tag);
}
