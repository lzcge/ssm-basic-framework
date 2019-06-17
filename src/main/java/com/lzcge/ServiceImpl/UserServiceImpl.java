package com.lzcge.ServiceImpl;


import com.lzcge.Common.Util.BSUtil;
import com.lzcge.Entity.User;
import com.lzcge.Mapper.UserMapper;
import com.lzcge.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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



	/**
	 * 全局异常处理通过这种方式
	 */
	//@Transactional
	//BSUtil.isTrue(false,"错误信息");
	@Transactional
	@Override
	public void inserUser(User user) {
		// some database options

		//手动构造错误信息
		BSUtil.isTrue(false,"错误信息");
	}

}
