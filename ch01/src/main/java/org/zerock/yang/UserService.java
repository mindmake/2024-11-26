package org.zerock.yang;

public class UserService {
	//true-회원가입 성공, false-회원가입 실패(아이디중복)
	boolean insertUser(UserVO vo) {
		UserDAO dao = new UserDAO();
		if( dao.isID( vo.getId() ) ) {
			return false;
		}else {
			dao.insertUser(vo);
			return true;
		}	
	}
}
