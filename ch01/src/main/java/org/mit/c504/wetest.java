package org.mit.c504;

	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.net.HttpURLConnection;
	import java.net.URL;

	public class wetest {
	    public static void main(String[] args) {
	        String apiKey = "YOUR_API_KEY"; // OpenWeatherMap API 키 입력
	        String city = "Seoul"; // 조회할 도시 이름
	        String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";

	        try {
	            // API 요청
	            URL url = new URL(apiUrl);
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	            connection.setRequestMethod("GET");

	            // 응답 처리
	            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	            StringBuilder response = new StringBuilder();
	            String line;
	            while ((line = reader.readLine()) != null) {
	                response.append(line);
	            }
	            reader.close();

	            // 출력
	            System.out.println("날씨 데이터: " + response.toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}



