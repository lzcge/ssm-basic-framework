package com.lzcge.ServiceImpl;


import com.lzcge.Entity.User;
import com.lzcge.Mapper.UserMapper;
import com.lzcge.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public List<User> findUser() {
		return userMapper.findUser();
	}
}
