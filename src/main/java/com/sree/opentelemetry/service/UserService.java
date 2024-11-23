package com.sree.opentelemetry.service;

import com.sree.opentelemetry.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    Logger log = LoggerFactory.getLogger(UserService.class);

    public UserDTO getUserData(Integer id) {
        log.info("UserService getUserData by ID : {}", id);
        return new UserDTO(id, "Sreekanth", "s@gmail.com", "9087654321");
    }

}
