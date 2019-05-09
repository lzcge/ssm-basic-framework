package com.lzcge.Mapper;

import com.lzcge.Entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {
	public List<User> findUser();
}
