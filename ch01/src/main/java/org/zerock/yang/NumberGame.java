package org.zerock.yang;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		//숫자 맞추기 게임
		
		Scanner scanner = new Scanner(System.in);
		//1부터 100까지 숫자를 램덤 생성
		int random =  (int) ((Math.random() * 100) +1);
		int user = 0; // 사용자 입력 숫자
		int usertry = 0; // 시도 횟수
		
		System.out.println("숫자 맞추기 게임에 온것을 환영합니다.");
		System.out.println("1~100 사이 숫자를 10번 안에 맞춰");
		
		// 정답을 맞출때까지 반복
		while (user!= random) {
			System.out.println("숫자를 입력해라!(시도횟수:"+usertry+")");
			user = scanner.nextInt(); //  사용자 입력
			usertry ++; //시도 횟수 증가
			
			if(usertry==10) {
				System.out.println("틀렸어! 넌 안되겠다!");
				break;
			}
			
			if(user > random ) {
				System.out.println("입력한 숫자가 더 커!");
			} else if(user < random) {
				System.out.println("입력한 숫자가 더 작아!");
			} else {
				System.out.println("정답이다!"+"\n정답 시도 횟수:"+usertry);
			}
		}
	}

}
