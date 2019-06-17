package com.lzcge.Service;

import com.lzcge.Entity.User;

import java.util.List;

public interface UserService {

	public List<User> findUser();

	public void inserUser(User user);
}
