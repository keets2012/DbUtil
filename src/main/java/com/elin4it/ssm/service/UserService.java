package com.elin4it.ssm.service;

import com.elin4it.ssm.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserService {

    List<User> findUser()throws Exception;
}
