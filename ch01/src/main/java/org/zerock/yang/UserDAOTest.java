package org.zerock.yang;

public class UserDAOTest {

	public static void main(String[] args) {
		UserDAO dao = new UserDAO();
		dao.isID("aaa");
		dao.insertUser(new UserVO());

	}

}
