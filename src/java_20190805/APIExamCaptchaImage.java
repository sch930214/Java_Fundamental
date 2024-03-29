package java_20190805;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class APIExamCaptchaImage {
	 public static void main(String[] args) {
	        String clientId = "SRS6tlSbPSUSQk23JVOK";//애플리케이션 클라이언트 아이디값";
	        String clientSecret = "a_i6h0A2BR";//애플리케이션 클라이언트 시크릿값";
	        try {
	            String key = "jMGypeiY2SQsMTej"; // https://openapi.naver.com/v1/captcha/nkey 호출로 받은 키값
	            String apiURL = "https://openapi.naver.com/v1/captcha/ncaptcha.bin?key=" + key;
	            URL url = new URL(apiURL);
	            HttpURLConnection con = (HttpURLConnection)url.openConnection();
	            con.setRequestMethod("GET");
	            con.setRequestProperty("X-Naver-Client-Id", clientId);
	            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
	            int responseCode = con.getResponseCode();
	            BufferedReader br;
	            if(responseCode==200) { // 정상 호출
	                InputStream is = con.getInputStream();
	                int read = 0;
	                byte[] bytes = new byte[1024];
	                // 랜덤한 이름으로 파일 생성
	                String tempname = Long.valueOf(new Date().getTime()).toString(); //=new Date().getTime()+""; //=String.valueOf(new Date().getTime());
	                String path = "c:\\dev\\test"; //여러분 환경에 맞게 절대경로를 입력해주세요.
	                File f = new File(path,tempname + ".jpg");
	                f.createNewFile();
	                OutputStream outputStream = new FileOutputStream(f);
	                while ((read =is.read(bytes)) != -1) {
	                    outputStream.write(bytes, 0, read);
	                }
	                is.close();
	            } else {  // 에러 발생
	                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
	                String inputLine;
	                StringBuffer response = new StringBuffer();
	                while ((inputLine = br.readLine()) != null) {
	                    response.append(inputLine);
	                }
	                br.close();
	                System.out.println(response.toString());
	            }
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
}


