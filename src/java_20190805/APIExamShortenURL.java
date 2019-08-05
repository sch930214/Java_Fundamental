package java_20190805;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import bonus.Utility;

public class APIExamShortenURL {
	public static void main(String[] args) {
		String clientID = "N10mvM_tj8wds6KCavEo";
		String clientSecret = "v6IlK3gTOt";
		String oriUrl = "https://docs.google.com/spreadsheets/d/1AEbbhYgDMouucbzE4OOxLUXoYLMr2nNyWqE4wq3rTeU/edit#gid=0";
		String url = Utility.getShortenURL(clientID, clientSecret, oriUrl);
		// System.out.println(url);
		if (Utility.isQrcode(url, 300, 300)) {
			System.out.println("QRCode 이미지 생성 성공");
		} else {
			System.out.println("QRCode 이미지 생성 실패");

		}

	}
}