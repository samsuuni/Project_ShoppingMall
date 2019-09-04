package shopping.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import shopping.mapper.UserMapper;

@Repository("userDao")
public class UserDAOImpl implements UserDAO{

	@Autowired
	private UserMapper userMapper;
	
}
