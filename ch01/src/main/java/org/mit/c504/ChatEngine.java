package org.mit.c504;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ChatEngine {
	
	public String aaa(String msg) {
		String ans=null;
		if(msg.contains("안녕")) {
			ans="안녕하세요^^ 무엇이든지 물어보세요";
		}else if(msg.contains("누구")) {
			ans="저는 최점단 인공지능 챗봇입니다.";			
		}else if(msg.contains("바보") || msg.contains("멍청")) {
			ans="니가 더 바보 멍청이야!^^";
		}else if(msg.contains("날씨")) {
			ans="오늘의 날씨는 실시간으로 기상청 확인결과 눈이 올수도 있데요.";			
		}else if(msg.contains("html")) {
			ans="인터넷 브라우저에서 웹페이지를 띄워주는 파일입니다.";
		}else if(msg.contains("?")) {
			ans=msg+"관하여 검색합니다.";
		}else if(msg.contains("!")) {
			ans="맞습니다!";
		}else if(msg.contains("시간")) {
			LocalDateTime now = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			String formattedNow = now.format(formatter);			
			ans="현재 시간: " + formattedNow;
		}else {
			ans="제가 대답할수 없는 내용입니다.";
		}
		return ans;
	}
	
}
