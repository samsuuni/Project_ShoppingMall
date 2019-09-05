package shopping.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import shopping.mapper.UserMapper;
import shopping.vo.UserVO;

@Repository("userDao")
public class UserDAOImpl implements UserDAO{

	@Autowired
	private UserMapper userMapper;
	
//	@Autowired
	SqlSession sqlSession;
	//회원 정보 업데이트
	@Override
	public void updateUser(UserVO user) {
		userMapper.updateUser(user);
	}
	//회원 삭제
	@Override
	public void deleteUser(int id) {
		userMapper.deleteUser(id);
	}
	//회원 가입
	@Override
	public void insertUser(UserVO user) {
		userMapper.insertUser(user);
	}
	//회원 정보(one)
	@Override
	public UserVO selectOne(String email) {
		return userMapper.selectOne(email);
	}
	//회원 정보(all)
	@Override
	public List<UserVO> selectAll() {
		return userMapper.selectAll();
	}
	//로그인 체크
	@Override
	public boolean loginCheck(UserVO user) {
		String name = sqlSession.selectOne("user.loginCheck", user);
		return (name == null)? false : true;
	}
	//로그인 정보
	@Override
	public UserVO viewUser(UserVO user) {
		return sqlSession.selectOne("user.viewUser", user);
	}
	//로그아웃
	@Override
	public void logout(HttpSession session) {
		session.removeAttribute("login");
		session.invalidate();
	}
	
}
