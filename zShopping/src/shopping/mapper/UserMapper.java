package shopping.mapper;

import java.util.List;

import shopping.vo.UserVO;

@MyMapper
public interface UserMapper {
	public int insertUser(UserVO user);
	public void updateUser(UserVO user);
	public void deleteUser(int id);
	public UserVO selectOne(String email);
	public List<UserVO> selectAll();
	public void loginCheck(UserVO user);
	public void viewUser(UserVO user);
	public void emailCheck(String email);
}
