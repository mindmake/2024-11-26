package org.zerock.yang;

public class BuildVOTest {

	public static void main(String[] args) {
		//롬복을 이용한 builder 객체 생성
		BuildVO vo = BuildVO.builder().name("aa").hp(0).build();
		
		

	}

}
