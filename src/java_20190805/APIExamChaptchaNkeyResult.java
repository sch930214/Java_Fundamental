package java_20190805;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class APIExamChaptchaNkeyResult {
	 public static void main(String[] args) {
	        String clientId = "SRS6tlSbPSUSQk23JVOK";//애플리케이션 클라이언트 아이디값";
	        String clientSecret = "a_i6h0A2BR";//애플리케이션 클라이언트 시크릿값";
	        try {
	            String code = "1"; // 키 발급시 0,  캡차 이미지 비교시 1로 세팅
	            String key = "zvJ8Wj5B2v6wCQ5w"; // 캡차 키 발급시 받은 키값
	            String value = "7yfs6kx"; // 사용자가 입력한 캡차 이미지 글자값
	            String apiURL = "https://openapi.naver.com/v1/captcha/nkey?code=" + code +"&key="+ key + "&value="+ value;

	            URL url = new URL(apiURL);
	            HttpURLConnection con = (HttpURLConnection)url.openConnection();
	            con.setRequestMethod("GET");
	            con.setRequestProperty("X-Naver-Client-Id", clientId);
	            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
	            int responseCode = con.getResponseCode();
	            BufferedReader br;
	            if(responseCode==200) { // 정상 호출
	                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
	            } else {  // 에러 발생
	                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
	            }
	            String inputLine;
	            StringBuffer response = new StringBuffer();
	            while ((inputLine = br.readLine()) != null) {
	                response.append(inputLine);
	            }
	            br.close();
	            System.out.println(response.toString());
	            
	            JSONParser jsonParse = new JSONParser();
	            JSONObject jsonObj = (JSONObject) jsonParse.parse(response.toString());
	            String result = String.valueOf((Boolean)jsonObj.get("result"));
	            response.setLength(0);
	            response.append(key);
	            System.out.println(key);
	            
	            
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
}
