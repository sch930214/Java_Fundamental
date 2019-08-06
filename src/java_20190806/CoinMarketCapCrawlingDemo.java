package java_20190806;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import bonus.Utility;


public class CoinMarketCapCrawlingDemo {
	public static void main(String[] args) {
		
		String url = "https://coinmarketcap.com/currencies/bitcoin/historical-data/?start=20190701&end=20190806";
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Date\tOpen\tHigh\tLow\tClose\tVolume\tMarket Cap");
		//클래스가 한 줄에 2개 있으면 공백 없이, 두 줄이면 공백 있게
		//클래스 앞에는. 붙이고 element앞에는 공백
		Elements bodyElements = doc.select(".table-responsive .table tbody tr"); 
		//System.out.println(bodyElements.size());
		
		HSSFWorkbook workbook = new HSSFWorkbook();// 새 엑셀파일 생성
		HSSFSheet sheet = workbook.createSheet("새파일");//새 시트 생성
		HSSFRow row = null;
		HSSFCell cell = null;
		
		row = sheet.createRow(0);
		
		cell = row.createCell(0);
		cell.setCellValue("Date");
		cell = row.createCell(1);
		cell.setCellValue("Open");
		cell = row.createCell(2);
		cell.setCellValue("High");
		cell = row.createCell(3);
		cell.setCellValue("Low");
		cell = row.createCell(4);
		cell.setCellValue("Close");
		cell = row.createCell(5);
		cell.setCellValue("Volume");
		cell = row.createCell(6);
		cell.setCellValue("Market Cap");
		

		
		
		for (int i = 0; i < bodyElements.size(); i++) {
			int index = 0;
			Element trElement = bodyElements.get(i);
			String date = trElement.child(index++).text();
			date = Utility.getKoreanDate(date);       //**********************
			String open = trElement.child(index++).text();
			String high = trElement.child(index++).text();
			String low = trElement.child(index++).text();
			String close = trElement.child(index++).text();
			String volume = trElement.child(index++).text();
			String marketCap = trElement.child(index++).text();
			
//			Element dateElement = trElement.child(0);
//			String date = dateElement.text();
//			
//			//Element openElement = trElement.child(1);
//			String open = trElement.child(1).text();      //두 줄을 한 줄로
//			
//			Element highElement = trElement.child(2);
//			String high = highElement.text();
//			
//			Element lowElement = trElement.child(3);
//			String low = lowElement.text();
//			
//			String close = trElement.child(4).text();
//			String volume = trElement.child(5).text();
//			String marketCap = trElement.child(6).text();
			
			row = sheet.createRow(i+1);
			
			cell = row.createCell(0);
			cell.setCellValue(date);
			cell = row.createCell(1);
			cell.setCellValue(open);
			cell = row.createCell(2);
			cell.setCellValue(high);
			cell = row.createCell(3);
			cell.setCellValue(low);
			cell = row.createCell(4);
			cell.setCellValue(close);
			cell = row.createCell(5);
			cell.setCellValue(volume);
			cell = row.createCell(6);
			cell.setCellValue(marketCap);
			
			//System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s%n",date,open,high,low,close,volume,marketCap);
			
		}
		
		try {
			FileOutputStream fos = new FileOutputStream("c:\\dev\\test\\crawling.xls");
			workbook.write(fos);

			fos.close();
			workbook.close();
			System.out.println("성공!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
