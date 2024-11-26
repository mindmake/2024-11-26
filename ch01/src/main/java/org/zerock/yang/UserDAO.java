package org.zerock.yang;

public class UserDAO {
	
	//1.회원가입(user 테이블에 한행 추가)
	public void insertUser(UserVO vo) {
		//1.DB연결
		//2.행추가
		System.out.println("db에 잘연결후 한행을 잘 쓴거로 합시다.");
	}
	
		
	//2.id 중복확인 (T-중복, F-신규)
	public boolean isID(String id) {
		//1.DB연결
		//2.id로 조회
		//3.결과가 있으면(행이있으면) true, 없으면 false
		
		System.out.println("가입하는 id가 신규아이디로 합시다.");
		return false;
	}
}
